package ar.edu.unq.po2.recuperatorio;

public class PeriodoBienvenida extends Periodo {

	public PeriodoBienvenida() {
		super(10);
		this.descuento = 015d;
	}

	@Override
	void pasarSiguientePeriodo(Cliente cliente) {
		Periodo proximo = new PeriodoConsolidacion();
		cliente.setPeriodo(proximo);
	}

	@Override
	void descontarCompra(int monto) {
		this.contadorCompra -= 1;
	}
}
