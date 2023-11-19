package ArrayKatas;

import java.util.Arrays;

public class Burbuja {
	public static void main(String[]args) {
		
	/*hacer una busqueda*/
		
		int[]misNumeros = {2,15,51,9,10,26,47,7,82,6};
		
		Arrays.sort(misNumeros);
		
		System.out.println(Arrays.toString(misNumeros));
		System.out.println(Arrays.binarySearch(misNumeros, 3));
		
		
		
		
	}//fin main
	
	

}//fin class
