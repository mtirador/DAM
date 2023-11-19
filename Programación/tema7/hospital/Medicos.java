package hospital;

import hospital.Citas;

public class Medicos extends Empleado implements Citas {

	private int licencia;

	public Medicos(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo,
			int licencia) {
		super(nombre, apellidos, telefono, dni, especialidad, sueldo);
		this.licencia = licencia;
	}

	public int getLicencia() {
		return licencia;
	}

	public void setLicencia(int licencia) {
		this.licencia = licencia;
	}

	public String toString() {
		return "Medicos [licencia=" + licencia + "]";
	}

	@Override
	public String mostrarCitas() {

		return "Tiene " + (Math.random() * 10) + " consultas";
	}

}
