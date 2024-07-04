package proyectofinal.panel;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class PanelBorder extends javax.swing.JPanel {

    public PanelBorder() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        // Crear una copia del objeto Graphics y convertirlo a Graphics2D
        Graphics2D g2 = (Graphics2D) grphcs.create();

        // Habilitar el antialiasing para mejorar la calidad de renderizado
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Crear un área con bordes redondeados del tamaño del componente
        Area mainArea = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        // Establecer el color de fondo y rellenar el área redondeada
        g2.setColor(getBackground());
        g2.fill(mainArea);

        // Restar una parte del área para crear un efecto visual con un área inferior más grande
        mainArea.subtract(new Area(new Rectangle2D.Double(0, 0, getWidth(), getHeight() - 5)));
        // Establecer un degradado de color y rellenar la parte restante del área
        g2.setPaint(new GradientPaint(0, 0, Color.decode("#5CB5E0"), getWidth(), 0, Color.decode("#007046")));
        g2.fill(mainArea);

        // Liberar los recursos del objeto Graphics2D
        g2.dispose();

        // Llamar al método de la superclase para asegurar que se pinten los demás componentes
        super.paintComponent(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
