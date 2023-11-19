package ExpresionesRegulares;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
	Scanner ent=new Scanner(System.in);
		/*String regex= "^[0-9]{8}[a-zA-Z]$"; //no tiene que haber espacios
		
		
		System.out.println("Introduce un dni");
		if(ent.nextLine().matches(regex)) {
			System.out.println("Dni válido");
		}else {
			System.out.println("no válido");
		}
		*/
		
		String regex ="^\\d{8}[A-HJ-NP-TV-Z]$";
		
		System.out.println("Introduce un dni");
		
		
		if(ent.nextLine().toUpperCase().matches(regex)) {
			System.out.println("DNI Válido");
		}else {
			System.out.println("No valido");
		}
		
		//para matriculas
		/*
		String regM = "^E[0-9]{1}[A-Z]{3}$";
		
		System.out.println("Matricula");
		
		if (ent.nextLine().toUpperCase().matches(regM)) {
			System.out.println("OK");
		}else {
			System.out.println("No funka");
		}
			
		*/
		
		
		
		
		
		
		
		
		

	}

}
