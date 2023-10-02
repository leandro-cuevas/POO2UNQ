package ar.edu.unq.po2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DermatologicoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void elSiguienteDeRojoEsGris() {
		assertEquals(Dermatologico.Gris, Dermatologico.siguienteNivelDeRiesgo(Dermatologico.Rojo));
	}
	
	@Test
	void elSiguienteDeGrisEsAmarillo() {
		assertEquals(Dermatologico.Amarillo, Dermatologico.siguienteNivelDeRiesgo(Dermatologico.Gris));
	}
	
	@Test
	void elSiguienteDeAmarilloEsMiel() {
		assertEquals(Dermatologico.Miel, Dermatologico.siguienteNivelDeRiesgo(Dermatologico.Amarillo));
	}
	
	@Test
	void elSiguienteDeMielEsRojo() {
		assertEquals(Dermatologico.Rojo, Dermatologico.siguienteNivelDeRiesgo(Dermatologico.Miel));
	}
	
	@Test
	void elNivelDeRiesgoTaBien() {
		assertEquals(0, Dermatologico.getNivelDeRiesgo(Dermatologico.Rojo));
	}
	

}
