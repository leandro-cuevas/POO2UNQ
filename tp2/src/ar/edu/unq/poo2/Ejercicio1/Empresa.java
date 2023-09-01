package ar.edu.unq.poo2.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Empresa {

	private String nombre;

	private String cuit;

	private List<Empleado> empleados = new ArrayList<Empleado>();

	private List<ReciboHaberes> recibosEmitidos = new ArrayList<ReciboHaberes>();

	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public List<ReciboHaberes> getRecibos() {
		return this.recibosEmitidos;
	}

	public int totalSueldosNeto() {

		return this.getEmpleados().stream().mapToInt(e -> e.sueldoNeto()).sum();
	}

	public int totalSueldosBruto() {

		return this.getEmpleados().stream().mapToInt(e -> e.sueldoBruto()).sum();
	}

	public int totalRetenciones() {

		return this.getEmpleados().stream().mapToInt(e -> e.retenciones()).sum();
	}

	public void contratarTrabajador(Empleado empleado) {
		empleados.add(empleado);
	}

	private void liquidarSueldo(Empleado empleado) {

		getRecibos().add(new ReciboHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(),
				empleado.sueldoNeto(), empleado.sueldoBruto(), empleado.desgloceDeConceptos()));
	}

	public void realizarLiqDeSueldos() {
		getEmpleados().stream().forEach(e -> this.liquidarSueldo(e));
	}
}
