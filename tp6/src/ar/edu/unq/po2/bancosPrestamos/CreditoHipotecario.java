package ar.edu.unq.po2.bancosPrestamos;

public class CreditoHipotecario extends SolicitudesCredito {

	Propiedad propiedadEnGarantia;
	
	public CreditoHipotecario(ClienteBancario solicitante, int monto, int plazo, Propiedad propiedadEnGarantia) {
		super(solicitante, monto, plazo);
		this.propiedadEnGarantia = propiedadEnGarantia;
	}
	
	@Override
	public boolean esAceptable() {
		return this.laCuotaNoSuperaEl50DeIngresos() && this.laCuotaNoSuperaEl70DelValorFiscal() && this.laEdadEsAceptable();
	}
	
	private boolean laCuotaNoSuperaEl50DeIngresos() {
		return this.montoCuotaMensual() < (solicitante.getSueldoNetoAnual() * 0.5);
	}
	
	private boolean laCuotaNoSuperaEl70DelValorFiscal() {
		return this.montoCuotaMensual() < (propiedadEnGarantia.getValorFiscal() * 0.7);
	}
	
	private boolean laEdadEsAceptable() {
		return (this.solicitante.getEdad() + (this.plazo / 12)) < 65;
	}

}
