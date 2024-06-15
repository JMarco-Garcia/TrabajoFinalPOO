/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.Entidades;

import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PuntoDeAbastecimiento extends DefaultWaypoint{
    private JLabel label;
    private ImageIcon icono;
    private DataPA data;

    public PuntoDeAbastecimiento(String texto, GeoPosition coordenada, DataPA data){
        super(coordenada);
        icono = new ImageIcon("src/imagen/iconoAguaNT.png");
        label = new JLabel(texto);
        label.setIcon(icono);
        label.repaint();
        label.setSize(24,24);
        label.setPreferredSize(new Dimension(24,24));
        label.addMouseListener(new PuntoDeAbastecimientoML(data, texto, label));
        this.data = data;
    }

    public JLabel getLabel() {
        return label;
    }

    public DataPA getData() {
        return data;
    }

   
    
}
