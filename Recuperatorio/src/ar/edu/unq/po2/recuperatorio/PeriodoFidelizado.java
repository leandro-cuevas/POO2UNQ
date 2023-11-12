package ar.edu.unq.po2.recuperatorio;

public class PeriodoFidelizado extends Periodo {

	public PeriodoFidelizado() {
		super(-1);
		this.descuento = 0;
	}

	@Override
	void pasarSiguientePeriodo(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	void descontarCompra(int monto) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean esFidelizado() {
		return true;
	}
}
