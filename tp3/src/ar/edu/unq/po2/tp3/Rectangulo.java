package ar.edu.unq.po2.tp3;

import ar.edu.unq.po2.tp3.Point;

public class Rectangulo {

	Point esquinaSuperiorIzquierda;
	Point esquinaSuperiorDerecha;
	Point esquinaInferiorIzquierda;
	Point esquinaInferiorDerecha;
	int alto;
	int ancho;

	Rectangulo(Point unPunto, int alto, int ancho) {
		this.esquinaSuperiorIzquierda = unPunto;
		this.alto = alto;
		this.ancho = ancho;
		this.esquinaInferiorIzquierda = new Point(unPunto.getX() - alto, unPunto.getY());
		this.esquinaSuperiorDerecha = new Point(unPunto.getX(), unPunto.getY() + ancho);
		this.esquinaInferiorDerecha = new Point(unPunto.getX() - alto, unPunto.getY() + ancho);
	}

	public int area() {
		return alto * ancho;
	}
	
	public int perimetro() {
		return alto * 2 + ancho * 2;
	}
	
	public boolean esHorizontal() {
		return ancho > alto;
	}
	
	public boolean esVertical() {
		return alto > ancho;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

}
