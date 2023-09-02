package ar.edu.unq.po2.tp3;

public class Cuadrado extends Cuadrilatero {
	
	Cuadrado(Point unPunto, int lado) {
		this.alto = lado;
		this.ancho = lado;
		this.esquinaSuperiorIzquierda = unPunto;
		this.esquinaInferiorIzquierda = new Point(unPunto.getX() - alto, unPunto.getY());
		this.esquinaSuperiorDerecha = new Point(unPunto.getX(), unPunto.getY() + ancho);
		this.esquinaInferiorDerecha = new Point(unPunto.getX() - alto, unPunto.getY() + ancho);
	}

}
