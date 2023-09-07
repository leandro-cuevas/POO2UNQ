package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoContratado extends Empleado {

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

	@Override
	protected int retencionGastosAdministrativos() {
		
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
	public void generarDesgloceDeConceptos() {
		conceptos.add(new Concepto ("Sueldo básico", this.getSueldoBasico()));
		conceptos.add(new Concepto("Gastos Administrativos", this.retencionGastosAdministrativos()));
		conceptos.add(new Concepto ("Descuento Obra social", this.retencionPorObraSocial()));
		conceptos.add(new Concepto ("Descuento Jubilación", this.retencionPorJubilacion()));
	}

}
