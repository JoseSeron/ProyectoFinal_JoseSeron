
import java.awt.Color;
import javax.swing.*;
import javax.swing.JButton;

public class BotonInicio extends JButton {
    
    public BotonInicio() {
        
        this.setBounds(50, 50, 120, 120);
        this.setText("Inicio");
        String rutaIcono = "./Iconos/inicio.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setHorizontalTextPosition(SwingConstants.CENTER); 
        this.setBackground(Color.red);
    }

    @Override
    public String toString() {
        return "public static void main(String[] args) {\n";
    }

    
}
