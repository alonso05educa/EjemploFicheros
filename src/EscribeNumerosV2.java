import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Aplicacion que genera fichero con valores reales 
 * el numero de valores esta en la cabecera
 * FORMATO int | double double ...
 */

public class EscribeNumerosV2{
	public static void main(String [] args) {
		final String FICHERO = "numeros.datt";
		
		//double num = 78.36;
		double[] numeros =  {78.36, 79.34,12.12,44.44,99.99,1234.6666666,-1.1};		
		// Creo objeto DataOutputStream(filtro para codificar el dato),usando un objeto FileOutputStream como
		// "canal" de salida de tipo Binario
		
		try(DataOutputStream dos = new DataOutputStream(
				new FileOutputStream(FICHERO))) {
			// Escribo primero la cabecera
			int numElementos = numeros.length;
			dos.writeInt(numElementos);
			
			
			// Escribo todos los numeros reales
			for(int i=0;i<numElementos;i++) {
				dos.writeDouble(numeros[i]);
			}
			
		}catch(IOException ioe) {
			System.out.println("ERROR E/S" + ioe);
		}
	}

}