package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

class EmpleadoTemporario extends Empleado {

	private LocalDate fechaFinalizacionContrato;

	private int cantHorasExtra;

	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
	}

	@Override
	public int sueldoBruto() {

		final int precioHoraExtra = 40;

		return this.getSueldoBasico() + (precioHoraExtra * getCantHorasExtra());
	}

	private int retencionJubilacion() {

		int monto = (this.sueldoBruto() * 10) / 100;

		if (this.edad() >= 50) {
			monto += 25;
		}
		return monto;
	}

	private int retencionHorasExtra() {
		return (this.sueldoBruto() * 10) / 100 + this.getCantHorasExtra() * 5;
	}

	@Override
	public int retenciones() {

		return this.retencionHorasExtra() + this.retencionJubilacion();
	}

	private int getCantHorasExtra() {
		return this.cantHorasExtra;
	}

}
