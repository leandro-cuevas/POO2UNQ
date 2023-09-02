package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
import java.time.Period;

public class Persona1 {
	
	private String nombre;

	private LocalDate fechaNacimiento;
	
	Persona1(String nombre, LocalDate fechaNacimiento){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getEdad() {
		Period period = Period.between(fechaNacimiento, LocalDate.now());
		return period.getYears();
	}
	
	public boolean menorQue(Persona1 p1) {
		return this.getEdad() < p1.getEdad();
	}
	
	
}
