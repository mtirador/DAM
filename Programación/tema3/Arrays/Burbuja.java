package Arrays;

import java.util.Arrays;

public class Burbuja {
	public static void main(String[]args) {
		
		/*Ordenar todos los elementos de la lista*/
		
		int[]misNumeros = {3,5,1,9,10,2,4,7,8,6};
		int aux=0;
		
		System.out.println(Arrays.toString(misNumeros));
		
		for(int i=0;i<misNumeros.length-1;i++) {
			
			for(int j=i+1;j<misNumeros.length;j++) {
				
				if(misNumeros[i]>misNumeros[j]){
					aux =misNumeros[i];
					misNumeros[i]=misNumeros[j];
					misNumeros[j]= aux;
					
				}//if
				
				
				
			}//for j
			
			
			
		}//for
		
		//Arrays.sort(misNumeros);
		//System.out.println(Arrays.toString(misNumeros));
		
		System.out.println(Arrays.toString(misNumeros));
		
	}//fin main

}//fin class
