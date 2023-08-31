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
				
		empleadotemporal = new EmpleadoTemporario("Leandro", "Evergreen Avenue", "Soltero", LocalDate.of(1996, 8, 16));
		empleadopermanente = new EmpleadoPermanente("Nacho", "Fake Street", "Casado", LocalDate.of(1990, 6, 23), 2, 10);
		empleadocontratado = new EmpleadoContratado("Rodri", "Quilmes Road", "Viudo", LocalDate.of(2001, 7, 30), "0120230101", "Efectivo");
		empresa = new Empresa("Empresario Feliz", "17121234562");
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
