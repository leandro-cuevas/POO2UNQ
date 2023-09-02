package ar.edu.unq.po2.tp3;
import ar.edu.unq.po2.tp3.Point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadrilateroTest {

	Point puntoInicio;
	Point puntoAbajoIzquierda;
	Point puntoArribaDerecha;
	Point puntoAbajoDerecha;
	Rectangulo rectangulo;
	Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() throws Exception {
		puntoInicio = new Point();
		puntoAbajoIzquierda = new Point(-4, 0);
		puntoArribaDerecha = new Point(0, 10);
		puntoAbajoDerecha = new Point(-4, 10);
		rectangulo = new Rectangulo(puntoInicio, 4, 10);
		cuadrado = new Cuadrado (puntoInicio, 2);
	}

	@Test
	void losPuntosEstanDondeCorresponden() {
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(), 0);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(), 0);
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getX(), -4);
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getY(), 0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(), 0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(), 10);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(), -4);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(), 10);
		}
	
	@Test
	void esHorizonal() {
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	void noEsVertical() {
		assertFalse(rectangulo.esVertical());
	}
	
	@Test
	void areaYPerimetro() {
		assertEquals(rectangulo.area(), 40);
		assertEquals(rectangulo.perimetro(), 28);
		assertEquals(cuadrado.area(), 4);
		assertEquals(cuadrado.perimetro(), 8);

	}

}
