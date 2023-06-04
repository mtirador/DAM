package pktMetodos;

import java.util.Scanner;

public class FrasesReves {
	public static void main(String[]args) {
		
	/*Crear un programa en Java que permita leer de la entrada estándar
una frase introducida por el usuario y muestre por consola los caracteres
de la frase al revés (2 ptos).*/
		
		
		String frase;
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese una frase");
		frase =ent.nextLine();
		
		System.out.println("Has introducido "+ frase);

	
		for(int i=0;i < frase.length(); i++) {
			
			System.out.println(i + "--" + frase.charAt(i));
			
			
		}
		
		
		for(int i=frase.length()-1;i>=0; i--) {
			
			System.out.println(i + "--" + frase.charAt(i));
			
			
		}
	
		
	}

}
