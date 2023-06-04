package EjercMetodos2;

import java.util.Scanner;

public class Ejerc1 {
	public static void main(String[]args) {

		
		//Realizar un algoritmo que pida por teclado una cadena de texto y mediante
		//un método, cuente el total de vocales y muestre la lista de cada una de
		//ellas.
		
		
		Scanner ent = new Scanner(System.in);
		String frase = " ";
		
		System.out.println("Introduce una frase ");
		frase = ent.nextLine().toLowerCase(); //pasar a minusculas con tolowercase
		
		misVocales(frase);
			
		

	}
	
	public static void misVocales(String cadena) {
		
		int contA=0;
		int contE=0;
		int contI=0;
		int contO=0;
		int contU=0;
		
		for(int i =0; i < cadena.length(); i++) {
			
			/*if (cadena.charAt(i) == 'a'){
			 * contA++;
			 * }else if()
			 */
			
			switch(cadena.charAt(i)) {
			
			case 'a':
				contA++;
				break;
			case 'e':
				contE++;
				break;
			case 'i':
				contI++;
				break;
			case 'o':
				contO++;
				break;
			case 'u':
				contU++;
				break;
			default:
		
			}//fin switch
			
			
			
		}//fin de for"
		System.out.println(contA + " "+ contE + " "+ contI+ " "+ contO + " " + contU);
		System.out.println("Total vocales " + (contA+contE+contI+contO+contU));
		
	}

}
