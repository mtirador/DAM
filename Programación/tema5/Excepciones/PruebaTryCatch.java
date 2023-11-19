package Excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PruebaTryCatch {

	public static void main(String[] args) {
		//pedir nombre,tfn,fecha y que si no se mete todo correctamente correctamente
		
		
		Scanner ent= new Scanner(System.in);
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		boolean flag=true;
		String nombre="";
		int tfno=0;
		
		
		
		System.out.println("Introduce tu nombre");
		ent.nextLine();
		
		System.out.println("Introduce el tfno");
		ent.nextInt();
		
		
		while(flag) {	
			System.out.println("Introduce tu fecha");
			try {
				LocalDate fecha=LocalDate.parse(ent.nextLine(),df);
				System.out.println("tu cumple ca ene "+ fecha.getDayOfWeek());
				flag=false;
			}
			catch(DateTimeParseException ex) {
					System.out.println("tienes que poner el formato dd-mm-yyyy");
				
			}
			
		
			
	
			
			
			
			
		
			
		}	
		

	}

}
