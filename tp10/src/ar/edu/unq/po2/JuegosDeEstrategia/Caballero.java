package ar.edu.unq.po2.JuegosDeEstrategia;

public class Caballero implements Personaje {
    
    public void mover() {
        System.out.println("El Caballero se mueve en zigzag para vigilar la zona.");
    }

    public void atacar() {
        System.out.println("El Caballero ataca a los enemigos cercanos.");
    }
}
