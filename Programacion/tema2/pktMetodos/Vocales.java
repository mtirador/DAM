package pktMetodos;

import java.util.Scanner;

public class Vocales {
	public static void main(String[]args) {

	        Scanner ent = new Scanner(System.in);

	        System.out.println("¿Desea continuar? S/N");



	        char resp = ent.next().toUpperCase().charAt(0);

	        String cadena = (resp=='S')? "Continuamos": "Salimos";

	        System.out.println(cadena);
	        
	    }
	}
		
		
		
		
		
