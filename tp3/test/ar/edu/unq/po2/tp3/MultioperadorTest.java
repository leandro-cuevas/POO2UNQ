package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class MultioperadorTest {

	@Test	
	void multiOperadorTest() {
		
		List<Integer> prueba = new ArrayList<Integer>();
		prueba.add(1);
		prueba.add(2);
		prueba.add(3);
		prueba.add(4);
		assertEquals(Multioperador.sumarTodos(prueba), 10);
		assertEquals(Multioperador.restarTodos(prueba), -10);
		assertEquals(Multioperador.multiplicarTodos(prueba), 24);
	}

}
