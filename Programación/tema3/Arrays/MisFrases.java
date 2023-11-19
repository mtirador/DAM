package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MisFrases {

	public static void main(String[] args) {
		
	
		int numFrases=0;
		String [] frases;
		
		Scanner ent= new Scanner(System.in);
	
		System.out.println("¿Cuantas frases vas a introducir?");
		numFrases =ent.nextInt();
		
		frases =new String[numFrases];
		ent.nextLine();
		
		for( int i=0; i< frases.length;i++) {
			
			System.out.println("Introduce la " + (i+1)+ "  frase");
			frases[i] = ent.nextLine();
			
		}
		
		//System.out.println(Arrays.toString(frases));
		//imprimir(frases);
		
		
		imprimir(frases);
		
		
	}//fin main
	
	public static void imprimir (String[] misFrases) {  //foreach
		
		for(String cadena : misFrases) {
			System.out.println(cadena);  // System.out.print(cadena+"\t");
			
		}
		
	}


	
	

}//fin class
