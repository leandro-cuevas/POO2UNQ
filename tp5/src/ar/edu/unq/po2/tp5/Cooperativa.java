package ar.edu.unq.po2.tp5;

public class Cooperativa extends Producto {
	
	private double porcentajeDescuento;
	
	public Cooperativa(String nombre, double precioBase, int stock) {
		super(nombre, precioBase, stock);
		this.porcentajeDescuento = 0.1;
	}

	@Override
	public double precioFinal() {		
		return this.getPrecioBase() * porcentajeDescuento + this.getPrecioBase();
	}

}
