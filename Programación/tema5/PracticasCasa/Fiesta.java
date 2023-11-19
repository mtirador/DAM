package PracticasCasa;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Fiesta {
	
	private String nombre;
	private String localidad;
	private LocalDate finicio;
	private LocalDate ffinal;

	
	public Fiesta() {
		this.nombre="Sin definir";
		this.localidad="Sin definir";
		this.finicio=null;
		this.ffinal=null;
	}
	
	
	public Fiesta(String nombre, String localidad,LocalDate finicio,LocalDate ffinal) {
		this.nombre=nombre;
		this.localidad=localidad;
		this.finicio=finicio;
		this.ffinal=ffinal;
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getLocalidad() {
		return localidad;
	}
	
	public LocalDate getFinicio() {
		return finicio;
	}
	
	public LocalDate getFfinal() {
		return ffinal;
	}
	
	public int getDias() {
		return (int) ChronoUnit.DAYS.between(finicio, ffinal);
	}
	
	public String getVerano() {
		String mensaje="";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		if(finicio.isAfter(LocalDate.parse("21/06/2023",df))&& ffinal.isBefore(LocalDate.parse("23/09/2023",df))) {
				mensaje="Es verano";
		}else {
				mensaje= "No es en verano";
		}
			
		return mensaje;
		
	}
	

	public String diaSemana() {
		
	//	 String[] dia= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		//return dia[finicio.getDayOfWeek().ordinal()] + " "+ dia [ffinal.getDayOfWeek().ordinal()];
		
		return diaTraducido(finicio.getDayOfWeek()) + " "+ diaTraducido(ffinal.getDayOfWeek());
		
	}
	private String diaTraducido(DayOfWeek dia) {
		
		return switch(dia) {
		case MONDAY ->"LUNES";
		case TUESDAY -> "MARTES";
		case WEDNESDAY->"MIERCOLES";
		case THURSDAY ->"JUEVES";
		case FRIDAY->"VIERNES";
		case SATURDAY->"SABADO";
		case SUNDAY->"DOMINGO";
		default ->"No valido";
		}; //este operador pide siempre el punto y coma
	}
	

	
	//----------------------------------------
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setFinicio(LocalDate finicio) {
		this.finicio = finicio;
	}

	public void setFfinal(LocalDate ffinal) {
		this.ffinal = ffinal;
	}


	@Override
	public String toString() {
		return "Fiesta " + this.nombre+ ", Localidad" + this.localidad + "\n"+", Fecha de inicio "
				+ this.finicio + ", Fecha Fin de Fiesta" + this.ffinal+"\n"
				+ "cuanto dura cada fiesta en dia: "+ this.getDias()
				+ "¿es verano?"+ getVerano()+ this.diaSemana();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
