package pkt;

import java.time.LocalTime;

public class Operadores extends Empleados implements Sueldo{
	private int numTaller;
	
	
	
	public Operadores() {
		super();
		this.numTaller=0;
	}

	public Operadores(String nombre,String apellidos,String dni,LocalTime entrada,LocalTime salida, int numTaller) {
		super(nombre,apellidos,dni,entrada,salida);
		this.numTaller=numTaller;
	}

	public int getNumtaller() {
		return numTaller;
	}

	public void setNumtaller(int numtaller) {
		this.numTaller = numtaller;
	}

	@Override
	public String toString() {
		return "Operadores [numtaller=" + numTaller + "]";
	}
	
	public String toFichero() {
		return super.toFichero()+"Numero de taller= "+ this.getNumtaller()+"Jornada: "+((this.getJornada()>8)?"Completa":"Incompleto");
			}

	@Override
	public float getSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
