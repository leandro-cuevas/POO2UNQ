package ar.edu.unq.po2.tp5;

public class Cooperativa extends Producto {

	public Cooperativa(int precio, int stock) {
		super(precio, stock);
	}

	@Override
	public int getPrecio() {
		return (int) (super.getPrecio() * 0.90);
	}
}