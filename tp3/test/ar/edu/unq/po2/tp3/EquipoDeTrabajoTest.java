package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class EquipoDeTrabajoTest {

	Persona2 p1;
	Persona2 p2;
	Persona2 p3;
	Persona2 p4;
	Persona2 p5;
	EquipoDeTrabajo equipo;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Persona2 ("Leandro", "Cuevas", 27);
		p2 = new Persona2 ("Rodrigo", "Bolanios", 19);
		p3 = new Persona2 ("Nacho", "Moreiratoja", 32);
		p4 = new Persona2 ("Thiaguito", "Sofarelli", 20);
		p5 = new Persona2 ("William", "Sinapellido", 35);
		equipo = new EquipoDeTrabajo("Los maravillosos 5");
		equipo.agregarAlEquipo(p1);
		equipo.agregarAlEquipo(p2);
		equipo.agregarAlEquipo(p3);
		equipo.agregarAlEquipo(p4);
		equipo.agregarAlEquipo(p5);
	}

	@Test
	void test() {
		assertEquals(26, equipo.promedioDeEdadEquipo());
	}

}
