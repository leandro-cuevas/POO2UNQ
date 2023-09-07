package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {

	private LocalDate fechaFinalizacionContrato;

	private int cantHorasExtra;

	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			int cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		this.cantHorasExtra = cantHorasExtra;
	}

	private int getCantHorasExtra() {
		return this.cantHorasExtra;
	}

	private int sueldoHorasExtra() {
		final int precioHoraExtra = 40;
		return precioHoraExtra * getCantHorasExtra();
	}

	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.sueldoHorasExtra();
	}
	
	@Override
	protected int retencionGastosAdministrativos() {
		return 0;
	}

	@Override
	protected int retencionPorObraSocial() {
		int monto = (int) (this.sueldoBruto() * 0.1);
		if (this.edad() >= 50) {
			monto += 25;
		}
		return monto;
	}

	@Override
	protected int retencionPorJubilacion() {
		return (int) (this.sueldoBruto() * 0.1 + this.getCantHorasExtra() * 5);
	}

	@Override
	public void generarDesgloceDeConceptos() {
		conceptos.add(new Concepto ("Sueldo básico", this.getSueldoBasico()));
		conceptos.add(new Concepto ("Horas extras", this.sueldoHorasExtra()));
		conceptos.add(new Concepto ("Descuento Obra social", this.retencionPorObraSocial()));
		conceptos.add(new Concepto ("Descuento Jubilación", this.retencionPorJubilacion()));
	}
}