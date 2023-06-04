package pktMetodos;

import java.util.Scanner;

public class Saludos {
	public static void main(String[]args) {
		
	//como se pasa de un metodo a otro	
		
		
	/*
		String saludo= "Hola mundo";
		
		saludar(saludo);
		saludar("FERNANDO");
		saludar ("wtf");
		
		System.out.println("FIN");
		*/
		
		Scanner ent = new Scanner(System.in);
		String nombre = " ";
		
		System.out.println("Introduce tu nombre ");
		nombre = ent.nextLine();
		
		saludar(nombre);
		System.out.println("FIN");
		
	}
	
	
	public static void saludar(String nombre) {
		
		System.out.println("Bienvenid@ " + nombre);
		
		
	}
		


		

		
		
		
		
		
	

}
