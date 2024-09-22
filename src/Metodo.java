
public class Metodo {
    String nombre, retorno, alcance,parametro;

    public Metodo(String nombre, String retorno, String alcance, String parametro) {
        this.nombre = nombre;
        this.retorno = retorno;
        this.alcance = alcance;
        this.parametro = parametro;
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

    public String getLineaCodigo(){ //se usa para el codigo obviamente
    return alcance+" "+retorno+" "+nombre+"("+parametro+"){\n}";
    }
    
    @Override
    public String toString() { //el toString se usara para la vista del arbol
        return "("+alcance+") "+nombre+"()";
    }
    
    
    
}
