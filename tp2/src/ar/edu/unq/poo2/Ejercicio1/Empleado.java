package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {

	protected String nombre;

	protected String direccion;

	protected String estadoCivil;

	protected LocalDate fechaNacimiento;

	private int sueldoBasico = 1000;
	
	protected List<Concepto> conceptos;

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.conceptos = new ArrayList<Concepto>();

	}

	public int getSueldoBasico() {
		return this.sueldoBasico;
	}

	protected String getEstadoCivil() {
		return this.estadoCivil;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int edad() {
		Period period = Period.between(fechaNacimiento, LocalDate.now());
		return period.getYears();
	}

	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public int retenciones() {
		return this.retencionPorObraSocial() + this.retencionPorJubilacion() + this.retencionGastosAdministrativos();
	}
	
	abstract public int sueldoBruto();

	abstract protected int retencionPorObraSocial();

	abstract protected int retencionPorJubilacion();
	
	abstract protected int retencionGastosAdministrativos();

	abstract public void generarDesgloceDeConceptos();

	public List<Concepto> getConceptos() {
		return conceptos;
	}

}
