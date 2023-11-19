package Agenda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterCitas {

	public static void main(String[] args) {
		
		/*
		 * 
El m�todo debe lanzar una excepci�n personalizada llamada "CitaExistenteException" si ya existe una cita programada en la misma fecha y hora. 
Si se intenta agregar una cita en una fecha pasada, el m�todo debe lanzar una excepci�n de tipo "IllegalArgumentException"
		 */
		
		ArrayList<Agenda>lista=new ArrayList<Agenda>();
		
		Scanner ent= new Scanner(System.in);
		int opcion=0;
		lista.add(new Agenda("Marcos",LocalDate.parse("2000-03-02"),LocalTime.parse("12:00"),"cosas"));
		lista.add(new Agenda("Marcos",LocalDate.parse("2020-03-02"),LocalTime.parse("12:00"),"cosas"));
		
		

		do{
			  	
			  System.out.println("1. LISTA AGENDA");  
			  System.out.println("2. A�ADIR CITA");
			  System.out.println("0. Salir");
			  
			  try {
			  opcion = Integer.parseInt(ent.nextLine());
			  
			  
			  
		  switch (opcion) {
		 
		  case 1: listarAgenda(lista);break;
			  
		  case 2:  a�adirCita(lista);break;
		  
		  case 0: System.out.println("Salir"); break;
	
		  default: System.out.println("No Opciones con esa accion"); break;
		    
		  }
			  }catch(NumberFormatException ex) {
				  System.out.println("Introduce bien la opcion");
			  }
		  
		 }while(opcion!=0) ;
		  
		
		
	}// fin main

	public static void a�adirCita(ArrayList<Agenda> lista) {

		Scanner ent = new Scanner(System.in);
		String nombre;
		LocalDate fecha;
		LocalTime hora;
		String descripcion;
		
		try {
		System.out.println("ingrese el nombre: ");
		nombre = ent.nextLine();
		System.out.println("ingrese la fecha: [yyyy-MM-dd] ");
		fecha = LocalDate.parse(ent.nextLine());
		System.out.println("ingrese la hora: [HH:MM]");
		hora = LocalTime.parse(ent.nextLine());
		System.out.println("Ingrese la descripcion");
		descripcion = ent.nextLine();
		
		lista.add(new Agenda(nombre, fecha, hora, descripcion));}
		
		catch(DateTimeParseException ex) {
			System.out.println("el formato que has metido no es valido");
		}
	}

	public static void listarAgenda(ArrayList<Agenda> lista) {

		for (Agenda li : lista) {
			System.out.println(li);

		}
	}

}
