package ar.edu.unq.poo2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import java.time.Period;

class EmpleadoTest {

	private EmpleadoTemporario empleadotemporal;
	private EmpleadoPermanente empleadopermanente;
	private EmpleadoContratado empleadocontratado;
	private Empresa empresa;
	
	@BeforeEach
	void setUp() {
				
		empleadotemporal = new EmpleadoTemporario("Leandro", "Evergreen Avenue", "Soltero", LocalDate.of(1930, 8, 16), 4);
		empleadopermanente = new EmpleadoPermanente("Nacho", "Fake Street", "Casado", LocalDate.of(1990, 6, 23), 2, 10);
		empleadocontratado = new EmpleadoContratado("Rodri", "Quilmes Road", "Viudo", LocalDate.of(2001, 7, 30), "0120230101", "Efectivo");
		empresa = new Empresa("Empresario Feliz", "17121234562");
		empresa.contratarTrabajador(empleadotemporal);
		empresa.contratarTrabajador(empleadopermanente);
		empresa.contratarTrabajador(empleadocontratado);

	}
	
	@Test
	void valoresDelTemporario() {
		assertEquals(1160, empleadotemporal.sueldoBruto());
		assertEquals(277, empleadotemporal.retenciones());
		assertEquals(883, empleadotemporal.sueldoNeto());
		assertEquals(empleadotemporal.desgloceDeConceptos(),
			"Sueldo bruto está compuesto por:\n"+
			"Sueldo básico: $1000\n" +
			"Horas extras: $160\n" +
			"Se descuenta en calidad de retenciones:\n" +
			"Obra social: $141\n" +
			"Jubilación: $136");
	}
	
	@Test
	void valoresDelPermanente() {
		assertEquals(1900, empleadopermanente.sueldoBruto());
		assertEquals(515, empleadopermanente.retenciones());
		assertEquals(1385, empleadopermanente.sueldoNeto());
	}
	
	@Test
	void valoresDelContratado() {
		assertEquals(1000, empleadocontratado.sueldoBruto());
		assertEquals(50, empleadocontratado.retenciones());
		assertEquals(950, empleadocontratado.sueldoNeto());
	}
	
	@Test
	void testEnEmpresa() {
		assertEquals(3, empresa.getEmpleados().size());
		assertEquals(4060, empresa.totalSueldosBruto());
		assertEquals(842, empresa.totalRetenciones());
		assertEquals(3218, empresa.totalSueldosNeto());
		empresa.realizarLiqDeSueldos();
		assertEquals(3, empresa.getRecibos().size());
	}

}
