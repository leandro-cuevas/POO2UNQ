package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DisarmerTestCase {

	@Test
	public void elDisarmerFunciona() {
		int amount = Disarmer.contarPares(5394128);
		
		assertEquals(amount, 3);
		
	}
	
	@Test
	public void elQueMasParesTieneTest() throws Exception {
		List<Integer> numerosPrueba = new  ArrayList<Integer>();
		numerosPrueba.add(12345);
		numerosPrueba.add(2468);
		numerosPrueba.add(13579);
		numerosPrueba.add(4681);
		int resultado = Disarmer.elQueMasParesTiene(numerosPrueba);
		assertEquals(resultado, 2468);

	}

}
