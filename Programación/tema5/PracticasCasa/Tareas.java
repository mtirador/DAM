package PracticasCasa;

import java.time.LocalDate;

public class Tareas {

	private String descripcion;
	private LocalDate finicio;
	private LocalDate ffinal;
	private String dificultad;

	public Tareas() {
		this.descripcion = "Sin definir";
		this.finicio = null;
		this.ffinal = null;
		this.dificultad = "Sin clasificar";
	}

	public Tareas(String descripcion, LocalDate finicio, LocalDate ffinal, String dificultad) {

		this.descripcion = descripcion;
		this.finicio = finicio;
		this.ffinal = ffinal;
		this.dificultad = dificultad;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFinicio() {
		return finicio;
	}

	public LocalDate getFfinal() {
		return ffinal;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFinicio(LocalDate finicio) {
		this.finicio = finicio;
	}

	public void setFfinal(LocalDate ffinal) {
		this.ffinal = ffinal;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	
	
	public String ToString() {
		return "Descripcion de la tarea: "+this.getDescripcion() + "Fecha de inicio: "+ this.getFinicio()+
				"Fecha fin de la tarea"+ this.getFfinal()+ "Dificultad: "+ this.getDificultad();
	}
	
	
	
	
	
	
	
	

}
