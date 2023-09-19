package ar.edu.unq.po2.bancosPrestamos;

public abstract class SolicitudesCredito {

	protected ClienteBancario solicitante;
	protected int monto;
	protected int plazo;
	
	public SolicitudesCredito(ClienteBancario solicitante, int monto, int plazo) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public double montoCuotaMensual(){
		return monto / plazo;
	}
	
	public abstract boolean esAceptable();
	
	public int getMonto(){
		return this.monto;
	}
	
	
}
