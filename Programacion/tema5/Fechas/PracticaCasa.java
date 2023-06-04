package Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PracticaCasa {

	public static void main(String[] args) {
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		
//		
//		LocalDate cumple = LocalDate.parse("1992-04-02");
//		
//			
//		LocalDate date2=LocalDate.of(2018, 02, 20);
//		LocalDate date3=LocalDate.parse("2019-10-30");
//		
//		LocalDate newDate=date3.minus(Period.of(1, 3, 2));
//		System.out.println(date3);
//		System.out.println(newDate);
//		
//		
//		System.out.println(date3.getDayOfWeek());
//		System.out.println(cumple.getDayOfWeek());
//		
//		System.out.println(cumple.getEra());
//		
//		
//		
		
		
		LocalTime hora=LocalTime.parse("12:30");
		
		System.out.println(hora);
		
		LocalTime h2 =LocalTime.of(12, 05, 30);
		
		System.out.println(h2);
		System.out.println(h2.minusHours(3));
		System.out.println(LocalTime.now());
		LocalTime hora2=hora.plusHours(3);
		System.out.println(hora2);
		
		System.out.println(hora.isBefore(hora2));
		
		
		
		LocalDate miCumple=LocalDate.parse("1992-04-02");
		
		LocalDate ahora=LocalDate.now();
		Period periodo =Period.between(ahora, miCumple);
		
		System.out.println(periodo);
		System.out.println(String.format("años %d meses %d dias %d", periodo.getYears(),periodo.getMonths(),periodo.getDays()));
		
		
		
		

	}

}
