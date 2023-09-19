package ar.edu.unq.po2.bancosPrestamos;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

}
