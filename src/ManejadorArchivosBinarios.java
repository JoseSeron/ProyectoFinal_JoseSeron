
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTree;

/**
 *
 * @author joser
 */
public class ManejadorArchivosBinarios {

    private File archivo;

    public ManejadorArchivosBinarios() {
    }

    public void setArchivo(String nombreArchivo) {
        // para guardar
        if (!nombreArchivo.endsWith(".tito")) {
            nombreArchivo += ".tito";
        }
        //para cargar
        String ruta = "./" + nombreArchivo;
        this.archivo = new File(ruta);
    }



    public void guardarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        if (archivo == null) {
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(listaStrings);
            oos.writeObject(listaBotones);
            oos.writeObject(listaArboles);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        if (archivo == null || !archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            listaStrings.clear();
            listaStrings.addAll((ArrayList<String>) ois.readObject());

            listaBotones.clear();
            listaBotones.addAll((ArrayList<JButton>) ois.readObject());

            listaArboles.clear();
            listaArboles.addAll((ArrayList<JTree>) ois.readObject());

            System.out.println("Datos cargados correctamente desde el archivo binario.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
