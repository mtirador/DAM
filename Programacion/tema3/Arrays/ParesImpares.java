package Arrays;

import java.util.Arrays;

import UtilesJava.Utilidades;

public class ParesImpares {

	public static void main(String[] args) {
		
		/*Crear un array de 15 números, rellenarlo de forma aleatoria. 
		 * Después crear 2 arrays, uno con los pares y otro con los impares.*/
		
		
		int[] lista = new int [15];
		int[] listaPares, listaImpares;
		int par =0; 
		int contP=0,contI=0;
		
		for(int i=0; i<lista.length;i++) {
			lista[i]= Utilidades.aleatorio(1, 100);
			
			if(lista[i] % 2 == 0) {
				par++;
				
			}
			
			
		}
		listaPares = new int[par];                   //instanciar lista par
		listaImpares = new int[lista.length-par];   //instanciar lista impar
		
		
		for(int i : lista) {
			if(i % 2 == 0) {
				listaPares[contP] = i;
				contP++;
			}else {
				listaImpares[contI] = i;
				contI++;
			}
			
		}
		
		
		
		System.out.println(Arrays.toString(lista));
		System.out.println(" ");
		System.out.println(Arrays.toString(listaPares));
		System.out.println(" ");
		System.out.println(Arrays.toString(listaImpares));

	}

}
