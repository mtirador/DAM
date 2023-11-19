package examenes3;

import java.time.LocalTime;

public class Oficinistas extends Empleados implements Sueldos{
	
	private String departamento;

	public Oficinistas() {
		super();
		this.departamento = "";
	}
	
	public Oficinistas(String nombre, String apellidos, String dni, 
			LocalTime hEntrada, LocalTime hSalida, String departamento) {
		super(nombre, apellidos, dni, hEntrada, hSalida);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public float getSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toFichero() {
		
		return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldo()+";"+getDepartamento()+";"+
				((getJornada() >= 8)?"Completa":"Incompleta");
	}
	
}
