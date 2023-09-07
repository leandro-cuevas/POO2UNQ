package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MercadoCentral {
	
	private ArrayList<Agencia> productosRegistrados;

	MercadoCentral() {
        productosRegistrados = new ArrayList<>();
    }

	 private void facturar(Agencia facturable) {
		 facturable.registrarPago(new Factura(facturable.precioFinal(), LocalDate.now()));;
	 }
	
    public void agregarProducto(Producto producto) {
    	if (producto.disponible()) {
    		productosRegistrados.add(producto);
    		this.facturar(producto);
    	}
    }

    public double calcularMontoTotal() {
    	return productosRegistrados.stream().collect(Collectors.summingDouble(facturable -> facturable.precioFinal()));
    }

    public void informarCliente() {
    	System.out.println("El monto total es: $" + this.calcularMontoTotal());
    }
}
