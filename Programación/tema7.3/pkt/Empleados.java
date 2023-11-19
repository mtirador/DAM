package pkt;

import java.time.Duration;
import java.time.LocalTime;

public class Empleados {
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalTime entrada;
	private LocalTime salida;
	
	
	protected Empleados() {
		this.nombre="Sin definir";
		this.apellidos="Sin definir";
		this.dni="Sin definir";
		this.entrada=null;
		this.salida=null;
	}


	protected Empleados(String nombre, String apellidos, String dni, LocalTime entrada, LocalTime salida) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.entrada = entrada;
		this.salida = salida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalTime getEntrada() {
		return entrada;
	}


	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}


	public LocalTime getSalida() {
		return salida;
	}


	public void setSalida(LocalTime salida) {
		this.salida = salida;
	}


	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", entrada=" + entrada
				+ ", salida=" + salida + "]";
	}
	
	public int getJornada() {
		return (int) Duration.between(entrada, salida).toHours();
		
	}
	
	public String toFichero() {
		return "Empleados= "+this.getNombre()+" Apellidos= "+ this.getApellidos()+ " Dni= "+ this.getDni();
	}
	
	
	

}
