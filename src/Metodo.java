
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Metodo {

    String nombre, retorno, alcance, parametro;
    DefaultListModel<String> parametros;

    public Metodo(String nombre, String retorno, String alcance, DefaultListModel<String> parametros) {
        this.nombre = nombre;
        this.retorno = retorno;
        this.alcance = alcance;
        this.parametros = parametros;
    }

    public Metodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getLineaCodigo() { //se usa para el codigo obviamente
        StringBuilder textoParametros = new StringBuilder();

        for (int i = 0; i < this.parametros.size(); i++) {
            textoParametros.append(this.parametros.getElementAt(i));
            if (i != this.parametros.size() - 1) {
                textoParametros.append(",");
            }
        }

        return this.alcance + " " + this.retorno + " " + this.nombre + " (" + textoParametros.toString() + ") {\n}\n";
    }

    @Override
    public String toString() { //el toString se usara para la vista del arbol
        return "(" + alcance + ") " + nombre + "()";
    }

}
