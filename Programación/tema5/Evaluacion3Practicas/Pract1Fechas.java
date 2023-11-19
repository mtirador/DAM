package Evaluacion3Practicas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pract1Fechas {

	public static void main(String[] args) {
		/*
		 * Solicitar al usuario en formato "dd/mm/yyyy" y calcular su edad actual en años,meses y dias.
		 * El programa debe de mostrar en pantalla la fecha actual del sistema y la fecha del nacimiento del usuario, 
		 * asi como su edad en años, meses y dias. Asegurate de manejar correctamente los casos de años bisiestos
		 * y de que el programa valide que la fecha de nacimiento ingresada sea una fecha válida.
		 */
		
		
		Scanner ent= new Scanner(System.in);
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ingresa el dia de tu cumpleaños");
		LocalDate cumple= LocalDate.parse(ent.nextLine(), df);
		
		//fecha nacimiento
		System.out.println(cumple);

		//calcular su edad actual
		
		LocalDate actual=LocalDate.now();
		
		System.out.println(actual.compareTo(cumple));
		
		System.out.println(Period.between(actual, cumple));

		System.out.println(actual.getDayOfWeek());
		
		LocalTime ahorita=LocalTime.now();
		
		LocalTime despues=LocalTime.of(12, 0, 0);
		
		System.out.println(Duration.between(ahorita, despues));

		
}
	
}
