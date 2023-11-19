package examenes3;

import java.time.LocalTime;

public class Operadores extends Empleados implements Sueldos{
	
	private int numTaller;

	public Operadores() {
		super();
		this.numTaller = 0;
	}
	
	public Operadores(String nombre, String apellidos, String dni, 
			LocalTime hEntrada, LocalTime hSalida, int numTaller) {
		super(nombre, apellidos, dni, hEntrada, hSalida);
		this.numTaller = numTaller;
	}

	public int getNumTaller() {
		return numTaller;
	}

	public void setNumTaller(int numTaller) {
		this.numTaller = numTaller;
	}

	@Override
	public float getSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toFichero() {
		
		return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldo()+";"+getNumTaller()+";"+
				((getJornada() >= 8)?"Completa":"Incompleta");
	}

	
	
}
