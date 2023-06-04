package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListasArray {   //unarray es un objeto
	public static void main(String[]args) {
		
		
		int [] numeros; // esta es la forma que se utiliza en CESARP (la que quiere Manu)--- declaración de un array.
		
		/*int lista[]; //pero ésta está bien.*/
		
		//numeros [3]=10000;
		
		//System.out.println(numeros[3]);
		
	
		
		Scanner ent=new Scanner(System.in);
		numeros = new int[5];
		
	
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce la celda "+ i);
			numeros[i] = ent.nextInt();
			
		}
		
		System.out.println(Arrays.toString(numeros));

		
		
		/*for (int valor : numeros) {
			
			System.out.println("***"+valor+"***");
		}
		
	*/
		
		
		
		
		
		
			
		
	}

}
