package ar.edu.unq.po2.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecretariaDeDeportes {
	
	List<ActividadSemanal> oferta;
	
	SecretariaDeDeportes(){
		this.oferta = new ArrayList<ActividadSemanal>();
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
	            .min(Comparator.comparing(ActividadSemanal::getCosto))
	            .orElse(null);
	}

}
