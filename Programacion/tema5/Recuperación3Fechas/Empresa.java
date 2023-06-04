package Recuperación3Fechas;

import java.time.LocalTime;

public class Empresa {

	private String dni;
	private String nombre;
	private String puesto;
	private LocalTime horaEnt;
	
	
	public Empresa() {
		this.dni="000000000A";
		this.nombre="Sin definir";
		this.puesto="Sin clasificar";
		this.horaEnt=LocalTime.now();
	}
	
	public Empresa(String dni,String nombre,String puesto,LocalTime horaEnt) {
		this.dni=dni;
		this.nombre=nombre;
		this.puesto=puesto;
		this.horaEnt=horaEnt;
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public LocalTime getHoraEnt() {
		return horaEnt;
	}

	public void setHoraEnt(LocalTime horaEnt) {
		this.horaEnt = horaEnt;
	}
	
	public String turno() {
		String mensaje = null;
		LocalTime tarde=LocalTime.parse("15:00");
		
		if(this.horaEnt.isAfter(tarde)) {
			mensaje="Turno de tarde";
			System.out.println(mensaje);
		}else {
			mensaje="Turno de mañana";
			System.out.println(mensaje);
		}
		return mensaje; 
				
	}
	public String ToString() {
		return "Dni: "+ this.getDni()+ " Nombre: "+ this.getNombre()+" Puesto: "+ this.getPuesto()+ 
				"Hora de entrada: "+ this.getHoraEnt() + this.turno();
	}
	
	
	
	
	
	
}
