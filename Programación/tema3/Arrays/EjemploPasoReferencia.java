package Arrays;

import java.util.Arrays;

public class EjemploPasoReferencia {
	public static void main(String []args) {
		
		int[] numeros = {1,2,3,4,5};
		int numero=10;
		String cadena="Hola";
		
		miMetodo(numeros);
		miOtroMetodo(numero,cadena);
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(numero+" ---"+ cadena);
		
		
	}
	
	public static void miMetodo(int[]lista) {
		
		lista[2]=12;
		
		
		
	}
	public static void miOtroMetodo(int x, String texto) {
		x=15;
		texto += "Mundo";
	}

}
