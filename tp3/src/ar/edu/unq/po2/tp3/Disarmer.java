package ar.edu.unq.po2.tp3;

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
}