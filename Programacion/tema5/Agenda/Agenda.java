package Agenda;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

/*
 * 
 */
	private String nombre;
	private LocalDate fecha;
	private LocalTime hora;
	private String descripcion;
	
	
	public Agenda() {
		this.nombre="Sin definir";
		this.fecha=null;
		this.hora=null;
		this.descripcion="Sin definir";
	}
	
	public Agenda(String nombre,LocalDate fecha,LocalTime hora,String descripcion) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.hora=hora;
		this.descripcion=descripcion;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
	
	
}
