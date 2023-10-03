package ar.edu.unq.po2.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecretariaDeDeportes {
	
	private List<ActividadSemanal> oferta;
	
	SecretariaDeDeportes(){
		this.oferta = new ArrayList<ActividadSemanal>();
	}
	
	public void agregarActividad(ActividadSemanal a) {
		oferta.add(a);
	}
	
	public List<ActividadSemanal> actividadesDeFutbol(){
		return oferta.stream()
				.filter(e-> e.getDeporte() == Deporte.Futbol)
				.toList();
	}
	
	public List<ActividadSemanal> actividadesDeDificultad(int numero){
		return oferta.stream()
				.filter(e-> e.getDeporte().getComplejidad() == numero)
				.toList();
	}
	
	public int cantidadHorasTotales() {
		return oferta.stream()
				.mapToInt(e-> e.duracion)
				.sum();
	}
	
	public ActividadSemanal laDeMenorCosto(Deporte deporte) {
	    return oferta.stream()
	            .filter(actividad -> actividad.getDeporte() == deporte)
	            .min(Comparator.naturalOrder()).orElse(null);
	}
	
	public Map<Deporte, ActividadSemanal> actividadPorMenorValor() {
	    return oferta.stream()
	            .collect(Collectors.groupingBy(
	                    ActividadSemanal::getDeporte,
	                    Collectors.minBy(Comparator.comparing(ActividadSemanal::getCosto))))
	            .entrySet()
	            .stream()
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    entry -> entry.getValue().orElse(null)));
	}



}
