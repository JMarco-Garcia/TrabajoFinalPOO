/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.Mapa;

import java.util.ArrayList;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.viewer.TileFactory;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
import proyectofinal.Entidades.DataPA;
import proyectofinal.Entidades.PuntoDeAbastecimiento;
import proyectofinal.Entidades.PuntoDeAbastecimiento;
import proyectofinal.Entidades.PuntoDeAbastecimientoML;
import proyectofinal.Entidades.SetPuntoDeAbastecimiento;

public class CrearMapa extends JXMapViewer{

    public CrearMapa() {

    }

    public void iniciarMapa() {
        List<TileFactory> estilosMapa = new ArrayList<>();
        //Crear dos estilos de mapa
        estilosMapa(estilosMapa);
        TileFactory tilePrincipal = estilosMapa.get(0);
        setTileFactory(tilePrincipal);
        // Establecer posicion de Lima
        GeoPosition lima = new GeoPosition(-12.0089248,-76.9715627);
        // sjl puntos de abastecimientos
        GeoPosition p1 = new GeoPosition(-12.007904778945383, -76.99299934676588);
        DataPA sjl1 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "Urb. Inca Manco Cápac AAHH Palomares (costado de la fábrica de Celima)",
                "CR-209");
        
        GeoPosition p2 = new GeoPosition(-11.9989974,-77.0042875);
        DataPA sjl2 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "FTE MZ P1 LOT 28 URB. SAN HILARION -",
                "CR-213");
        
        GeoPosition p3 = new GeoPosition(-11.95500248112223, -76.99800073829809);
        DataPA sjl3 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "FRENTE A MZ C LOTE 09, AH. 22 DE NOVIEMBRE",
                "CR-299");
        
        GeoPosition p4 = new GeoPosition(-11.926989491072082, -76.98901073349292);
        DataPA sjl4 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "MZ U LOT 6C CERRITO SAN CRISTOBAL 5TA ETAPA J. CARLOS MARITEGUI",
                "CR-365");
        
        GeoPosition p5 = new GeoPosition(-11.929989491185442, -76.99301073349287);
        DataPA sjl5 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "Av. Pampa Alta (parte alta cerro), AH. José c Mariátegui V etapa Cerrito La Libertad",
                "CR-152");
        
        GeoPosition p6 = new GeoPosition(-11.974989492888994, -77.01500000465585);
        DataPA sjl6 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "AV AMANCAES ESQ CA AMANCAES URB CANTO BELLO",
                "CR-194");
        
        GeoPosition p7 = new GeoPosition(-11.93901048503357, -77.01100000465657);
        DataPA sjl7 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "MZ L LOTE 06, SECTOR AMPLIACIÓN CRISTO REY, SAÚL CANTORAL",
                "CR-376");
        
        GeoPosition p8 = new GeoPosition(-11.948999988270582, -76.99000000465641);
        DataPA sjl8 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "FTE. MZ \"E\" LTE. 7, AH. VISTA ALEGRE.(AMPL.10 DE OCTUBRE)",
                "CR-389");
        
        GeoPosition p9 = new GeoPosition(-11.960998883555224, -76.99300325984763);
        DataPA sjl9 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "FTE AL COLEGIO FE Y ALEGRÍA N° 26- MZ 38",
                "CR-056");
        
        GeoPosition p10 = new GeoPosition(-11.939020981786914, -76.99602146232874);
        DataPA sjl10 = new DataPA("san juan de lurigancho", 
                "camara rebombeo",
                "FTE MZ M1 LOT 5 S.S. JUAN PABLO II",
                "CR-122");
        //
        
        
        
        setZoom(8);
        interaccion();
        setAddressLocation(lima);
        
         // Create waypoints from the geo-positions
        Set<PuntoDeAbastecimiento> waypoints = new HashSet<PuntoDeAbastecimiento>(Arrays.asList(
            new PuntoDeAbastecimiento("gaaa", p1, sjl1),
            new PuntoDeAbastecimiento("waaas", p2, sjl2),
            new PuntoDeAbastecimiento("waaas", p3, sjl3),
            new PuntoDeAbastecimiento("waaas", p4, sjl4),
            new PuntoDeAbastecimiento("waaas", p5, sjl5),
            new PuntoDeAbastecimiento("waaas", p6, sjl6),
            new PuntoDeAbastecimiento("waaas", p7, sjl7),
            new PuntoDeAbastecimiento("waaas", p8, sjl8),
            new PuntoDeAbastecimiento("waaas", p9, sjl9),
            new PuntoDeAbastecimiento("waaas", p10, sjl10)
        ));
        // Set the overlay painter
        WaypointPainter<PuntoDeAbastecimiento> swingWaypointPainter = new SetPuntoDeAbastecimiento();
        swingWaypointPainter.setWaypoints(waypoints);
        this.setOverlayPainter(swingWaypointPainter);

        // Add the JButtons to the map viewer
        for (PuntoDeAbastecimiento w : waypoints) {
            this.add(w.getLabel());
        }

    }

    public void estilosMapa(List<TileFactory> estilosMapa) {
        TileFactoryInfo tile1 = new OSMTileFactoryInfo();
        TileFactoryInfo tile2 = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        // Añadir los estilos a la lista
        estilosMapa.add(new DefaultTileFactory(tile1));
        estilosMapa.add(new DefaultTileFactory(tile2));
        
    }
    public void interaccion(){
        MouseInputListener mia = new PanMouseInputListener(this);
        addMouseListener(mia);
        addMouseMotionListener(mia);
        addMouseWheelListener(new ZoomMouseWheelListenerCursor(this));
    }
    
    
}
