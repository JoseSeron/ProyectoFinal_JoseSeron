
import javax.swing.*;

/**
 *
 * @author joser
 */
public class BotonIf extends JButton {

    private String variable1, comparador, variable2;

    @Override
    public String toString() {
        return "if ("+variable1+comparador+variable2+") {}\n";
    }

    
    public BotonIf(String variable, String comparador, String variable2) {
        this.variable1 = variable1;
        this.comparador = comparador;
        this.variable2 = variable2;
        this.setBounds(50, 50, 120, 120);
        this.setText("<html>If<br>"
                + variable1
                + "<br>"
                + comparador
                + "<br>"
                + variable2
                + "</html>");
        String rutaIcono = "./Iconos/if.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }
    
    

}
