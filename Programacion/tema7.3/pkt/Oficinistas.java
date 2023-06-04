package pkt;

import java.time.LocalTime;

public class Oficinistas extends Empleados implements Sueldo {
	
	private String departamento;

	
	
	
	public Oficinistas() {
		super();
		this.departamento = "Sin definir";
	}


	public Oficinistas(String nombre,String apellidos,String dni,LocalTime entrada,LocalTime salida,String departamento) {
		super(nombre,apellidos,dni,entrada,salida);
		this.departamento = departamento;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Oficinistas [departamento=" + departamento + "]";
	}

	public String toFichero() {
		return super.toFichero()+"Departamento= "+ this.getDepartamento()+"Jornada: "+ ((this.getJornada()>8)?"Completa":"Incompleto");
	}


	@Override
	public float getSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
