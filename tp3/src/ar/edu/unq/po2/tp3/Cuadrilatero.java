package ar.edu.unq.po2.tp3;

public abstract class Cuadrilatero {

	protected int alto;
	protected int ancho;
	protected Point esquinaSuperiorIzquierda;
	protected Point esquinaSuperiorDerecha;
	protected Point esquinaInferiorIzquierda;
	protected Point esquinaInferiorDerecha;

	public int area() {
		return alto * ancho;
	}

	public int perimetro() {
		return this.getAlto() * 2 + this.getAncho() * 2;
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
	
	public int getAlto() {
		return alto;
	}
	
	public int getAncho() {
		return ancho;
	}

}