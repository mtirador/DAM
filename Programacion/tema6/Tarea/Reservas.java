package Tarea;

import java.time.LocalDateTime;

public class Reservas {

	private String dni;
	private Vehiculos vehiculo;
	private LocalDateTime fechaHora;

	public Reservas() {

	}

	public Reservas(String dni, Vehiculos vehiculo, LocalDateTime fechaHora) {
		this.dni = dni;
		this.vehiculo = vehiculo;
		this.fechaHora = fechaHora;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Vehiculos getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	// validar el dni
	public static boolean validarDni(String dni) {
		boolean valido;
		if (dni.toUpperCase().matches("^[0-9]{8}[a-zA-Z]$")) {
			System.out.println("Dni válido");
			valido = true;
		} else {
			System.out.println("No valido");
			valido = false;
		}

		return valido;

	}

	@Override
	public String toString() {
		return "Reservas [dni=" + dni + ", vehiculo=" + vehiculo + ", fechaHora=" + fechaHora + "]";
	}

}
