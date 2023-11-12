package ar.edu.unq.po2.recuperatorio;

public class PeriodoConsolidacion extends Periodo {

	public PeriodoConsolidacion() {
		super(3);
		this.descuento = 0.4d;
	}
	
	@Override
	double calcularDescuento(int montoOriginal) {
		if (montoOriginal > 50000) {
			return this.descuento;
		} else return 0;
	}

	@Override
	void pasarSiguientePeriodo(Cliente cliente) {
		Periodo siguiente = new PeriodoFidelizado();
		
		cliente.setPeriodo(siguiente);

	}

	@Override
	void descontarCompra(int monto) {
		if (monto > 50000) {
			this.contadorCompra -= 1;
		}
	}

}
