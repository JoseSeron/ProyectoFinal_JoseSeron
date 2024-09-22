
public class Propiedad {

    String tipo, nombre;

    public Propiedad(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Propiedad() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLineaCodigo() { //para codigo
        return "(" + tipo + ")" + " " + nombre+";";
    }

    @Override
    public String toString() { //para vision en el arbol
        return "(" + tipo + ")" + " " + nombre;
    }

}
