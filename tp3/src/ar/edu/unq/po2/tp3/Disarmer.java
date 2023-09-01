package ar.edu.unq.po2.tp3;
import java.util.List;

public class Disarmer {

	static int contarPares(int numero) {

		int contador = 0;

		while (numero != 0) {

			int digito = numero % 10;

			if (digito % 2 == 0) {
				contador++;
			}

			numero /= 10;
		}

		return contador;
	}
	
	static int elQueMasParesTiene (List<Integer> arregloDeNumeros) {
		
		int maxHastaAhora = arregloDeNumeros.get(0);
		int cantidadDeElementos = arregloDeNumeros.size() - 1;
		
		for (int i = 0; i < cantidadDeElementos; i++) {
			if (Disarmer.contarPares(maxHastaAhora) < Disarmer.contarPares(arregloDeNumeros.get(i))) {
				maxHastaAhora = arregloDeNumeros.get(i);
			}
		}
		return (int)maxHastaAhora;
	}
}