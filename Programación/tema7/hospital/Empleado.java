package hospital;

import hospital.Guardias;

public class Empleado extends Personas implements Guardias {

	private String especialidad;
	private float sueldo;

	public Empleado(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo) {
		super(nombre, apellidos, telefono, dni);
		this.especialidad = especialidad;
		this.sueldo = sueldo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [especialidad=" + especialidad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public double getGuardias(int dias) {

		return PRECIO * dias;

	}

	@Override
	public double getNomina(int dias) {

		return getSueldo() + getGuardias(dias);
	}

}
