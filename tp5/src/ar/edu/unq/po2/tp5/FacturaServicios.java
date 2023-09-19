package ar.edu.unq.po2.tp5;

public class FacturaServicios extends Factura {

	private int unidades;
	private int unidadesPeriodo;
	
	@Override
	public int getPrecio() {
		return unidades * unidadesPeriodo;
	}

}