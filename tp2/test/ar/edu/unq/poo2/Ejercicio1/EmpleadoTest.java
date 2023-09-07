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

		empleadotemporal = new EmpleadoTemporario("Leandro", "Evergreen Avenue", "Soltero", LocalDate.of(1930, 8, 16),
				4);
		empleadopermanente = new EmpleadoPermanente("Nacho", "Fake Street", "Casado", LocalDate.of(1990, 6, 23), 2, 10);
		empleadocontratado = new EmpleadoContratado("Rodri", "Quilmes Road", "Viudo", LocalDate.of(2001, 7, 30),
				"0120230101", "Efectivo");
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
		empleadotemporal.generarDesgloceDeConceptos();
		assertEquals(4, empleadotemporal.getConceptos().size());
		assertEquals("Sueldo básico", empleadotemporal.getConceptos().get(0).getNombre());
	}

	@Test
	void valoresDelPermanente() {
		assertEquals(1900, empleadopermanente.sueldoBruto());
		assertEquals(515, empleadopermanente.retenciones());
		assertEquals(1385, empleadopermanente.sueldoNeto());
		empleadopermanente.generarDesgloceDeConceptos();
		assertEquals(7, empleadopermanente.getConceptos().size());
		assertEquals("Sueldo básico", empleadopermanente.getConceptos().get(0).getNombre());

	}

	@Test
	void valoresDelContratado() {
		assertEquals(1000, empleadocontratado.sueldoBruto());
		assertEquals(50, empleadocontratado.retenciones());
		assertEquals(950, empleadocontratado.sueldoNeto());
		empleadocontratado.generarDesgloceDeConceptos();
		assertEquals(4, empleadocontratado.getConceptos().size());
		assertEquals("Sueldo básico", empleadocontratado.getConceptos().get(0).getNombre());

	}

	@Test
	void testEnEmpresa() {
		assertEquals(4060, empresa.totalSueldosBruto());
		assertEquals(842, empresa.totalRetenciones());
		assertEquals(3218, empresa.totalSueldosNeto());
		empresa.realizarLiqDeSueldos();
		assertEquals(4, empleadotemporal.getConceptos().size());
		assertEquals(7, empleadopermanente.getConceptos().size());
		assertEquals(4, empleadocontratado.getConceptos().size());
	}
}