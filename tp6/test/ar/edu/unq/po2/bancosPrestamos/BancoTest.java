package ar.edu.unq.po2.bancosPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	Propiedad deptoEnTigre;
	Propiedad deptoEnQuilmes;
	ClienteBancario rodri;
	ClienteBancario nachito;
	Banco banco;
	
	
	@BeforeEach
	void setUp() throws Exception {
		deptoEnTigre = new Propiedad("Casa comoda y cara", "Carpincho Feliz 2047", 120000d);
		deptoEnQuilmes = new Propiedad("Humilde pero tiene rejas", "Cervecero 146", 12000d);
		rodri = new ClienteBancario("Rodri", "Bolanios", "Cerca de Quilmes", 19, 100000d);
		nachito = new ClienteBancario("Nachito", "Moreiratoja", "El dorado", 62, 100000d);
		banco = new Banco();
		banco.agregarCliente(nachito);
		banco.agregarCliente(rodri);		
	}

	@Test
	void rodriPideUnCreditoQuePuedePagar() {
		rodri.solicitarCreditoPersonal(banco, 20000, 6);
		assertTrue(banco.getSolicitudes().get(0).esAceptable());
		rodri.solicitarCreditoHipotecario(banco, 200000, 3, deptoEnTigre);
		assertTrue(banco.getSolicitudes().get(1).esAceptable());
	}
	
	@Test
	void nachoNoPuedePedirCreditosADemasiadosMeses() {
		nachito.solicitarCreditoHipotecario(banco, 10000, 36, deptoEnQuilmes);
		assertFalse(banco.getSolicitudes().get(0).esAceptable());
	}
	
	@Test
	void elBancoTieneQueDesembolsar() {
		rodri.solicitarCreditoPersonal(banco, 20000, 6);
		rodri.solicitarCreditoHipotecario(banco, 200000, 3, deptoEnTigre);
		nachito.solicitarCreditoHipotecario(banco, 10000, 36, deptoEnQuilmes);
		assertEquals(220000, banco.totalADesembolsar());
	}
}
