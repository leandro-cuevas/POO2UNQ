package ar.edu.unq.po2.recuperatorio;

import java.time.LocalDateTime;

public class Compra {
	
	private LocalDateTime fecha;
	
	private double montoOrignal;
	
	private MedioDePago pago;
	
	private double descuento;
	
	public Compra(LocalDateTime fecha, double montoOrignal, MedioDePago pago, double descuento) {
		this.fecha = fecha;
		this.montoOrignal = montoOrignal;
		this.pago = pago;
		this.descuento = descuento;
	}

	public double montoFinal() {
		return montoOrignal * (1-descuento);
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}

}
