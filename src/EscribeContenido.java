import java.io.*;

public class EscribeContenido{
    public static void main(String[] args) {
        final String FICHERO = "numeros.datt";

        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(FICHERO))) {
            
            // Lee hasta que se acaba el archivo
            while (true) {
                double numero = dis.readDouble();
                System.out.println(numero);
            }
            
        }catch(FileNotFoundException fnf) {
        	System.out.println("Fichero no encontrado");

        } catch (EOFException eof) {
            System.out.println("Fin del archivo.");
        } catch (IOException ioe) {
            System.out.println("ERROR E/S: " + ioe);
        }
    }
}

