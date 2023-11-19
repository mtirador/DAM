package practicasexamenes;

public class Medicos extends Empleados{
	
	private int numLicencia;
	
	
	protected Medicos(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo,int numLicencia) {
		super(nombre, apellidos, telefono, dni, especialidad, sueldo);
		this.numLicencia=numLicencia;
		
	}


	public int getNumLicencia() {
		return numLicencia;
	}


	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}
	
	

}
