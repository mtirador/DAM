package SimulacroExamenFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ArrayList<SimFiesta> miAgenda=new ArrayList <SimFiesta>();
		SimFiesta objFiesta=new SimFiesta();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i=5;i>0;i--) {
			System.out.println("Introduce el nombre de la fiesta");
			objFiesta.setNombre(ent.nextLine());
			System.out.println("Introduce la localidad");
			objFiesta.setLocalidad(ent.nextLine());
			try {
				System.out.println("Introduzca la fecha de inicio");
				objFiesta.setfInicio(LocalDate.parse(ent.nextLine(),df));
				System.out.println("Introduzca la fecha de fin");
				objFiesta.setfFin(LocalDate.parse(ent.nextLine(),df));
				
				miAgenda.add(objFiesta);
			}catch(DateTimeParseException ex) {
				System.out.println("Error");
				i++;
			}
			
		}
		for(SimFiesta f: miAgenda) {
			System.out.println((f));
		}
		
		mostrar(miAgenda);
	}

	public static void mostrar(ArrayList<SimFiesta> miAgenda) {
		for(SimFiesta f: miAgenda) {
			System.out.println(f);
		}
		
	}

}
