package ar.edu.unq.po2.bancosPrestamos;

public class CreditoPersonal extends SolicitudesCredito {
	
	public CreditoPersonal(ClienteBancario solicitante, int monto, int plazo) {
		super(solicitante, monto, plazo);
	}

	@Override
	public boolean esAceptable() {
		return solicitante.getSueldoNetoAnual() > 15000 && this.laCuotaNoSuperaEl70DeIngresos();
	}

	private boolean laCuotaNoSuperaEl70DeIngresos() {
		return this.montoCuotaMensual() < (solicitante.getSueldoNetoAnual() * 0.7);
	}
	
	

}
