package Arrays;

import java.util.Arrays;

import UtilesJava.Utilidades;

public class Matriz1 {

	public static void main(String[] args) {
		int[] [] matrices = new int [3] [3]; //primer corchete filas y segundo corchete columnas
		int numAleatorio = 0;
		
		for (int i = 0 ; i < matrices.length ; i++) {			
			for (int j = 0 ; j < matrices.length ; j++) {
				
				do {
					numAleatorio = Utilidades.aleatorio(1, 100);	
				}while (validar(matrices , numAleatorio));
				matrices [i] [j] = numAleatorio;
				
			}
		}
		for (int[] fila : matrices) {
			System.out.println(Arrays.toString(fila));
		}
		
	}
	
	public static boolean validar (int[] [] matriz , int aleatorio) {
		boolean resultado = false;
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz.length ; j++) {
				if (matriz[i][j] == aleatorio) {
					resultado = true;
					break;
				}
			}
		}
		
		return resultado;
		



	}

}
