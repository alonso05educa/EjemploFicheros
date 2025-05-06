import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirPersonasApp {
	
	public static void main(String[] args) {
		final String FICHERO = "personas.dat";

        // Datos de ejemplo: nombre, mayorEdad, saldo
        String[] nombres = {"Ana", "Luis", "María", "Pedro"};
        boolean[] mayoresEdad = {true, false, true, true};
        double[] saldos = {2500.50, 150.75, 3800.00, 0.0};
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))) {
            for (int i = 0; i < nombres.length; i++) {
                dos.writeUTF(nombres[i]);
                dos.writeBoolean(mayoresEdad[i]);
                dos.writeDouble(saldos[i]);
            }
            System.out.println("Datos escritos correctamente en el archivo.");
        } catch (IOException ioe) {
            System.out.println("ERROR E/S: " + ioe.getMessage());
        }
	}
}
