package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trabajador {

	private String nombre;

	private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();

	Trabajador(String nombre) {
		this.nombre = nombre;
	}

	public double getTotalPercibido() {
		return this.ingresosPercibidos.stream().mapToDouble(e -> e.getMonto()).sum();
	}
	
	public double getMontoImponible() {
		return this.ingresosPercibidos.stream().mapToDouble(e -> e.getMontoImponible()).sum();
	}
	
	public double impuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void agregarIngreso(Ingreso e) {
		ingresosPercibidos.add(e);
	}
	

}
