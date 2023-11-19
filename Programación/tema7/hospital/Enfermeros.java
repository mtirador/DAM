package hospital;

import hospital.Citas;

public class Enfermeros extends Empleado implements Citas{

	private int numPacientes;

	public Enfermeros(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo,
			int numPacientes) {
		super(nombre, apellidos, telefono, dni, especialidad, sueldo);
		this.numPacientes = numPacientes;
	}

	public int getNumPacientes() {
		return numPacientes;
	}

	public void setNumPacientes(int numPacientes) {
		this.numPacientes = numPacientes;
	}

	@Override
	public String toString() {
		return "Numero de pacientes de los Enfermeros =" + numPacientes + getGuardias(5);
	}

	@Override
	public String mostrarCitas() {
	
		return "tiene que atender a " +  getNumPacientes();
	}

}
