package ar.edu.unq.poo2.Ejercicio1;

import java.util.List;

class Empresa {

	private String nombre;
	
	private String cuit;
	
	List<Empleado> empleados;
	
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
	
	public void liquidarHaberes() {
		
	}
	
}
