package hospital;

import java.time.LocalDate;

import hospital.Citas;

public class Pacientes extends Personas implements Citas{
	

	private LocalDate cita;
	

	public Pacientes(String nombre, String apellidos, int telefono, String dni, LocalDate cita) {
		super(nombre, apellidos, telefono, dni);
		this.cita=cita;
	}


	public LocalDate getCita() {
		return cita;
	}


	public void setCita(LocalDate cita) {
		this.cita = cita;
	}


	@Override
	public String toString() {
		return "Pacientes [cita=" + cita + "]";
	}


	@Override
	public String mostrarCitas() {
		
		return "Tiene cita el dia " + getCita();
	}
	
	
	
}
