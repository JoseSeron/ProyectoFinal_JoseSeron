
import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author joser
 */
public class BotonSout extends JButton {

    private String variable;

    public BotonSout(String objeto) {
        this.variable = objeto;
        //Config formato boton
        this.setBounds(50, 50, 120, 120);
        this.setText("<html><br>"
                + "SOUT"
                + "<br>"
                + variable.split("\\)")[1]
                + "</html>");
        String rutaIcono = "./Iconos/sout.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setBackground(Color.ORANGE);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    @Override
    public String toString() {
        return "BotonSout{" + "variable=" + variable + '}';
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

}
