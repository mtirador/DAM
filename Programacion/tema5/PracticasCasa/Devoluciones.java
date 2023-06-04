package PracticasCasa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Devoluciones {
	public static void main(String[] args) {

		// entrego el libro cuando lo meta por teclado sobre esa fecha teniendo el punto
		// de referecia es el de hoy

		// si la fecha >hoy;imposible
		// si la fecha == hoy; 0
		// si la fecha >h1,5 * dia de retraso

		// fecha recogida
		// fecha fin.

		Scanner ent = new Scanner(System.in);
		boolean flag =true;
		LocalDate ahora = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
do {
	
		try {
			System.out.println("Introduzca la fecha de devolución de libro");
			LocalDate fecha = LocalDate.parse(ent.nextLine(), df);
			double recargo = 1.5;

			comparacionFecha(ahora, fecha);
			
			flag=false;
		} catch (DateTimeParseException ex) {
			
			System.out.println("Introduce la fecha bien dd/MM/yyyy");
			
		}
	
}while(flag);
		
		/*
		 * if(fecha.compareTo(ahora)){ syso" }
		 */

	}

	private static void comparacionFecha(LocalDate ahora, LocalDate fecha) {
		if (fecha.isBefore(ahora)) {
			System.out.println("es imposible");
		} else if (fecha.isEqual(ahora)) {
			System.out.println("no pagas nada");
		} else if (fecha.isAfter(ahora)) {
			System.out.println("Tienes que pagar: " + ChronoUnit.DAYS.between(ahora, fecha) * 1.5);

		}
	}

}
