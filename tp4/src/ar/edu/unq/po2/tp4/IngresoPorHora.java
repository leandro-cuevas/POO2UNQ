package ar.edu.unq.po2.tp4;

public class IngresoPorHora extends Ingreso {
	
	private int cantidadDeHoras;
	
	public IngresoPorHora(String mes, String concepto, double monto, int cantidadDeHoras) {
		super(mes, concepto, monto);
		this.cantidadDeHoras = cantidadDeHoras;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
	
	
	
}
