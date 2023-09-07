package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MercadoCentral {
	
	private ArrayList<Producto> productosRegistrados;

	MercadoCentral() {
        productosRegistrados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
    	if (producto.disponible()) {
    		productosRegistrados.add(producto);
    		producto.setStock(producto.getStock() - 1);    		
    	}
    }

    public double calcularMontoTotal() {
    	return productosRegistrados.stream().collect(Collectors.summingDouble(producto -> producto.precioFinal()));
    }

    public void informarCliente() {
    	System.out.println("El monto total es: $" + this.calcularMontoTotal());
    }
}
