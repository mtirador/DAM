package Arrays;

import java.util.Arrays;

import UtilesJava.Utilidades;

public class ParesImpares2 {

	public static void main(String[] args) {

		       
		        int[] lista = new int[15];
		        int[] listaPares=new int[0], listaImpares=new int[0];
		       
		        for(int i=0 ; i < lista.length ; i++) {
		            lista[i] = Utilidades.aleatorio(1, 100);
		            if(lista[i] % 2 == 0) {
		                listaPares = Arrays.copyOf(listaPares, listaPares.length + 1);
		                listaPares[listaPares.length -1] = lista[i];
		            }else {
		                listaImpares = Arrays.copyOf(listaImpares, listaImpares.length + 1);
		                listaImpares[listaImpares.length -1] = lista[i];
		            }
		        }
		       
		       
		        System.out.println(Arrays.toString(lista));
		        System.out.println("Pares -> " + Arrays.toString(listaPares));
		        System.out.println("Impares -> " + Arrays.toString(listaImpares));
		    
		
		
		

	}//fin main

}//fin class
