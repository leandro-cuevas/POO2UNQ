package ar.edu.unq.po2.JuegosDeEstrategia;

public class Ingeniero implements Personaje {
	
    private int lajasDisponibles;

    public Ingeniero(int lajasIniciales) {
        this.lajasDisponibles = lajasIniciales;
    }

    public void mover() {
        if (lajasDisponibles > 0) {
            System.out.println("El Ingeniero coloca una laja en el camino.");
            lajasDisponibles--;
        } else {
            System.out.println("El Ingeniero camina normalmente.");
        }
    }

    public void atacar() {
        System.out.println("El Ingeniero no ataca, se dedica a construir.");
    }
}
