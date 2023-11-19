package EquipoFurbo;

public class Persona {
	private String nombre;
	private String apellidos;
	private int anios;
	
	public Persona() {
		this.nombre="Sin definir";
		this.apellidos="Sin definir";
		this.anios=0;
	}
	
	public Persona(String nombre, String apellidos, int anios) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anios = anios;
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

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}


	
public String toFichero() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", anios=" + anios + "]";

	
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", anios=" + anios + "]";
	}

	//public abstract String toFichero();
	

	
	
	
	
}

