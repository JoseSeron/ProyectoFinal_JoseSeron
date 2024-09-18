
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joser
 */
public class BotonFor extends JButton {
//        for (int i = 0; i < 10; i++) {
//            
//        }

    private String tipo, inicio, limite, comparador, factor;

    public BotonFor(String tipo, String inicio, String limite, String comparador, String factor) {
        //Datos
        this.tipo = tipo;
        this.inicio = inicio;
        this.limite = limite;
        this.comparador = comparador;
        this.factor = factor;

        //Config formato boton
        this.setBounds(50, 50, 120, 120);
        this.setText("<html>For<br>"
                + "i"
                + "<br>"
                + comparador
                + "<br>"
                + limite
                + "</html>");
        String rutaIcono = "./Iconos/for.png";
        Icon icono = new ImageIcon(rutaIcono);
        this.setIcon(icono);
        this.setBackground(Color.GREEN);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

}
