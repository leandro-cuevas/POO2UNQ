package ar.edu.unq.po2.JuegosDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje {
    private List<Personaje> personajes = new ArrayList<>();

    public void mover() {
        System.out.println("El Ejército se mueve coordinadamente.");
        personajes.stream()
        	.forEach(e-> e.mover());
        }

    public void atacar() {
        System.out.println("El Ejército ataca en conjunto.");
        personajes.stream()
        	.forEach(e-> e.atacar());
        }
    
    
    public void agregarPersonaje(Personaje personaje) {
    	personajes.add(personaje);
    }
}
