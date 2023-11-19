package PrimerasClases;

import java.util.Scanner;

public class Escaner {
	public static void main(String[]args) {
	
	//declaración de un objeto.	
		Scanner entrada;                                //
		                                                // o Scanner entrada = new Scanner(System.in);
		entrada = new Scanner(System.in);               //
		String nombre ="";
		
		System.out.println("introduce un numero");
		
		int numero = entrada.nextInt();
		
		System.out.println("Has introducido " + numero);
		
		entrada.nextLine();
		System.out.println("Introduce tu nombre ");
		entrada.nextLine();
		
	    entrada.close();
		
		
	}

}
