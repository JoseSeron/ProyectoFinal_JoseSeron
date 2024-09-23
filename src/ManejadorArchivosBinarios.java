
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

    // Constructor
    public ManejadorArchivosBinarios(String ruta) {
        this.archivo = new File(ruta);
    }

    // Método para guardar los ArrayLists en un archivo binario
    public void guardarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            // Serializar los ArrayLists
            oos.writeObject(listaStrings);
            oos.writeObject(listaBotones);
            oos.writeObject(listaArboles);
            oos.flush();
            System.out.println("Datos guardados correctamente en el archivo binario.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para cargar los ArrayLists desde el archivo binario
    @SuppressWarnings("unchecked")
    public void cargarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            // Deserializar los ArrayLists
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

    // Métodos adicionales para gestión de archivos

    // Verificar si el archivo existe
    public boolean existeArchivo() {
        return archivo.exists();
    }

    // Borrar el archivo
    public boolean borrarArchivo() {
        if (archivo.exists()) {
            return archivo.delete();
        }
        return false;
    }
}
