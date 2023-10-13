package ar.edu.unq.po2.Cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Cultivos.GestorDeCultivos;
import ar.edu.unq.po2.Cultivos.PorcionProductivaMixta;
import ar.edu.unq.po2.Cultivos.PorcionProductivaSoja;
import ar.edu.unq.po2.Cultivos.PorcionProductivaTrigo;

class CultivablesTest {

	GestorDeCultivos sociedadRural;
	
	PorcionProductivaMixta mixta;
	
	PorcionProductivaTrigo trigo1;
	PorcionProductivaTrigo trigo2;
	PorcionProductivaTrigo trigo3;
	PorcionProductivaTrigo trigo4;
	PorcionProductivaSoja soja1;
	PorcionProductivaSoja soja2;
	PorcionProductivaSoja soja3;
	PorcionProductivaSoja soja4;
	
	@BeforeEach
	void setUp() throws Exception {
		sociedadRural = new GestorDeCultivos();
		trigo1 = new PorcionProductivaTrigo(100);
		trigo2 = new PorcionProductivaTrigo(200);
		trigo3 = new PorcionProductivaTrigo(300);
		trigo4 = new PorcionProductivaTrigo(400);
		soja1 = new PorcionProductivaSoja(100);
		soja2 = new PorcionProductivaSoja(200);
		soja3 = new PorcionProductivaSoja(300);
		soja4 = new PorcionProductivaSoja(400);
		mixta = new PorcionProductivaMixta(soja1, soja2, trigo3, trigo4);
		sociedadRural.agregarCultivable(mixta);
		sociedadRural.agregarCultivable(soja3);
		sociedadRural.agregarCultivable(soja4);
		sociedadRural.agregarCultivable(trigo1);
		sociedadRural.agregarCultivable(trigo2);

	}          

	@Test
	void test() {
		assertEquals(1000, sociedadRural.getPrecioSoja());
		assertEquals(1000, sociedadRural.getPrecioTrigo());
	}

}