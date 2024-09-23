
import java.awt.Color;
import java.io.Serializable;
import javax.swing.*;
import javax.swing.JButton;

public class BotonFin extends JButton implements Serializable{

    public BotonFin() {

        this.setBounds(50, 50, 120, 120);
        this.setText("FIN");
        String rutaIcono = "./Iconos/fin.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setBackground(Color.red);
    }

    @Override
    public String toString() {
        return "}\n";
    }

}
