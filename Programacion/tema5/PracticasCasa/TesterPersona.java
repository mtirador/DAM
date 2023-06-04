package PracticasCasa;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterPersona {

	public static void main(String[] args) {


		ArrayList <Persona>lista =new ArrayList<Persona>();
/*	try {	
		LocalDate fecha=LocalDate.parse("1992-04-02");

		
		lista.add(new Persona("Marta","Tirador",fecha));
		
		
		System.out.println(lista.toString());
	}catch(DateTimeParseException ex) {
		System.out.println("Error");
		
	}
	
	*/
		
		
		Scanner ent =new Scanner(System.in);
		String nombre="";
		String apellido="";
		
		
		System.out.println("Ingrese su nombre :");
		nombre=ent.nextLine();
		System.out.println("Ingrese su apellido: ");
		apellido=ent.nextLine();
		System.out.println("Ingrese la fecha de su nacimiento: ");
		LocalDate fecha=LocalDate.parse(ent.nextLine());
		
		lista.add(new Persona(nombre,apellido,fecha));
		
		System.out.println(lista.toString());
		
		
		
		
	}
	
	
	
	

}
