package ar.edu.unq.po2.Ejercicio1;

public enum Dermatologico {

	Rojo("En la mala"), Gris("Se esta poniendo feo"), Amarillo("Podria ser peor"), Miel("Tranqui");

	String descripcion;

	Dermatologico(String descripcion) {
		this.descripcion = descripcion;
	}

	static int getNivelDeRiesgo(Dermatologico color) {
		return color.ordinal();
	}

	static Dermatologico siguienteNivelDeRiesgo(Dermatologico color) {

		int ordinalActual = color.ordinal();

		int ordinalSiguiente = ordinalActual + 1;

		if (ordinalSiguiente >= Dermatologico.values().length) {
			return Dermatologico.values()[0];
		} else {
			return Dermatologico.values()[ordinalSiguiente];
		}
	}

}
