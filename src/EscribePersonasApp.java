import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EscribePersonasApp {
	public static void main(String[] args) {
		final String FICHERO = "personas.dat";
		// Creo 3 objetos Persona
		Persona p1 = new Persona("Juan",true, 1000);
		Persona p2 = new Persona("Ana",true, 2000);
		Persona p3 = new Persona("Daniel",false, 0);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		// Guardo los tres objetos en un fichero
		// Uso ObjectOutputStream => Stream ESCRITURA datos BINARIOS (que son Objetos)
		// con FileOutputStream => Datos BINARIOS que son Objetos
		System.out.println("Escribiendo...");
		try(ObjectOutputStream ficheroPersonas = new ObjectOutputStream(new FileOutputStream(FICHERO))){
			
			ficheroPersonas.writeObject(p1);
			ficheroPersonas.writeObject(p2);
			ficheroPersonas.writeObject(p3);
			
			
			
		}catch(IOException ioe) {
			System.out.println("ERROR Escritura" + ioe);
		}
		// Elimino los objetos de la memoria
		p1 = null;
		p2 = null;
		p3 = null;
		
		// Da prioridad al Garbage Collector
		System.gc();
		
		// Elimino los objetos de memoria
		
		// Recupero los objetos del fichero y los muestro ¿Ha cambiado algo?
		try(ObjectInputStream ficheroPersonas = new ObjectInputStream(new FileInputStream(FICHERO))){
			
			
			Persona pLeido1 = (Persona) ficheroPersonas.readObject();
		    Persona pLeido2 = (Persona) ficheroPersonas.readObject();
		    Persona pLeido3 = (Persona) ficheroPersonas.readObject();

		}catch (FileNotFoundException fnfe) {
			System.out.println("ERROR: fichero no encontrado");
		    
		}catch(ClassNotFoundException e) {
			System.out.println("ERROR al leer objeto : " + e);
		}catch(IOException ioe) {
			System.out.println("ERROR Escritura" + ioe);
		}
	}

}
