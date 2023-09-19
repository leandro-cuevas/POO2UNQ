package ar.edu.unq.po2.tp5;

public class FacturaImpuestos extends Factura {
	
	private int tasaDeServicio;	

	@Override
	public int getPrecio() {
		return tasaDeServicio;
	}

}
