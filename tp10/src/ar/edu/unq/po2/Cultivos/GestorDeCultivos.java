package ar.edu.unq.po2.Cultivos;

import java.util.ArrayList;
import java.util.List;

public class GestorDeCultivos {
	
	List<Cultivable> cultivos;

	public GestorDeCultivos() {
		this.cultivos = new ArrayList<Cultivable>();
	}
	
	public void agregarCultivable(Cultivable c) {
		cultivos.add(c);
	}
	
	public int getPrecioSoja() {
		return cultivos.stream()
				.mapToInt(e-> e.getPrecioSoja())
				.sum();
	}
	
	public int getPrecioTrigo() {
		return cultivos.stream()
				.mapToInt(e-> e.getPrecioTrigo())
				.sum();
	}
}
