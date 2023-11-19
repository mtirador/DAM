package pktMetodos;

import java.util.Scanner;

public class TablaAscii {
	public static void main(String []args) {
		
		
		
		Scanner ent = new Scanner(System.in);
		
		String frase="";
		
		System.out.println("Introduce la frase ");
		frase= ent.nextLine();
		
		
		for(int i=0; i<frase.length();i++) {
			
			System.out.println("caracter:" + frase.charAt(i) + (int)frase.charAt(i));
			
		}
		
	}

}
