package practicasexamenes;

public class Enfermeros extends Empleados {
	
	private int numPacientes;

	protected Enfermeros(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo, int numPacientes) {
		super(nombre, apellidos, telefono, dni, especialidad, sueldo);
		this.setNumPacientes(numPacientes);
	}

	public int getNumPacientes() {
		return numPacientes;
	}

	public void setNumPacientes(int numPacientes) {
		this.numPacientes = numPacientes;
	}

}
