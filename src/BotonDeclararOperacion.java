
import java.awt.Color;
import javax.swing.*;

public class BotonDeclararOperacion extends JButton {

    private String variable1, variable2, operacion, resultado;

    public BotonDeclararOperacion(String variable1, String variable2, String operacion, String resultado) {
        this.resultado = resultado;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.operacion = operacion;
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
        this.setBackground(Color.BLUE);

    }

    @Override
    public String toString() {
        return resultado.split("\\)")[1] + " = " + variable1.split("\\)")[1] + " " + operacion + " " + variable2.split("\\)")[1] + ";\n";
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

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
