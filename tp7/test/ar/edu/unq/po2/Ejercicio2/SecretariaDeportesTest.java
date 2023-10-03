package ar.edu.unq.po2.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeportesTest {

	SecretariaDeDeportes secretariaQuilmes;
	ActividadSemanal futbolLunes;
	ActividadSemanal futbolMiercoles;
	ActividadSemanal futbolViernes;
	ActividadSemanal runningDomingo;
	ActividadSemanal bascketMartes;
	ActividadSemanal bascketJueves;
	ActividadSemanal tennisSabado;
	ActividadSemanal asd;
	Map<Deporte, ActividadSemanal> mapeo;
	
	@BeforeEach
	void setUp() throws Exception {

		secretariaQuilmes = new SecretariaDeDeportes();
		futbolLunes = new ActividadSemanal(DiaDeLaSemana.Lunes, 14, 2, Deporte.Futbol);
		futbolMiercoles = new ActividadSemanal(DiaDeLaSemana.Miercoles, 14, 2, Deporte.Futbol);
		futbolViernes = new ActividadSemanal(DiaDeLaSemana.Viernes, 14, 2, Deporte.Futbol);
		runningDomingo = new ActividadSemanal(DiaDeLaSemana.Domingo, 16, 4, Deporte.Running);
		bascketMartes = new ActividadSemanal(DiaDeLaSemana.Martes, 20, 4, Deporte.Basket);
		bascketJueves= new ActividadSemanal(DiaDeLaSemana.Jueves, 20, 4, Deporte.Basket);
		tennisSabado= new ActividadSemanal(DiaDeLaSemana.Sabado, 20, 4, Deporte.Tennis);
		secretariaQuilmes.agregarActividad(futbolLunes);
		secretariaQuilmes.agregarActividad(futbolMiercoles);
		secretariaQuilmes.agregarActividad(futbolViernes);
		secretariaQuilmes.agregarActividad(runningDomingo);
		secretariaQuilmes.agregarActividad(bascketMartes);
		secretariaQuilmes.agregarActividad(bascketJueves);
		secretariaQuilmes.agregarActividad(tennisSabado);
		mapeo = new HashMap<Deporte, ActividadSemanal>();
		mapeo.put(Deporte.Basket, bascketMartes);
		mapeo.put(Deporte.Running, runningDomingo);
		mapeo.put(Deporte.Futbol, futbolLunes);
		mapeo.put(Deporte.Tennis, tennisSabado);
		
		
	}

	@Test
	void secretariaTest() {
		assertEquals(secretariaQuilmes.actividadPorMenorValor(), mapeo	);
	}
	
	@Test
	void todosDeFutbolTest() {
		assertEquals(3, secretariaQuilmes.actividadesDeFutbol().size());
	}
	
	@Test
	void actividadesDificultadTest() {
		assertEquals(1, secretariaQuilmes.actividadesDeDificultad(3).size());
	}
	
	@Test
	void horasTotalesTest() {
		assertEquals(22, secretariaQuilmes.cantidadHorasTotales());
	}
	
	@Test
	void laDeMenorCosto() {
		assertEquals(bascketMartes, secretariaQuilmes.laDeMenorCosto(Deporte.Basket));
	}

}
