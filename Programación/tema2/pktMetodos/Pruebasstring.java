package pktMetodos;

import java.util.Scanner;

public class Pruebasstring {
	public static void main(String[]args) {
		
	/*	Scanner ent = new Scanner(System.in);
		System.out.println("introduce la frase");
		String frase= ent.nextLine();
	*/
		
		String frase ="La lluvia";
		
	
		System.out.println("La longitud de esta frase es "+ frase.length());
		System.out.println("El car�cter 1 es el \""  + frase.charAt(1) + "\"");
		System.out.println("El ultimo car�cter es el "+ frase.charAt(frase.length()-1));
		
		
		for(int i=0;i < frase.length(); i++) {
			
			System.out.println(i + "--" + frase.charAt(i));
			
			
			
			
		}
		
	}

}
