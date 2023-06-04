package PracticasCasa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FiestaTester {

	public static void main(String[] args) {
	
		Scanner ent=new Scanner(System.in);
		ArrayList<Fiesta>lista=new ArrayList<Fiesta>();
		Fiesta objParty= new Fiesta();//objeto que voy a utilizar
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for(int i=0;i<5;i++) {
		
			
			try {
			objParty=new Fiesta(); //lo instancio dentro del bucle
			System.out.println("Ingrese el nombre de la fiesta");
			objParty.setNombre(ent.nextLine());
			System.out.println("Ingrese la localidad ");
			objParty.setLocalidad(ent.nextLine());
			System.out.println("Ingrese la fecha ");
			objParty.setFinicio(LocalDate.parse(ent.nextLine(), df));
			System.out.println("Ingrese la fecha final ");
			objParty.setFfinal(LocalDate.parse(ent.nextLine(), df));
			
			lista.add(objParty);			
			
			}catch(DateTimeParseException ex) {
				System.out.println("error");
				i--;
				
			}

		}//fin for
		
		
		for(Fiesta fi: lista) {
			
			System.out.println(fi.toString());
		}
		
		

	}//fin main
	
	

}
