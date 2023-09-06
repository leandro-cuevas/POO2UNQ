package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	Trabajador nacho;
	Ingreso ingreso1;
	Ingreso ingreso2;
	
	@BeforeEach
	void setUp() throws Exception {
		nacho = new Trabajador("Nacho");
		ingreso1 = new Ingreso("Enero", "Trabajar mucho", 77.75d);
		ingreso2 = new IngresoPorHora("Febrero", "TrabajarPoco", 88d, 4);
		nacho.agregarIngreso(ingreso1);
		nacho.agregarIngreso(ingreso2);
	}

	@Test
	void test() {
		assertEquals(165.75d, nacho.getTotalPercibido());
		assertEquals(77.75d, nacho.getMontoImponible());
		assertEquals(1.555, nacho.impuestoAPagar());
	}

}
