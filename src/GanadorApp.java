import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GanadorApp {
	public static void main(String[]args) {
		final String FICHERO = "jugadores1.dat";
		final String FICHERO2 = "jugadores2.dat";
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(new Jugador("Ana", 90));
		jugadores.add(new Jugador("Luis", 75));
		jugadores.add(new Jugador("María", 85));


        ArrayList<Jugador> jugadores2 = new ArrayList<>(jugadores);
        jugadores2.add(new Jugador("Carlos", 88));
        jugadores2.add(new Jugador("Lucía", 92));

        System.out.println("Contenido de la lista 1:");
        for (Jugador j : jugadores) {
            System.out.println(j);
        }

        System.out.println("\nContenido de la lista 2:");
        for (Jugador j : jugadores2) {
            System.out.println(j);
        }
        
        try(ObjectOutputStream ficheroJugadores = new ObjectOutputStream(new FileOutputStream(FICHERO))){
        	
        	
        }catch(IOException ioe) {
        	System.out.println("ERROR" + ioe);
        }
        
        
    
		
	}
	 public static void serializarLista(ArrayList<Jugador> lista, String nombreArchivo) {
	        try (ObjectOutputStream ficheroJugadores = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
	            ficheroJugadores.writeObject(lista);
	            System.out.println("\nLista serializada en el archivo: " + nombreArchivo);
	        } catch (IOException e) {
	            System.err.println("Error al serializar la lista: " + e);
	        }
	    }

}
