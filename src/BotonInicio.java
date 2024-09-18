
import java.awt.Color;
import javax.swing.*;

public class BotonInicio extends JButton {
    
    public BotonInicio() {
        //super.setBounds(50, 50, 150, 120);
        this.setBounds(50, 50, 120, 120);
        this.setText("hola");
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
