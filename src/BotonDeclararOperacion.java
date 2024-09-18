
import javax.swing.*;

public class BotonDeclararOperacion extends JButton {

    private String variable1, variable2, operacion, resultado;

    public BotonDeclararOperacion() {

        this.setBounds(50, 50, 120, 120);
        this.setText("<html>Decl. Ope.<br>"
                + variable1.split("\\)")[1]
                + "<br>"
                + operacion
                + "<br>"
                + variable2.split("\\)")[1]
                + "</html>");
        String rutaIcono = "./Iconos/declarar.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    @Override
    public String toString() {
        return resultado + " = " + variable1 + " " + operacion + " " + variable2 + ";";
    }

}
