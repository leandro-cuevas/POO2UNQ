package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;

public class ReciboHaberes {
	public String nombreEmpleado;
	public String direccion;
	public LocalDate fechaDeEmision;
	public int sueldoNeto;
	public int sueldoBruto;
	
	public ReciboHaberes (String nombre, String direc, LocalDate fechaEmision, int sueldoN, int sueldoB) {
		this.nombreEmpleado = nombre;
		this.direccion = direc;
		this.fechaDeEmision = fechaEmision;
		this.sueldoNeto = sueldoN;
		this.sueldoBruto = sueldoB;
	}
}