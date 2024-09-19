
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author joser
 */
public class BotonWhile extends JButton {

    private String variable1, variable2, comparador;

    public BotonWhile(String variable1, String variable2, String comparador) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.comparador = comparador;

        //Config formato boton
        this.setBounds(50, 50, 120, 120);
        this.setText("<html>While<br>"
                + "<br>"
                + variable1.split("\\)")[1]
                + "<br>"
                + comparador
                + "<br>"
                + variable2.split("\\)")[1]
                + "</html>");
        String rutaIcono = "./Iconos/while.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setBackground(Color.MAGENTA);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    @Override
    public String toString() {
        return "while ( " + variable1.split("\\)")[1] + " " + comparador + " " + variable2.split("\\)")[1] + " ) {}\n";
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

}
