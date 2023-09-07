package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	private int cantidadHijes;

	private int antiguedad;

	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			int cantidadHijes, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		this.cantidadHijes = cantidadHijes;
		this.antiguedad = antiguedad;
	}

	private int getCantidadHijes() {
		return this.cantidadHijes;
	}	

	private int getAntiguedad() {
		return this.antiguedad;
	}

	private int asignacionPorHijes() {
		return this.getCantidadHijes() * 150;
	}

	private int asignacionPorConyuge() {
		if (this.getEstadoCivil() == "Casado") {
			return 100;
		} else
			return 0;
	}

	private int asignacionPorAntiguedad() {
		return this.getAntiguedad() * 50;
	}

	private int salarioFamiliar() {
		return this.asignacionPorHijes() + this.asignacionPorConyuge() + this.asignacionPorAntiguedad();
	}

	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}
	
	@Override
	protected int retencionGastosAdministrativos() {
		return 0;
	}

	@Override
	protected int retencionPorObraSocial() {
		return (int) (this.sueldoBruto() * 0.10 + this.getCantidadHijes() * 20);
	}

	@Override
	protected int retencionPorJubilacion() {
		return (int) (this.sueldoBruto() * 0.15);
	}

	@Override
	public void generarDesgloceDeConceptos() {
		conceptos.add(new Concepto ("Sueldo básico", this.getSueldoBasico()));
		conceptos.add(new Concepto ("Salario familiar", this.salarioFamiliar()));
		conceptos.add(new Concepto ("Asignación por hije", this.asignacionPorHijes()));
		conceptos.add(new Concepto ("Asignación por conyuge", this.asignacionPorConyuge()));
		conceptos.add(new Concepto ("Antigüedad", this.asignacionPorAntiguedad()));
		conceptos.add(new Concepto ("Descuento Obra social", this.retencionPorObraSocial()));
		conceptos.add(new Concepto ("Descuento Jubilación", this.retencionPorJubilacion()));
	}
}
