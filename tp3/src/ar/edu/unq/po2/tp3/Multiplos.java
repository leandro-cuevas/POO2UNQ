package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	public static int encontrarMaximoMultiplo(int x, int y) {
	    for (int numero = 1000; numero >= 0; numero--) {
	        if (numero % x == 0 && numero % y == 0) {
	            return numero;
	        }
	    }
	    return -1;
	}
}
