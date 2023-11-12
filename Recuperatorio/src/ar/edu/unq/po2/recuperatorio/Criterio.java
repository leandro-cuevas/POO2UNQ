package ar.edu.unq.po2.recuperatorio;

import java.util.List;
import java.util.Set;

public abstract class Criterio {
	
	public Cliente elMejor(List<Cliente> clientes) {
		return clientes.stream()
				.max((c1, c2) -> this.comparar(c1, c2)).get();
	}

	protected abstract int comparar(Cliente c1, Cliente c2);
}
