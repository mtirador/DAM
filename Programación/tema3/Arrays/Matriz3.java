package Arrays;

import java.util.Arrays;

import UtilesJava.Utilidades;

public class Matriz3 {

	public static void main(String[] args) {
		
		int fil=3, col=3;
		int [] [] matrices = new int [fil] [col];
		String listaNum="";
		int numAleatorio=0;

		
		for(int i=0;i<matrices.length;i++) {
			for(int j=0; j<matrices[i].length;j++) {
				do {
					
				numAleatorio = Utilidades.aleatorio(1, 9);
				
				}while(listaNum.contains("*"+numAleatorio+"*"));
				
					matrices[i][j]= numAleatorio;
					listaNum+="*"+numAleatorio+"*";
					
				
			}
		}
		
		
		for(int[] fila : matrices) {
			System.out.println(Arrays.toString(fila));
		}
		
		
		
		
		
		
	}//fin class

}//fin main
