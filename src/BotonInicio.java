
import javax.swing.*;

public class BotonInicio extends JButton {
    
    private String lineaCodigo = "public static void main(String[] args) {";
    
    public String getLineaCodigo() {
        return this.lineaCodigo;
    }
    
    public BotonInicio() {
        //super.setBounds(50, 50, 150, 120);
        this.setBounds(50, 50, 120, 120);
        this.setText("hola");
        String rutaIcono = "./Iconos/inicio.png";
        Icon icono = new ImageIcon(rutaIcono);
       // super.setIcon(icono);
        this.setHorizontalTextPosition(SwingConstants.CENTER); 
    }

    
}
