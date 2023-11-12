package ar.edu.unq.po2.recuperatorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cliente {
	
	private List<Compra> compras;
	
	private Periodo periodo;
	
	private String mail;

	public Cliente() {
		this.compras = new ArrayList<Compra>();
		this.periodo = new PeriodoBienvenida();
	}
	
	public List<Compra> getCompras(){
		return this.compras;
	}
	
	public void hacerCompra(int monto) {
		periodo.hacerCompra(this, monto);
	}
	
	public void registrarCompra(Compra compra) {
		compras.add(compra);
	}
	
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	public boolean esFidelizado() {
		return periodo.esFidelizado();
	}

	public double getMontoConsumido() {
		return compras.stream().mapToDouble(e-> e.montoFinal()).sum();
	}
	

}
