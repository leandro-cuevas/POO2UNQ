package ar.edu.unq.poo2.Ejercicio1;

import java.time.LocalDate;
import java.util.List;

public class ReciboHaberes {
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private int sueldoNeto;
	private int sueldoBruto;
	private List<Concepto> desgloceDeConceptos;
	
	public ReciboHaberes (String nombre, String direc, LocalDate fechaEmision, int sueldoN, int sueldoB, List<Concepto> desgloceDeConceptos) {
		this.nombreEmpleado = nombre;
		this.direccion = direc;
		this.fechaDeEmision = fechaEmision;
		this.sueldoNeto = sueldoN;
		this.sueldoBruto = sueldoB;
		this.desgloceDeConceptos  = desgloceDeConceptos;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public int getSueldoNeto() {
		return sueldoNeto;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public List<Concepto> getDesgloceDeConceptos() {
		return desgloceDeConceptos;
	}
}