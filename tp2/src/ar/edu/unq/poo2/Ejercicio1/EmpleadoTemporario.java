package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

class EmpleadoTemporario extends Empleado {

	private LocalDate fechaFinalizacionContrato;

	private int cantHorasExtra;

	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, int cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		this.cantHorasExtra = cantHorasExtra;
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
	protected int retencionPorObraSocial() {

		int monto = (int)(this.sueldoBruto() * 0.1);

		if (this.edad() >= 50) {
			monto += 25;
		} 
		return monto;
	}

	@Override
	protected int retencionPorJubilacion() {
		return (int)(this.sueldoBruto() * 0.1 + this.getCantHorasExtra() * 5);
	}

	private int getCantHorasExtra() {
		return this.cantHorasExtra;
	}

	@Override
	public String desgloceDeConceptos() {
		return  "Sueldo bruto está compuesto por:\n" + 
				"Sueldo básico: $" + this.getSueldoBasico() + "\n" +
				"Horas extras: $" + this.sueldoHorasExtra() + "\n" +
				"Se descuenta en calidad de retenciones:\n" +
				"Obra social: $" + this.retencionPorObraSocial() + "\n" +
				"Jubilación: $" + this.retencionPorJubilacion();
		
	}

}
