package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private List<Pagable> compra = new ArrayList<Pagable>();

	public void registrarPago(Pagable elemento) {
		compra.add(elemento);
		elemento.serPagado();
	}

	public int getMontoTotal() {
		return compra.stream().mapToInt(producto -> producto.getPrecio()).sum();
	}
}
