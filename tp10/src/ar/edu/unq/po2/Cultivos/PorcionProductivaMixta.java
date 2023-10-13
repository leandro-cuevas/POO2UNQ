package ar.edu.unq.po2.Cultivos;

import java.util.ArrayList;
import java.util.List;

public class PorcionProductivaMixta implements Cultivable {

	private List<Cultivable> cultivables;
	
	public PorcionProductivaMixta(Cultivable c1, Cultivable c2, Cultivable c3, Cultivable c4) {
		this.cultivables = new ArrayList<Cultivable>();
		cultivables.add(c1);
		cultivables.add(c2);
		cultivables.add(c3);
		cultivables.add(c4);
		
	}

	public int getPrecioSoja() {
		return cultivables.stream()
				.mapToInt(e-> e.getPrecioSoja())
				.sum();
	}

	public int getPrecioTrigo() {
		return cultivables.stream()
				.mapToInt(e-> e.getPrecioTrigo())
				.sum();
	}
}
