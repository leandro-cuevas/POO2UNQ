package ar.edu.unq.po2;

public class PorcionProductivaTrigo implements Cultivable {

	private int precioTrigo;
	
	public PorcionProductivaTrigo(int precioTrigo) {
		this.precioTrigo = precioTrigo;
	}
	
	public int getPrecioSoja() {
		return 0;
	}

	@Override
	public int getPrecioTrigo() {
		return this.precioTrigo;
	}

}
