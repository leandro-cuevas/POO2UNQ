package ar.edu.unq.po2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public class GuerreroDelAzarTestCase {
	
	private GuerreroDelAzar guerreroAzar;
	private IGuerrero otroGuerrero ;
	private IMoneda unaMoneda;
	
	@Before
	public void setUp(){
		// setUp
		otroGuerrero = mock(IGuerrero.class);
		unaMoneda = mock(IMoneda.class);
		
		//Test Double Instalation
		guerreroAzar = new GuerreroDelAzar(1000, 500, unaMoneda);
		
	}

	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {
		
		//Test Double Configuration
		when(unaMoneda.esCara()).thenReturn(true);
		
		//Exercise
		guerreroAzar.atacar(otroGuerrero);
		
		//Verify
		verify(otroGuerrero, times(1)).descontarVida(500);
	}	
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentanPuntosDeVidaDeSiMismo(){
		
		//Test Double Configuration
		when(unaMoneda.esCara()).thenReturn(false);
		
		//Exercise
		guerreroAzar.atacar(otroGuerrero);
		
		//Verify
		verify(otroGuerrero, times(0)).descontarVida(500);
		verify(otroGuerrero, never()).descontarVida(500);
	}		
}