package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleado {

	private String nombre;
	
	private String direccion;
	
	private String estadoCivil;
	
	private LocalDate  fechaNacimiento;
	
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
	        LocalDate currentDate = LocalDate.now();
	        Period period = Period.between(fechaNacimiento, currentDate);
	        return period.getYears();
	}
	
	abstract public int sueldoBruto();
	
	abstract public int retenciones();
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
}
