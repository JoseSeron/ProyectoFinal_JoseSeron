
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

    // Constructor vacío: permite elegir el nombre del archivo al guardar
    public ManejadorArchivosBinarios() {
    }

    // Método para especificar el archivo a guardar en el directorio raíz del programa
    public void setArchivo(String nombreArchivo) {
        // Verificar si el archivo ya tiene la extensión ".tito"
        if (!nombreArchivo.endsWith(".tito")) {
            nombreArchivo += ".tito";
        }

        // Crear el archivo en la ruta especificada
        String ruta = "./" + nombreArchivo;
        this.archivo = new File(ruta);
    }



    // Método para guardar los ArrayLists en un archivo binario
    public void guardarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        if (archivo == null) {
            System.out.println("Debe especificar el nombre del archivo antes de guardar.");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            // Serializar los ArrayLists
            oos.writeObject(listaStrings);
            oos.writeObject(listaBotones);
            oos.writeObject(listaArboles);
            oos.flush();
            System.out.println("Datos guardados correctamente en el archivo binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar los ArrayLists desde el archivo binario
    @SuppressWarnings("unchecked")
    public void cargarDatos(ArrayList<String> listaStrings, ArrayList<JButton> listaBotones, ArrayList<JTree> listaArboles) {
        if (archivo == null || !archivo.exists()) {
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


}
