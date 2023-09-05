package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	
	private double precio; 

	private double porcentajeDesc;
	
	private boolean esPrecioCuidado;
	
	
	Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.porcentajeDesc = 0;
		this.esPrecioCuidado = false;	
	}
	
	Producto (String nombre, double precio, double porcentajeDesc, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.porcentajeDesc = porcentajeDesc;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {

		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(double monto) {
		this.precio += monto;
	}

}
