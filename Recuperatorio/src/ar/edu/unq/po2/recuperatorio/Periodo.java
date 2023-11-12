package ar.edu.unq.po2.recuperatorio;

import java.time.LocalDateTime;

public abstract class Periodo {
	
	protected double descuento;
	
	protected int contadorCompra;
	
	public Periodo(int contadorCompra) {
		this.contadorCompra = contadorCompra;
	}
	
	abstract void pasarSiguientePeriodo(Cliente cliente);
	
	private void chequearSiPasaDePeriodo(Cliente cliente) {
		if (contadorCompra == 0) {
			pasarSiguientePeriodo(cliente);
		}
	}
	
	abstract void descontarCompra(int monto);
	
	double calcularDescuento(int montoOriginal) {
		return this.descuento;
	}
	
	final public void hacerCompra(Cliente cliente, int monto) {
		
		Compra compra = new Compra(LocalDateTime.now(), monto, MedioDePago.EFECTIVO, calcularDescuento(monto));
		
		cliente.registrarCompra(compra);
		
		descontarCompra(monto);
		
		chequearSiPasaDePeriodo(cliente);
	}
	
	public boolean esFidelizado() {
		return false;
	}

}
