package ar.edu.unq.po2.recuperatorio;

public class CriterioMasMontoConsumido extends Criterio {

	@Override
	protected int comparar(Cliente c1, Cliente c2) {
		return Double.compare(c1.getMontoConsumido(), c2.getMontoConsumido());
	}

}
