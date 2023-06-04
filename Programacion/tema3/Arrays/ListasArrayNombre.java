package Arrays;

import java.util.Arrays;

public class ListasArrayNombre {
	public static void main(String[]args) {
		
		
		
		char[] lista = new char[10];
		String[] frases = new String[5]; //0-4
		float[] precios = new float[5];
	
		
//las operaciones que se pueden hacer con arrays son lectura y escritura
		
		lista[0]= 'h';
		frases[4]= "hola mundo"; //frases[frase.lenght-1]="Hola mundo";   [5-1]
		
		System.out.println("*" + Arrays.toString(frases) + "*");
		
//en java podemos declarar e inicializar objetos en primera linea
		
		int[] numeros = {5,8,2,7,6,10};
		
		System.out.println(numeros[4]);
		
		
	}
	
	
	
}


