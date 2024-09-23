
import java.awt.Color;
import java.io.Serializable;
import javax.swing.*;

/**
 *
 * @author joser
 */
public class BotonSout extends JButton implements Serializable{
    
    private String variable;
    
    public BotonSout(String objeto) {
        this.variable = objeto;
        //Config formato boton
        this.setBounds(50, 50, 120, 120);
        this.setText(objeto);
        String rutaIcono = "./Iconos/sout.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setBackground(Color.ORANGE);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        
    }
    
    @Override
    public String toString() {
        return "System.out.print(" + variable.split("\\)")[1] + ");\n";
    }
    
    @Override
    public void setText(String objeto) {
        super.setText("<html><br>"
                + "SOUT"
                + "<br>"
                + variable.split("\\)")[1]
                + "</html>");
    }
    
    public String getVariable() {
        return variable;
    }
    
    public void setVariable(String variable) {
        this.variable = variable;
    }
    
}
