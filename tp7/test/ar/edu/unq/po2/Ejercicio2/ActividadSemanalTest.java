package ar.edu.unq.po2.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.datatransfer.StringSelection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

class ActividadSemanalTest {

	ActividadSemanal tennisSabado;
	@BeforeEach
	void setUp() throws Exception {
		tennisSabado= new ActividadSemanal(DiaDeLaSemana.Sabado, 20, 4, Deporte.Tennis);
	}

	@Test
	void testConstructor() {
		assertEquals(Deporte.Tennis, tennisSabado.getDeporte());
		assertEquals(DiaDeLaSemana.Sabado, tennisSabado.getDia());
		assertEquals(1600, tennisSabado.getCosto());
		assertEquals(4, tennisSabado.getDuracion());
		assertEquals(20, tennisSabado.getHoraInicio());
	}
	
	@Test
	void toStringTest() {
		assertEquals(tennisSabado.toString(), "Deporte: Tennis. Sabado a las 20. Duracion: 4 hora(s)");
	}

}
