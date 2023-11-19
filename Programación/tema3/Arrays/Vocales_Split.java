package Arrays;

import java.util.Scanner;

public class Vocales_Split {

	public static void main(String[] args) {
		
/* pida frase por teclado, que almacene las palabras de la frase en un array, muestre x cada palabra las vocales en un metodo.*/
		
		Scanner ent=new Scanner(System.in);
		String frase="",espacio=" ";
		String [] palabras;
		
		System.out.println("Ingrese la frase: ");
		frase=ent.nextLine();
		
		palabras = frase.split(espacio); 
		
		
		for(String cadena : palabras) {                   //palabras es la lista que queremos recorrer		
		
			System.out.println("la palabra cadena tiene "+ cadena +" tiene "+ misVocales(cadena.toLowerCase()));
		}
		

	}//fin class
	
	public static String misVocales(String cadena) {
		
		int contA=0,contE=0,contI=0,contO=0,contU=0;
		String salida="";
		
		for(int i=0; i<cadena.length();i++) {
		
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
			case'u':
				contU++;
				break;
				default:
				
		}	
			
			
			
	}//for
		salida += contA+ " "+ contE+" "+contI+" "+contO+" "+contU+"\n";
		salida += "Total vocales "+ (contA+ contE+ contI+contO+contU);
		return salida;		
		
	}	
	

		
}// fin main


