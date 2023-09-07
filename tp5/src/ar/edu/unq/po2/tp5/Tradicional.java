package ar.edu.unq.po2.tp5;

public class Tradicional extends Producto {

	public Tradicional(String nombre, double precioBase, int stock) {
		super(nombre, precioBase, stock);
	}

	@Override
	public double precioFinal() {
		return this.getPrecioBase();
	}
}
