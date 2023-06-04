package Excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PruebasExcepcion2 {
	public static void main(String[]args) {
	
		//pedir fecha a un usuario y se la pida mientras no la meta bien
		
		Scanner ent=new Scanner(System.in);
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		boolean flag=true;
		
		while(flag) {	
			System.out.println("Introduce tu fecha");
			try {
				LocalDate fecha=LocalDate.parse(ent.nextLine(),df);
				System.out.println("tu cumple cae en "+ fecha.getDayOfWeek());
				flag=false;
			}
			catch(DateTimeParseException ex) {
					System.out.println("tienes que poner el formato dd-mm-yyyy");
				
			}
			
			
			
			
			
			
		}	
		
		
	}
	
	

}
