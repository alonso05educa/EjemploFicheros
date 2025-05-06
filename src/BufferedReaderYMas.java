import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BufferedReaderYMas {
	public static void main (String [] args) {
			// ==================================================
			// EJERCICIO: BufferedReader
	        // Mostrar las primeras lineas de un fichero de texto , usando BufferedReader
	        final String FICHERO = "prueba.txt";
	        
	        try(FileReader fichero = new FileReader(FICHERO);
	        		BufferedReader br = new BufferedReader(fichero)) {
	        	
	        	// Muestro la primera linea ¿y si solo quiero mostrar la 2º linea?
	        	String linea = br.readLine();
	        	System.out.println(linea);
	        	// Leo y muestro la segunda línea
	        	//linea = br.readLine();
	        	//System.out.println(linea);
	        	if(linea !=null) {
	        		System.out.println("3 linea: " + linea);
	        	}else {
	        		System.out.println("NO HAY");
	        	}
	        	// EJERCICIO : Contar las palabras de la 2º linea
	        	int cPals=0;
	        	String[] palabras = linea.split("\\s+");
	        	cPals = palabras.length;
	        	System.out.printf("Nº caracteres: %d%n",linea.length());
	        	System.out.printf("Nº palabras : %d%n",cPals);
	        	

	        }catch(IOException ioe) {
	        	System.out.println("ERROR E/S"+ ioe);	        }
	        
	        
	     // ==================================================
	     			// EJERCICIO: BufferedWriter
	     	        // Escribir varias lineas de texto
	     	        
	     	        try(BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.html"))) {
	     	        	
	     	        	System.out.print("Generando html....");
	     	        	bw.write("<ul>");
	     	        	bw.newLine();
	     	        	bw.write("<li>Item 1 </li>");
	     	        	bw.newLine();
	     	        	bw.write("<li> Item 2 </li>");
	     	        	bw.newLine();
	     	        	bw.write("</ul>");
	     	        	bw.newLine();
	     	        	

	     	        }catch(FileNotFoundException fnfe){
	     	        	System.out.println("Fichero "+ FICHERO + "no encontrado");
	     	        	
	     	        
					}catch(IOException ioe) {
	     	        	System.out.println("ERROR E/S"+ ioe);	        }
	     	        
	     // EJERCICIO: Hacer una copia exacta del fichero resultado.html y añadirle al final un footer con el nº total de lineas 
	     // y de caracteres, la fecha actual y vuestro nombre
	     	        String nombre = "Alonso Gutierrez Ramirez de Arellano"; 

	     	        int numLineas = 0;
	     	        int numCaracteres = 0;
	     	        
	     	        
	     	       try (
	     	              BufferedReader br = new BufferedReader(new FileReader("resultado.html"));
	     	              BufferedWriter bw = new BufferedWriter(new FileWriter("copia.html"))
	     	          ) {
	     	              String linea;
	     	              while ((linea = br.readLine()) != null) {
	     	                  bw.write(linea);
	     	                  bw.newLine();
	     	                  numLineas++;
	     	                  numCaracteres += linea.length();
	     	              }

	     	              
	     	              String fechaActual = new String ("30/04/2025");
	     	              bw.newLine();
	     	              bw.write("<!-- FOOTER -->");
	     	              bw.newLine();
	     	              bw.write("<!-- Líneas totales: " + numLineas + " -->");
	     	              bw.newLine();
	     	              bw.write("<!-- Caracteres totales: " + numCaracteres + " -->");
	     	              bw.newLine();
	     	              bw.write("<!-- Fecha: " + fechaActual + " -->");
	     	              bw.newLine();
	     	              bw.write("<!-- Autor: " + nombre + " -->");
	     	              bw.newLine();

	     	              System.out.println("Archivo copiado con éxito y footer añadido.");

	     	          } catch (IOException ioe) {
	     	              System.out.println("ERROR" + ioe);
	     	          }
	     	
	}

}
