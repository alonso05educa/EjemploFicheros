
public class Persona implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1793870502232802706L;
	private String nombre;
	private boolean mayorEdad;
	private double saldo;
	
	
	// Constructor
	public Persona(String nombre, boolean mayorEdad, double saldo) {
		this.nombre = nombre;
		this.mayorEdad = mayorEdad;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", mayorEdad=" + mayorEdad + ", saldo=" + saldo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public double getSaldo() {
		
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo<0) {
			throw new IllegalArgumentException("Saldo negativo");
		}
		this.saldo = saldo;
	}
	}
