package ar.edu.unq.po2;

public class PorcionProductivaSoja implements Cultivable {
	
	private int precioSoja;

	public PorcionProductivaSoja(int precioSoja) {
		this.precioSoja = precioSoja;
	}
	
	public int getPrecioSoja() {
		return precioSoja;
	}
	
	public int getPrecioTrigo() {
		return 0;
	}

}
