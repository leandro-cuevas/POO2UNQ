package ar.edu.unq.po2.tp4;

public class Ingreso {

	public Ingreso(String mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	private String mes;
	
	private String concepto;
	
	private double monto;
	
	
	public double getMonto() {
		return this.monto;
	}
	
	public double getMontoImponible(){
		return getMonto();
	}
}
