package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

class EmpleadoContratado extends Empleado {

	private String numeroDeContrato;
	
	private String modoDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, String numeroDeContrato, String modoDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		this.numeroDeContrato = numeroDeContrato;
		this.modoDePago = modoDePago;
	}

	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico();
	}

	public int retencionGastosAdministrativos() {
		
		 final int gastosAdministrativos = 50;
		
		return gastosAdministrativos;
	}

	@Override
	protected int retencionPorObraSocial() {
		return 0;
	} 

	@Override
	protected int retencionPorJubilacion() {
		return 0;
	}

	@Override
	public String desgloceDeConceptos() {
		return "Retención de Gastos Administrativos: $" + this.retencionGastosAdministrativos();
	}

}
