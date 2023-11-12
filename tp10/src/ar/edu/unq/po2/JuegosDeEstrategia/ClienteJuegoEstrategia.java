package ar.edu.unq.po2.JuegosDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class ClienteJuegoEstrategia {
	
	private List<Personaje> personajes;
	
	public ClienteJuegoEstrategia() {
		this.personajes = new ArrayList<Personaje>();
	}
	
	public void agregarPersonaje(Personaje personaje) {
    	personajes.add(personaje);
    }
	
	public void atacar() {
		personajes.stream()
		.forEach(e-> e.atacar());
	}
	
	public void mover() {
		personajes.stream()
		.forEach(e-> e.mover());
	}

}
