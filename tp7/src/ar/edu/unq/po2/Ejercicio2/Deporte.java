package ar.edu.unq.po2.Ejercicio2;

public enum Deporte {
	
	Running(1), Futbol(2), Basket(2), Tennis(3), Jabalina(4);
	
	int complejidad;
	
	Deporte(int complejidad) {
		this.complejidad = complejidad;
	}
	
	int getComplejidad() {
		return this.complejidad;
	}
	

}
