package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	
	private String direccion;
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto (Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	double getPrecioTotal() {
		return productos.stream().mapToDouble(e-> e.getPrecio()).sum();
	}
	
}
