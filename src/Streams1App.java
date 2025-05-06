import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Streams1App {
	public static void main (String[] args) {
		
		// LECTURA FICHERO DE TEXTO => FileReader	
		
		//LECTURA - CARACTERES (la Fuente es el TECLADO)
		// Elijo la clase InputStreamReader
		int car = '?';
		// 4) Es obligatorio tratar IOException
		try {
		// 1) Creo el stream adecuado:
		InputStreamReader streamTeclado = new InputStreamReader(System.in);
		
		// 2) Leo un caracter:
		car = streamTeclado.read();
		
		// 3)Cierro stream
		streamTeclado.close();
		}catch(IOException ioe) {
			System.out.println("ERROR E/S: "+ ioe);
		}
		
		System.out.printf("Has tecleado %c %n", car);
		
		
		// ==================================================
		// EJERCICIO:Leer el primer caracter de un fichero de texto
		
		//LECTURA - CARACTERES (la Fuente es el TECLADO)
				// Elijo la clase InputStreamReader
			
				// 4) Es obligatorio tratar IOException
				try {
				// 1) Creo el stream adecuado:
				FileReader streamTeclado = new FileReader("prueba");
				
				// 2) Leo un caracter:
				car = streamTeclado.read();
				
				// 3)Cierro stream
				streamTeclado.close();
				}catch(IOException ioe) {
					System.out.println("ERROR E/S: "+ ioe);
				}
			
				
		
		
		// ==================================================
		// EJERCICIO 2 : Mostrar en consola los 3 primeros caracterres de un fichero de texto
				
				//LECTURA - CARACTERES (la Fuente es el TECLADO)
				// Elijo la clase InputStreamReader
				StringBuffer sb = new StringBuffer();
			
				// 4) Es obligatorio tratar IOException
				try {
				// 1) Creo el stream adecuado:
				FileReader streamTeclado = new FileReader("prueba");
				
				// Leo tres caracteres
				for(int i=0;i<3;i++) {
					// 2) Leo un caracter:
					car = streamTeclado.read();
					// Añado el caracter
					sb.append((char)car);
				}
				
				
				
				// 3)Cierro stream
				streamTeclado.close();
				}catch(IOException ioe) {
					System.out.println("ERROR E/S: "+ ioe);
				}
				
				
				
				
				
				// ==================================================
				// EJERCICIO 3 : Mostrar en consola todos los caracteres de un fichero de texto
				final int EOF = -1;
				try {
					
					FileReader streamFichero = new FileReader("prueba");
					car = streamFichero.read();
		            // Leo el fichero completo, mostrando en consola cada caracter
		            while (car != -EOF) {
		                System.out.print((char) car);
		                car = streamFichero.read();
		            }
				
				
				
				System.out.println("Final del fichero");
				streamFichero.close();
				}catch(IOException ioe) {
					System.out.println("ERROR E/S: "+ ioe);
				}
				//------------------------------------------------------------
				//-----------------------------------------------------------
				//------------------------------------------------------------
				

				//LECTURA - CARACTERES (la Fuente es el TECLADO)
					
						// 4) Es obligatorio tratar IOException
				// Pero lo haremos con try-with-resources para que se cierren automaticamente los recursos abiertos por ejemplo en un fichero
				
						try( FileReader streamFichero = new FileReader("prueba")) {
							System.out.println("Fichero abierto");
						// Operaciones de lectura
					car = streamFichero.read();
					// FileNotFoundException va antes que IOException
						}catch(FileNotFoundException fnf){
							System.out.println("ERROR E/S: Fichero no encontrado" + fnf);
						}catch(IOException ioe) {
							System.out.println("ERROR E/S: "+ ioe);
						
						
						// Ha quedado cerrado el fichero
						System.out.println("Fichero cerrado");
	}
						
		// EJERCICIO : Copia completa de un fichero de texto
					// FileReader => "Canal" de lectura para texto
					// FileWriter => "Canal" de escritura para texto
						
	  

	        // FileReader y FileWriter son para trabajar con texto (caracteres)
	        try (FileReader entrada = new FileReader("prueba");
	             FileWriter salida = new FileWriter("prueba_copia")) {

	        	car = entrada.read();
	            while (car != -1) {
	                salida.write(car);
	                car = entrada.read();// Escribimos el carácter leído en el fichero destino
	            }

	            System.out.println("Copia completada con éxito.");
	        }catch(FileNotFoundException fnf) {
	        	System.out.println("ERROR E/S: Fichero no encontrado" + fnf);

	        } catch (IOException ioe) {
	            System.out.println("Ha ocurrido un error durante la copia:" + ioe);
	        }
	        
	        // EJERCICIO 2: Copia comleta de un fichero de texto, transformacion a mayusculas lo que este en minuscula y al reves.
	        // Transformando el caracter en el siguiente, es decir A se transforma a B, B en C, a en b , 0 en 1,.......
	        try (FileReader entrada = new FileReader("prueba1");
		             FileWriter salida = new FileWriter("prueba1_cifrada")) {
	        	
	        	System.out.println("Cifrando..");

		        	car = entrada.read();
		            while (car != -1) {
		            	if(Character.isAlphabetic(car)) {
		            		salida.write(car+1);
		            	}
		                car = entrada.read();// Escribimos el carácter leído en el fichero destino
		            }

		            System.out.println("Copia completada con éxito.");
		        }catch(FileNotFoundException fnf) {
		        	System.out.println("ERROR E/S: Fichero no encontrado" + fnf);

		        } catch (IOException ioe) {
		            System.out.println("Ha ocurrido un error durante la copia:" + ioe);
		        }
	        
	     // ==================================================
			// EJERCICIO: BufferedReader
	        // Mostrar la primera linea de un fichero de texto , usando BufferedReader
	        final String FICHERO = "prueba.txt";
	        
	        try(FileReader fichero = new FileReader(FICHERO);
	        		BufferedReader br = new BufferedReader(fichero)) {
	        	// Leer una linea 
	        	String linea = br.readLine();
	        	System.out.println(linea);
	        	
	        }catch(IOException ioe) {
	        	System.out.println("ERROR E/S"+ ioe);	        }
						
				
	
}
}
