
import java.io.File;


public class FUtil {
	/**
	 * Verifica si un archivo existe D
	 *@author alonso
	 * @param filename El nombre del archivo a buscar.
	 * @return true si el archivo existe, false en caso contrario.
	 */
    public static boolean existe(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del archivo no puede estar vacío ni ser solo espacios.");
        }

        File file = new File(filename);
        return file.exists();
    }
}
