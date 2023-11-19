package practicasexamenes;

public class Empleados extends Personas implements Guardias {
	
	private String especialidad;
	private float sueldo;
	
	protected Empleados(String nombre,String apellidos,int telefono, String dni,String especialidad, float sueldo) {
		super(nombre,apellidos,telefono,dni);
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
	public double getGuardias(int dias) {
		
		return PRECIO * dias;
	}

	@Override
	public double getNomina(int dias) {
		
		return getSueldo()+getGuardias(dias);
	}
	
	

}
