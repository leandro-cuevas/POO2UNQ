package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	ProductoEmpresa leche;
	Cooperativa galletitas;
	ProductoEmpresa nesquik;
	
	@BeforeEach
	void setUp() {
		leche = new ProductoEmpresa(100, 50);
		galletitas = new Cooperativa(200, 50);
		nesquik = new ProductoEmpresa(300, 50);
	}
	
	@Test
	public void testPrecios() {
		assertEquals(100, leche.getPrecio());
		assertEquals(300, nesquik.getPrecio());
		assertEquals(180, galletitas.getPrecio());
	}
}