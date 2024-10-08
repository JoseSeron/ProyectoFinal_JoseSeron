
import java.io.Serializable;
import javax.swing.tree.DefaultMutableTreeNode;

/*
Nodo Clase sera lo guardado en el ArrayList
ArrayList<Nodo Clase> clases;

El arbol principal se alimenta del arraylist

El metodo para exportar codigo usara el arraylist

El guardar/abrir se manejara con 1 solo archivo de los 3 arraylists
 
 */
public class NodoClase extends DefaultMutableTreeNode implements Serializable{

    boolean tieneHerencia, esHija;
    String nombreClase;
    NodoClase claseHija;
    NodoClase clasePadre;

    public NodoClase(String nombreClase) {

        //inicializar la clase con sus 2 hijos
        super(nombreClase); //crea la raiz del arbol
        DefaultMutableTreeNode propiedades = new DefaultMutableTreeNode("Propiedades");
        DefaultMutableTreeNode metodos = new DefaultMutableTreeNode("Metodos");
        this.add(propiedades);
        this.add(metodos);
        this.nombreClase = nombreClase;

        //inicializar datos de herencia
        this.tieneHerencia = false;
        this.claseHija = null;
        this.clasePadre = null;
        this.esHija = false;

    }

    public boolean isTieneHerencia() {
        return tieneHerencia;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public NodoClase getClaseHija() {
        return claseHija;
    }

    public NodoClase getClasePadre() {
        return clasePadre;
    }

    public void setHerenciaHija(NodoClase clasePadre) {
        tieneHerencia = true;
        this.clasePadre = clasePadre;
        setEsHija();
    }

        public void setHerenciaPadre(NodoClase claseHija) {
        tieneHerencia = true;
        this.claseHija = claseHija;
    }

    public void setTieneHerencia(boolean tieneHerencia) {
        this.tieneHerencia = tieneHerencia;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public void setClaseHija(NodoClase claseHija) {
        this.claseHija = claseHija;
    }

    public void setClasePadre(NodoClase clasePadre) {
        this.clasePadre = clasePadre;
    }

    public void setEsHija(){
    this.esHija = true;
    }

    @Override
    public String toString() {
        return nombreClase;
    }
        
        
}
