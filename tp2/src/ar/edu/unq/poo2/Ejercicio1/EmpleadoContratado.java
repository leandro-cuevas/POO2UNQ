package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

class EmpleadoContratado extends Empleado {

	private int numeroDeContrato;
	
	private String modoDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
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
