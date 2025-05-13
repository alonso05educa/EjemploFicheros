
public class Jugador implements java.io.Serializable {
	private int numero;
	private String nombre;
	private int puntuacion;
	
	public Jugador(String nombre, int numero) {
		this.numero = numero;
		this.nombre = nombre;
		this.puntuacion = 0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void sumarPuntos(int puntos) {
		this.puntuacion = this.puntuacion + puntos;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}

}
