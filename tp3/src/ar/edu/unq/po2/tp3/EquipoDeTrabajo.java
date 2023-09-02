package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;


public class EquipoDeTrabajo {
	
	String nombre;
	
	List<Persona2> equipo = new ArrayList<Persona2>();
	
	EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	String getNombre() {
		return nombre;
	}
	
	public void agregarAlEquipo(Persona2 p) {
		equipo.add(p);
	}
	
	public int promedioDeEdadEquipo() {
		return equipo.stream().mapToInt(e -> e.getEdad()).sum() / equipo.size();
	}
}
