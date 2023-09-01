package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DisarmerTestCase {

	@Test
	public void elDisarmerFunciona() {
		int amount = Disarmer.contarPares(5394128);
		
		assertEquals(amount, 3);
		
	}

}
