package Arrays;

import java.util.Arrays;

import UtilesJava.Utilidades;

public class Matriz2 {
	
// ordenar los numeros aleatorios en arreglo bidimensional.
	public static void main(String[] args) {
		
	int fil=3,col=3;
	int [] [] matrices= new int [fil][col];
	int [] numerosGenerados = new int [fil*col];
	int numAleatorio=0,pos=0;
	
	System.out.println("Inicio");
	for(int i=0;i< matrices.length;i++) {
		for(int j=0; j<matrices[i].length;j++) {
			Arrays.sort(numerosGenerados);
			
			do {
				numAleatorio = Utilidades.aleatorio(1, 9);
				
			}while(Arrays.binarySearch(numerosGenerados, numAleatorio)>0);
			numerosGenerados[pos]= numAleatorio;
			pos++;
			matrices[i][j]=numAleatorio;
		}
	}
	
	for (int [] fila: matrices) {
		System.out.println(Arrays.toString(fila));
	}
		
		

	}// fin main
	
	


}
