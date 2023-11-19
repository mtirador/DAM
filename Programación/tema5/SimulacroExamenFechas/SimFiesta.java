package SimulacroExamenFechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 * Clase para definir una fiesta
 * 
 *@author Marta
 *@version 1.0
 *@since Marzo 2023
 */
public class SimFiesta {
	private String nombre;
	private String localidad;
	private LocalDate fInicio;
	private LocalDate fFin;
	
	
	/**
	 * Constructor vacio
	 */
	public SimFiesta() {
		this.nombre="";
		this.localidad="";
		this.fInicio=null;
		this.fFin=null;
		
	}
	/**
	 * Constructor con parametros
	 * @param nombre String. Nombre de la fiesta. 
	 * @param localidad String. Localidad donde se realiza la fiesta.
	 * @param fInicio LocalDaate. Fecha de inicio de la fiesta.
	 * @param fFin LocalDate. Fecha de fin de la fiesta.
	 */
	public SimFiesta(String nombre,String localidad,LocalDate fInicio,LocalDate fFin) {
		this.nombre=nombre;
		this.localidad=localidad;
		this.fInicio=fInicio;
		this.fFin=fFin;//chachi pirulis
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public LocalDate getfInicio() {
		return fInicio;
	}

	public void setfInicio(LocalDate fInicio) {
		this.fInicio = fInicio;
	}

	public LocalDate getfFin() {
		return fFin;
	}

	public void setfFin(LocalDate fFin) {
		
		this.fFin= fFin;
	}
	public int getDias() {
		return (int)ChronoUnit.DAYS.between(fInicio, fFin);
	}
	public String getVerano() {
		String mensaje="";
		if(this.fInicio.isAfter(LocalDate.of(2023,6,21))
				&&this.fInicio.isBefore(LocalDate.of(2023,9,23))) {
			mensaje= "en verano";
		}
		return mensaje;
	}
	
	public String diaSemana() {
		
		 String[] dia= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		return diaTraducido(this.fInicio.getDayOfWeek())+" "+
				diaTraducido(this.fFin.getDayOfWeek());
	}
	
	private String diaTraducido(DayOfWeek dia) {
		
		return switch(dia.getValue()) {
		case 1->"Lunes";
		case 2->"Martes";
		case 3->"Miercoles";
		case 4->"Jueves";
		case 5->"Viernes";
		case 6->"Sabado";
		case 7->"Domingo";
		default-> "No valido";
		
		};
	}
	
	
	public String toString() {
		
		return this.nombre+" "+this.localidad+"\n"+
				this.getDias()+" dias"+ this.getVerano()+"\n"+
				this.diaSemana();
	}
	
}
