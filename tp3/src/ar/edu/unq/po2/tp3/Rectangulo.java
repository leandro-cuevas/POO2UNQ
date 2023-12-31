package ar.edu.unq.po2.tp3;

public class Rectangulo extends Cuadrilatero {

	Rectangulo(Point unPunto, int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
		this.esquinaSuperiorIzquierda = unPunto;
		this.esquinaInferiorIzquierda = new Point(unPunto.getX() - alto, unPunto.getY());
		this.esquinaSuperiorDerecha = new Point(unPunto.getX(), unPunto.getY() + ancho);
		this.esquinaInferiorDerecha = new Point(unPunto.getX() - alto, unPunto.getY() + ancho);
	}

	public boolean esHorizontal() {
		return ancho > alto;
	}
	
	public boolean esVertical() {
		return alto > ancho;	
	}

}
