/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.Pantallas;

import java.awt.Color;
import javax.swing.SwingUtilities;
import proyectofinal.Entidades.MoveJFrame;
import proyectofinal.Entidades.UserClient;
import proyectofinal.Pantallas.LoginyRegistro.Pantallalogin;
import proyectofinal.Pantallas.LoginyRegistro.Pantallaregistro;

/**
 *
 * @author marco
 */
public class AntVersion extends MoveJFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public AntVersion() {
        initComponents();
        boolean check = UserClient.isLoggedIn();
        btnFav.setVisible(check);
        //btnFilD.setVisible(check);
        btnEdit.setVisible(check);
        this.setSize(this.getWidth(), 700);
        
        crearMapa.iniciarMapa();
        this.setLocationRelativeTo(this);
    }

    public int getxBtnFav() {
        return btnFav.getX();
    }

    public int getyBtnFav() {
        return btnFav.getY();
    }

    public int getxBtnFilD() {
        return btnFilD.getX();
    }

    public int getyBtnFilD() {
        return btnFilD.getY();
    }

    public int getxBtnEdit() {
        return btnEdit.getX();
    }

    public int getyBtnEdit() {
        return btnEdit.getY();
    }

    /*public int getxBtnIniSesion() {
        return btnIniSesion.getX();
    }

    public int getyBtnIniSesion() {
        return btnIniSesion.getY();
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnFav = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFilD = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        crearMapa = new proyectofinal.Mapa.CrearMapa();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 36, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEdit.setBackground(new java.awt.Color(36, 36, 51));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EDITAR PERFIL");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        btnFav.setBackground(new java.awt.Color(36, 36, 51));
        btnFav.setForeground(new java.awt.Color(255, 255, 255));
        btnFav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFavMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FAVORITOS");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnFavLayout = new javax.swing.GroupLayout(btnFav);
        btnFav.setLayout(btnFavLayout);
        btnFavLayout.setHorizontalGroup(
            btnFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFavLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        btnFavLayout.setVerticalGroup(
            btnFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel2.add(btnFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, 49));

        btnFilD.setBackground(new java.awt.Color(36, 36, 51));
        btnFilD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFilDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFilDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFilDMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FILTRAR POR DISTRITOS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnFilDLayout = new javax.swing.GroupLayout(btnFilD);
        btnFilD.setLayout(btnFilDLayout);
        btnFilDLayout.setHorizontalGroup(
            btnFilDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFilDLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnFilDLayout.setVerticalGroup(
            btnFilDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel2.add(btnFilD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 49));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAPA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 0, 94, 49));

        jTextField1.setBackground(new java.awt.Color(36, 36, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ingrese su direccion ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 19, 251, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 39, 262, 10));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 50));

        javax.swing.GroupLayout crearMapaLayout = new javax.swing.GroupLayout(crearMapa);
        crearMapa.setLayout(crearMapaLayout);
        crearMapaLayout.setHorizontalGroup(
            crearMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        crearMapaLayout.setVerticalGroup(
            crearMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel3.add(crearMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1110, 670));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(new Color(65, 65, 117));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(new Color(36, 36, 51));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnFavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFavMouseEntered
        btnFav.setBackground(new Color(65, 65, 117));
    }//GEN-LAST:event_btnFavMouseEntered

    private void btnFavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFavMouseExited
        btnFav.setBackground(new Color(36, 36, 51));
    }//GEN-LAST:event_btnFavMouseExited

    private void btnFilDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilDMouseEntered
        btnFilD.setBackground(new Color(65, 65, 117));
    }//GEN-LAST:event_btnFilDMouseEntered

    private void btnFilDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilDMouseExited
        btnFilD.setBackground(new Color(36, 36, 51));
    }//GEN-LAST:event_btnFilDMouseExited

    private void btnFavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFavMouseClicked
        PantallaFav pFav = new PantallaFav();
        pFav.setVisible(true);

    }//GEN-LAST:event_btnFavMouseClicked

    private void btnFilDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilDMouseClicked
        PantallaFilD pFilD = new PantallaFilD();
        pFilD.setVisible(true);
    }//GEN-LAST:event_btnFilDMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        PantallaEdit pEdit = new PantallaEdit();
        pEdit.setVisible(true);
    }//GEN-LAST:event_btnEditMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AntVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AntVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AntVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AntVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AntVersion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnFav;
    private javax.swing.JPanel btnFilD;
    private proyectofinal.Mapa.CrearMapa crearMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}