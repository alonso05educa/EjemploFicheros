
import java.io.File;

public class FUtil {
    public static boolean existe(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del archivo no puede estar vacío ni ser solo espacios.");
        }

        File file = new File(filename);
        return file.exists();
    }
}
