package Arrays;

import java.util.Arrays;

public class EjercicioClaseArray {

	public static void main(String[] args) {

/*definir dos arrays y crear un tercero con el multiplo de los elementos*/
		
		
		
		int[] primeros = new int[4];
		int[] segundos = new int[4];
		int[] multiplos = new int[4];
		int posUltima = segundos.length;
		
		for(int i=0;i<multiplos.length;i++) {
			
			primeros[i]=(int)(Math.random()*10)+1;
			segundos[i]=(int)(Math.random()*10)+1;
			multiplos[i]=primeros[i]*segundos[segundos.length-1-i];
			
			
		}//fin for
		
		System.out.println(Arrays.toString(primeros));
		System.out.println(Arrays.toString(segundos));
		System.out.println(Arrays.toString(multiplos));
		
		
		

	}//fin main

}
