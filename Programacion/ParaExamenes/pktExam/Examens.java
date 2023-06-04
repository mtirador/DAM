package pktExam;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class Examens {

	public static void main(String[] args) throws Exception {
		
		throwException ();
		finallys();
		chronomins();
		datesForms();
		doWhiles();
		getDAys();
		datesOf();
		messContain();
	}

	private static void messContain() {
		try {
			
		}catch(DateTimeException ex) {
			int error;
			if(ex.getMessage().contains("MonthOfYear")) {
				System.out.println("Error en el mes(1-12)");
				error=1;
				
			}else if(ex.getMessage().contains("DayOfMonth")) {
				System.out.println("Error en el dia (1 -28,30,31)");
				error=2;
			}else {
				System.out.println("Fecha invalida");
				error=0;
			}
			
		}
	}

	private static void datesOf() {
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		
		LocalDate miCumpleanios=LocalDate.of(2006,Month.JUNE,2);
		System.out.println(miCumpleanios);
		
		LocalDate finEvaluacion= LocalDate.parse("2023-03-10");
		System.out.println(finEvaluacion);
		
	}

	private static void getDAys() {
		LocalDate fechaTeclado = null;
		int diaSemana = fechaTeclado.getDayOfWeek().getValue();
		if(diaSemana >= 1 && diaSemana <= 5) {
			System.out.println("Laborable "+ fechaTeclado.getDayOfWeek());
		}else {
			System.out.println("Fin de semana "+ fechaTeclado.getDayOfWeek());

		}
	}

	private static void doWhiles() {
		Scanner ent = new Scanner(System.in);
		String nombre="";
		int telefono= 0;
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fecha=null;
		boolean ejecucion=true;
		
		do {
			try {
		
			System.out.println("Introduce tu nombre");
			nombre=ent.nextLine();
			System.out.println("Introduce un telefono");
			telefono=ent.nextInt();
			System.out.println("Introduzca una fecha");
			fecha=LocalDate.parse(ent.nextLine(),df);
			ejecucion=false;
			
			}catch(DateTimeParseException ex) {
				System.out.println("Fecha incorrecta, pruebe otra vez.");
				ejecucion=true;
			}
		}while(ejecucion);
		System.out.println(fecha.format(df));

	}
	

	private static void datesForms() {
		Scanner entrada= new Scanner(System.in);
		LocalTime minTotal=LocalTime.parse("00:00");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime ahora=LocalTime.now();
		System.out.println("Introduzca la hora de entrada: ");
		
		LocalTime horaDeEntrada= LocalTime.parse(entrada.nextLine(),df);
		System.out.println(ahora.format(df));
	}

	private static void chronomins() {
		Temporal horaDeEntrada = null;
		Temporal ahora = null;
		long minsTotal = ChronoUnit.MINUTES.between(horaDeEntrada, ahora);
		System.out.println(minsTotal);
		
	}

	private static void finallys() {
		Scanner ent= new Scanner (System.in);
		Integer tlfno=0;
		LocalDate cumple=null;
		
		try {
			System.out.println("Numero de telefono");
			tlfno = Integer.parseInt(ent.nextLine());
			System.out.println("Introduce tu cumpleanios");
			cumple = LocalDate.parse(ent.nextLine());

		}catch(DateTimeParseException  ex) {
			System.out.println("Fecha incorrecta");
		}catch(NumberFormatException ex) {
			System.out.println("Numero de tlfno no valido");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {//se ejecuta SIEMPRE
			System.out.println("Fin del bucle");
		}
		
		
	}

	private static void throwException() throws Exception {
			Scanner ent = new Scanner (System.in);
			String nombre="";
			System.out.println("Como te llamas");
			nombre=ent.nextLine();
			if(nombre.isBlank()) {
				throw new Exception("Nombre no puede ser en blanco");
			}else if (nombre.length() >15) {
				throw new Exception("Longitud maxima 15 caracteres");
			}
			
		}
		
	}

