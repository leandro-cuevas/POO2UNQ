package ar.edu.unq.po2.tp5;

public abstract class Producto {

	private String nombre;
	private double precioBase;
	private int stock;

	public Producto(String nombre, double precioBase, int stock) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.stock = stock;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean disponible() {
		return stock > 0;
	}

	public abstract double precioFinal();

}
