/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinal.Pantallas;

/**
 *
 * @author Home
 */
public class PantallaHome extends javax.swing.JPanel {

    /**
     * Creates new form HOMEFORM
     */
    public PantallaHome() {
        initComponents();
        crearMapa.iniciarMapa();
        this.setSize(this.getWidth(), 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearMapa = new proyectofinal.Mapa.CrearMapa();

        javax.swing.GroupLayout crearMapaLayout = new javax.swing.GroupLayout(crearMapa);
        crearMapa.setLayout(crearMapaLayout);
        crearMapaLayout.setHorizontalGroup(
            crearMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        crearMapaLayout.setVerticalGroup(
            crearMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyectofinal.Mapa.CrearMapa crearMapa;
    // End of variables declaration//GEN-END:variables

}
