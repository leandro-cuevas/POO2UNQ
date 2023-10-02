package ar.edu.unq.po2.Ejercicio2;

public class ActividadSemanal implements Comparable<ActividadSemanal> {

	DiaDeLaSemana dia;
	int horaInicio;
	int duracion;
	Deporte deporte;

	public ActividadSemanal(DiaDeLaSemana dia, int horaInicio, int duracion, Deporte deporte) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public int getCosto() {

		int precioDelDia = 500;
		int precioPorComplejidad = this.deporte.getComplejidad() * 2;

		if (this.deporte.ordinal() > 2) {
			precioDelDia = 1000;
		}

		return precioDelDia + precioPorComplejidad;
	}
	
	@Override
	public int compareTo(ActividadSemanal o) {
		// TODO Auto-generated method stub
		return this.getCosto() - o.getCosto();
	}
}