package Evaluacion3Practicas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FechaCumple {

	public static void main(String[] args) {

		
		/*
		 * Solicitar al usuario en formato "dd/mm/yyyy" y calcular su edad actual en años,meses y dias.
		 * El programa debe de mostrar en pantalla la fecha actual del sistema y la fecha del nacimiento del usuario, 
		 * asi como su edad en años, meses y dias. Asegurate de manejar correctamente los casos de años bisiestos
		 * y de que el programa valide que la fecha de nacimiento ingresada sea una fecha válida.
		 */
		
		Scanner ent =new Scanner(System.in);
		System.out.println("INGRESE LA FECHA DE SU NACIMIENTO");
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate cumple=LocalDate.parse(ent.nextLine(),df);
		LocalDate hoy=LocalDate.now();
		Period entre=Period.between(cumple, hoy);
		System.out.println(entre);
		System.out.println("Años"+entre.getYears()+ " Meses: "+ entre.getMonths() + "Dias: "+ entre.getDays());
		
		int dias;
		dias=(int) ChronoUnit.DAYS.between(cumple, hoy);
		
		System.out.println(dias);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
