package ar.edu.unq.po2.tp5;

import java.time.LocalDate;

public class Factura {

	double monto;
	
	LocalDate fecha;
	
	public Factura(double monto, LocalDate fecha) {
		super();
		this.monto = monto;
		this.fecha = fecha;
	}
}
