package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {

	private List<Integer> numeros = new ArrayList<Integer>();

	
	public void addNumber(Integer number) {
		numeros.add(number);
	}
	
	public int getEvenOcurrences() {
		return (int) numeros.stream().filter(number -> number % 2 == 0).count();
	}
	
	public int getOddOcurrences() {
		return (int) numeros.stream().filter(number -> number % 2 != 0).count();
	}
	
	public int getMultiplesCounter(int searched) {
		return (int) numeros.stream().filter(number -> number % searched == 0).count();

	}
	
}
