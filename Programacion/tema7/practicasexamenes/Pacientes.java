package practicasexamenes;

import java.time.LocalDate;

public class Pacientes extends Personas implements Citas{

	private LocalDate cita;

	protected Pacientes(String nombre, String apellidos, int telefono, String dni, LocalDate cita) {
		super(nombre, apellidos, telefono, dni);
		this.cita = cita;
	}

	public LocalDate getCita() {
		return cita;
	}

	public void setCita(LocalDate cita) {
		this.cita = cita;
	}

	@Override
	public String mostrarCitas() {
		
		return "Tiene Cita el dia: "+ getCita();
	}

	
	
	
}
