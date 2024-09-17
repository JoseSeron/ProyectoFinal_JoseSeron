
import javax.swing.*;

public class BotonInicio extends JButton {
    
  
this.
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(50, 50, 120, 120); 
    }

    @Override
    public void setIcon(Icon defaultIcon) {

        String rutaIcono = "src/Iconos/inicio.png";

        Icon icono = new ImageIcon(rutaIcono);

        super.setIcon(icono);

    }

    @Override
    public void setHorizontalTextPosition(int textPosition) {
        super.setHorizontalTextPosition(CENTER);
    }

}
