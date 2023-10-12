package ar.edu.unq.po2;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.internal.matchers.Equals;

class PokerStatusTest {

	private PokerStatus pokerS;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerS = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}

	@Test
	void verificarTest() {
		when(carta1.getPalo()).thenReturn(Palo.PICA);
		when(carta2.getPalo()).thenReturn(Palo.PICA);
		when(carta3.getPalo()).thenReturn(Palo.PICA);
		when(carta4.getPalo()).thenReturn(Palo.PICA);
		when(carta5.getPalo()).thenReturn(Palo.PICA);
		
		assertEquals("Color", pokerS.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	void verificarTrio() {
		when(carta1.getPalo()).thenReturn(Palo.PICA);
		when(carta2.getPalo()).thenReturn(Palo.DIAMENTE);
		when(carta2.getNumero()).thenReturn(2);
		when(carta3.getPalo()).thenReturn(Palo.PICA);
		when(carta3.getNumero()).thenReturn(2);
		when(carta4.getPalo()).thenReturn(Palo.PICA);
		when(carta2.getNumero()).thenReturn(3);
		when(carta5.getPalo()).thenReturn(Palo.PICA);
		when(carta2.getNumero()).thenReturn(10);
		
		assertEquals("Trio", pokerS.verificar(carta5, carta4, carta3, carta2, carta1));

	}
	
	@Test
	void verificarPoker() {
		when(carta1.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta2.getPalo()).thenReturn(Palo.PICA);
		when(carta3.getPalo()).thenReturn(Palo.PICA);
		when(carta4.getPalo()).thenReturn(Palo.PICA);
		when(carta5.getPalo()).thenReturn(Palo.PICA);
		when(carta1.getNumero()).thenReturn(2);
		when(carta2.getNumero()).thenReturn(2);
		when(carta3.getNumero()).thenReturn(2);
		when(carta4.getNumero()).thenReturn(2);
		when(carta5.getNumero()).thenReturn(2);
		assertEquals("Poker", pokerS.verificar(carta5, carta4, carta3, carta2, carta1));

	}

}
