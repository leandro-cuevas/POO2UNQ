package ar.edu.unq.po2.tp5;


public abstract class Factura {
	
	private Agencia agencia;
	
	public abstract int getPrecio();
	
	public void serPagado() {
		agencia.registrarPago(this);
	}
}