package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	Caja caja;
	ProductoEmpresa leche;
	Cooperativa galletitas;
	ProductoEmpresa nesquik;
	
	@BeforeEach
	void setUp() {
		caja = new Caja();
		leche = new ProductoEmpresa(100, 50);
		galletitas = new Cooperativa(200, 50);
		nesquik = new ProductoEmpresa(300, 50);
	}

	@Test
	void test() {
		caja.registrarPago(galletitas);
		caja.registrarPago(leche);
		caja.registrarPago(nesquik);
		assertEquals(580, caja.getMontoTotal());
	}

}