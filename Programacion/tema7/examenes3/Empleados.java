package examenes3;

import java.time.Duration;
import java.time.LocalTime;

public abstract class Empleados {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalTime hEntrada;
	private LocalTime hSalida;
	
	protected Empleados() {
		nombre="";
		apellidos="";
		dni="";
		hEntrada=null;
		hSalida=null;
	}
	
	protected Empleados(String nombre, String apellidos, String dni, 
			LocalTime hEntrada, LocalTime hSalida) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.hEntrada = hEntrada;
		this.hSalida = hSalida;
		
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

	public LocalTime gethEntrada() {
		return hEntrada;
	}

	public void sethEntrada(LocalTime hEntrada) {
		this.hEntrada = hEntrada;
	}

	public LocalTime gethSalida() {
		return hSalida;
	}

	public void sethSalida(LocalTime hSalida) {
		this.hSalida = hSalida;
	}
	
	protected int getJornada() {
		return (int)Duration.between(hEntrada, hSalida).toHours();
	}
	
	protected abstract String toFichero();
	
}
