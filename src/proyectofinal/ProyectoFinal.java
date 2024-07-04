package proyectofinal;

import javax.swing.SwingUtilities;
import proyectofinal.Pantallas.LoginyRegistro.Pantallalogin;

public class ProyectoFinal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Pantallalogin login = new Pantallalogin();
            login.setVisible(true);
        });
    }

}
