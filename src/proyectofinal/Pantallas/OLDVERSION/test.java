/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.Pantallas.OLDVERSION;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.MouseInputListener;
import org.json.JSONArray;

import org.json.JSONObject;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import proyectofinal.Entidades.DataPA;
import proyectofinal.Entidades.PuntoDeAbastecimiento;
import proyectofinal.Entidades.SetPuntoDeAbastecimiento;
import proyectofinal.Entidades.UserClient;

public class test extends JPanel {

    private JXMapViewer mapViewer;
    private JTextField textField;
    private JButton resetButton;
    private javax.swing.Timer timer;
    private boolean isSearching = false;
    private static Set<PuntoDeAbastecimiento> waypoints = new HashSet<>();
    private static WaypointPainter<PuntoDeAbastecimiento> waypointPainter = new SetPuntoDeAbastecimiento();

    public test() {
        setLayout(new BorderLayout());

        // Crear el JXMapViewer
        mapViewer = new JXMapViewer();

        // Configurar el TileFactory
        OSMTileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        mapViewer.setTileFactory(tileFactory);

        // Configurar la ubicación inicial del mapa
        GeoPosition geo = new GeoPosition(-12.0464, -77.0428); // Coordenadas de Lima, Perú
        mapViewer.setZoom(7);
        mapViewer.setAddressLocation(geo);

        // Crear el JTextField
        textField = new JTextField(20);
        textField.setBounds(10, 10, 200, 30); // Establecer el tamaño y la posición del JTextField
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String address = textField.getText();
                if (!address.isEmpty()) {
                    isSearching = true; // Marcar que estamos en modo búsqueda
                    fetchAndDisplayPoints(address); // Fetch points based on the search
                }
            }
        });

        // Crear el botón de restablecer
        resetButton = new JButton("Restablecer");
        resetButton.setBounds(220, 10, 100, 30); // Establecer el tamaño y la posición del botón
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isSearching = false; // Marcar que ya no estamos en modo búsqueda
                textField.setText(""); // Limpiar el campo de texto
                fetchAndDisplayPoints(null); // Llamar para restablecer los puntos originales
            }
        });

        // Crear un JLayeredPane y agregar el mapViewer, JTextField y el botón
        JLayeredPane layeredPane = new JLayeredPane();
        mapViewer.setBounds(0, 0, 800, 600); // Establecer el tamaño del mapViewer
        layeredPane.add(mapViewer, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(textField, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(resetButton, JLayeredPane.PALETTE_LAYER);

        // Asegúrate de que el JLayeredPane tenga el tamaño adecuado
        layeredPane.setPreferredSize(new Dimension(800, 600));

        // Agregar el layeredPane al panel
        add(layeredPane, BorderLayout.CENTER);

        MouseInputListener mia = new PanMouseInputListener(mapViewer);
        addMouseListener(mia);
        addMouseMotionListener(mia);
        addMouseWheelListener(new ZoomMouseWheelListenerCursor(mapViewer));

        // Inicializar el temporizador
        timer = new javax.swing.Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isSearching) {
                    new SwingWorker<JSONObject, Void>() {
                        @Override
                        protected JSONObject doInBackground() throws Exception {
                            return UserClient.getPuntos();
                        }

                        @Override
                        protected void done() {
                            try {
                                JSONObject response = get();
                                if (response != null && response.getBoolean("success")) {
                                    updateWaypoints(response);
                                } else {
                                    System.out.print("Error: " + response.getString("message"));
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                    }.execute();
                }
            }
        });
        timer.start(); // Comenzar el temporizador
        
        waypointPainter.setWaypoints(waypoints);
        mapViewer.setOverlayPainter(waypointPainter);
    }

    private void fetchAndDisplayPoints(String address) {
        new SwingWorker<JSONObject, Void>() {
            @Override
            protected JSONObject doInBackground() throws Exception {
                if (address == null) {
                    return UserClient.getPuntos();
                } else {
                    return UserClient.getPuntosByKey(address);
                }
            }

            @Override
            protected void done() {
                try {
                    JSONObject response = get();
                    if (response != null && response.getBoolean("success")) {
                        updateWaypoints(response);
                    } else {
                        System.out.print("Error: " + response.getString("message"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }.execute();
    }

    public void updateWaypoints(JSONObject listaJson) {
        try {
            JSONArray data = listaJson.getJSONArray("datos");

            Set<PuntoDeAbastecimiento> newWaypoints = new HashSet<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject jsonObject = data.getJSONObject(i);
                double lat = jsonObject.getDouble("lat");
                double lon = jsonObject.getDouble("lon");
                String distrito = jsonObject.getString("distrito");
                String estructura = jsonObject.getString("estructura");
                String direccion = jsonObject.getString("direccion");
                String codigo = jsonObject.getString("codigo");

                GeoPosition position = new GeoPosition(lat, lon);
                DataPA dataPA = new DataPA(distrito, estructura, direccion, codigo);
                PuntoDeAbastecimiento punto = new PuntoDeAbastecimiento(codigo, position, dataPA);
                newWaypoints.add(punto);
            }

            waypoints.clear();
            waypoints.addAll(newWaypoints);
            waypointPainter.setWaypoints(waypoints);

            this.repaint();

            this.removeAll();
            for (PuntoDeAbastecimiento w : waypoints) {
                this.add(w.getLabel());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mapa con Campo de Texto y Actualización Automática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        test mapWithSearchAndAutoUpdate = new test();
        frame.add(mapWithSearchAndAutoUpdate);

        frame.setVisible(true);
    }
}
