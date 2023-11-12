package ar.edu.unq.po2.recuperatorio;

public class CriterioCantidadDeCompras extends Criterio{

	@Override
	protected int comparar(Cliente c1, Cliente c2) {
		return c1.getCompras().size() - c2.getCompras().size();
	}

}
