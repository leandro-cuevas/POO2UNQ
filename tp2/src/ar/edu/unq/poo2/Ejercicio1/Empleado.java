package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleado {

	protected String nombre;
	
	protected String direccion;
	
	protected String estadoCivil;
	
	protected LocalDate fechaNacimiento;
	
	private int sueldoBasico = 1000;
	
	public Empleado (String nombre,
					 String direccion,
					 String estadoCivil,
					 LocalDate fechaNacimiento) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	public int edad() {
		        Period period = Period.between(fechaNacimiento, LocalDate.now());
		        return period.getYears();
	}
	
	abstract public int sueldoBruto();
	
	
	abstract protected int retencionPorObraSocial();
	
	abstract protected int retencionPorJubilacion();
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public int getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int retenciones() {
		return this.retencionPorObraSocial() + this.retencionPorJubilacion();
	}
	
	protected String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	abstract public String desgloceDeConceptos();

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}
}
