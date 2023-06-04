package PracticasCasa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fecha;

	public Persona() {
		this.nombre = "Anonimo";
		this.apellido = "Sin definir";
		this.fecha = null;
	}

	public Persona(String nombre, String apellido, LocalDate fecha) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public  int  calcularEdad() {
		LocalDate ahora= LocalDate.now();
		int edad=(int)ChronoUnit.YEARS.between(getFecha(), ahora);
		
		if(edad>=18) {
			System.out.println("Es mayor de edad--->"+ edad);
			
		}else {
			System.out.println("Eres un bebé ----> "+ edad);
		}
		
		return edad;
	}
		
	

	public String toString() {
		return "Nombre" + this.getNombre() + " " + "Apellido" + this.getApellido() + " " + "Fecha de Nacimiento "
				+ this.getFecha()+ "Edad: "+ calcularEdad() ;
	}

}
