package ar.edu.unq.po2.tp3;

public class Persona2 {
	
	private String nombre;

	private String apellido;

	private int edad;
	
	Persona2(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	
}
