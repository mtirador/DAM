package Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {

/*
		LocalDate fecha= LocalDate.now();
		
		System.out.println(fecha);

		LocalDate miCumpleaños = LocalDate.of(2006, 9, 02);
		//LocalDate cositasVarias = LocalDate.of(0, null, 0);
		//LocalDate finEvaluacion2= LocalDate.parse("2022-01-01");
		//System.out.println("fin evaluacion " + finEvaluacion2);
		
		//para añadir dias
		
		LocalDate mas35 = miCumpleaños.plusDays(35);
		System.out.println(miCumpleaños);
		System.out.println(mas35);
		
		
		if(miCumpleaños.isBefore(mas35)) {
			System.out.println("Es anterior");
		}else {
			System.out.println("es posterior");
		}
		
		
		if(miCumpleaños.isLeapYear()) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println();
		}
		
		
		//indicar al metodo parse el tipo de dato de fecha que queremos utilizar
		//para ponerlo 
		
		LocalDate fecha1 =LocalDate.parse("01-03-2023",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		
		*/
		
		//para meter una fecha por escanner
		
		
		/*
		Scanner ent= new Scanner(System.in);
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Ingresa la fecha de tu cumple");
		LocalDate fecha= LocalDate.parse(ent.nextLine(),df);
		
		LocalDate mayorEdad= LocalDate.now().minusYears(18);

		
		if(fecha.isAfter(mayorEdad)) {
			System.out.println(" Es menor");
				
		}else {
			System.out.println(" Es mayor");
		}
		
		System.out.println(fecha.getDayOfWeek());
		
		int diaSemana=fecha.getDayOfWeek().getValue();
	
		if(diaSemana>=1 && diaSemana<=5) {
			System.out.println("Laborable"+ fecha.getDayOfWeek());
			
		}else {
			System.out.println("No laborable" + fecha.getDayOfWeek());
		}
		*/
		
		//PERID ES PARA FECHAS
		
		Scanner ent =new Scanner(System.in);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate miFecha=LocalDate.of(1992,04,02);
		LocalDate otraFecha = LocalDate.now();
		
		Period periodo =Period.between(miFecha, otraFecha);
		
		
		
		System.out.println(LocalDate.now().getDayOfYear()- miFecha.getDayOfYear());
		System.out.println(periodo.getYears()+ " "+ periodo.getMonths()+ " "+ periodo.getDays());
		
		
		//CLASE ChronoUnit para saber los dias que han pasado
		System.out.println(ChronoUnit.DAYS.between(miFecha, otraFecha));
	
		
		
		//parkímetro. hora de entra y hora de salida y a 0.20 el minuto.
		
	}

}
