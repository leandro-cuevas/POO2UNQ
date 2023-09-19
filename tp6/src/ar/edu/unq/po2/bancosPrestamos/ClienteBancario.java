package ar.edu.unq.po2.bancosPrestamos;

public class ClienteBancario {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	public ClienteBancario(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual*12;
	}
	
	public void solicitarCreditoPersonal(Banco banco, int montoCredito, int meses) {
		banco.recepcionarSolicitudCredito(this, montoCredito, meses);
	}
	
	public void solicitarCreditoHipotecario(Banco banco, int montoCredito, int meses, Propiedad propiedad) {
		banco.recepcionarSolicitudCredito(this, montoCredito, meses, propiedad);
	}
}
