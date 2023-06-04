package Fechas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PruebasLocalTime {

	public static void main(String[] args) {
		
		
		LocalTime ahora =LocalTime.now();
		
		DateTimeFormatter df =DateTimeFormatter.ofPattern("hh:mm");
		
		System.out.println(ahora.format(df));
		
		
		LocalTime horaDeSalida =LocalTime.parse("14:00");
		LocalTime horaDeEntrada =LocalTime.of(8, 30);
		
		
		System.out.println(horaDeSalida.plusHours(10)+ " hora zulú");
		System.out.println(ahora.format(df));
		
		
		
		

	}

}
