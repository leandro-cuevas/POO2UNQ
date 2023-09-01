package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Multioperador {
	
	public static int sumarTodos(List<Integer> arregloDeNum){
		
		//return arregloDeNum.stream().mapToInt(e-> e .intValue()).sum();
		
		return arregloDeNum.stream().reduce(0, (subtotal, element) -> subtotal+element);	
	}
	
	public static int restarTodos(List<Integer> arregloDeNum){
		
		return arregloDeNum.stream().reduce(0, (subtotal, element) -> subtotal-element);	

	}
	
	public static int multiplicarTodos(List<Integer> arregloDeNum){
		
		return arregloDeNum.stream().reduce(1, (subtotal, element) -> subtotal*element);	

	}
}
