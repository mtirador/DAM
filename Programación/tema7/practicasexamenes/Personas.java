package practicasexamenes;

public class Personas {
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	
	protected Personas() {
		this.nombre="Sin definir";
		this.apellidos="Sin definir";
		this.telefono=0;
		this.dni=null;
	}

	protected Personas(String nombre, String apellidos, int telefono, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
}
