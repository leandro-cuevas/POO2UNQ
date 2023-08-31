package ar.edu.unq.poo2.Ejercicio1;

import java.util.List;

import java.time.LocalDate;

class Empresa {

	private String nombre;
	
	private String cuit;
	
	List<Empleado> empleados;
	
	List<ReciboHaberes> recibosEmitidos;
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public int totalSueldosNeto() {
		
		int sumaSueldos = 0;
		
		for(Empleado empleado : empleados) {
			sumaSueldos += empleado.sueldoNeto();
		}
		return sumaSueldos;
	}
	
	public int totalSueldosBruto() {
		
		int sumaSueldos = 0;
		
		for(Empleado empleado : empleados) {
			sumaSueldos += empleado.sueldoBruto();
		}
		return sumaSueldos;	
	}
	
	public int totalRetenciones() {

		int sumaRetenciones= 0;
		
		for(Empleado empleado : empleados) {
			sumaRetenciones += empleado.retenciones();
		}
		return sumaRetenciones;	
	}
	
	public void contratarTrabajador(Empleado empleado) {
		empleados.add(empleado);
	}
	
	
	public void realizarLiqDeSueldos() {
		for (Empleado e: empleados) {
			recibosEmitidos.add(new ReciboHaberes(e.getNombre(), e.getDireccion(), LocalDate.now(), e.sueldoNeto(), e.sueldoBruto(), e.desgloceDeConceptos()));
		}
	}
	
}
