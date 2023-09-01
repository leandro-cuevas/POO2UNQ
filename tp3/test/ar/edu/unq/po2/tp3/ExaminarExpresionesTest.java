package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExaminarExpresionesTest {

	@Test
	void testTexto() {
		String a = "abc";
		String s = a;
		String t;
		
		assertEquals(s.length(), 3); // Da 3 porque es el largo del string.
		//t.length(); No se puede pedir el length de un null.
		//1 + a; No se puede sumar un número a un string si el string viene primero y no se asigna una variable.
		
		assertEquals(a.toUpperCase(), "ABC"); //Lo vuelve mayúscula.
		assertEquals("Libertad".indexOf("r"), 4);
		assertEquals("Universidad".lastIndexOf('i'), 7);
		assertEquals("Quilmes".substring(2,4), "il"); //Devuelve el string a partir del index 2, hasta uno antes del index 4.
		assertEquals((a.length() + a), "3abc");
		assertTrue((a.length() + a).startsWith("a") == false);
		assertTrue(s == a);
		assertTrue(a.substring(1,3).equals("bc") == true);

	}

}
