package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplosTest {

	@Test
	void encontrarMaximoMultiploTest() {
		int resultado = Multiplos.encontrarMaximoMultiplo(3, 9);
		assertEquals(resultado, 999);
	}
}
