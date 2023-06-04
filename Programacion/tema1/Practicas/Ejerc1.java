package Practicas;

import java.util.Scanner;

public class Ejerc1 {
	public static void main(String[]args) {
		
		
/*1ï¿½) Realiza una aplicaciï¿½n que nos pida un nï¿½mero de ventas a
	introducir, despuï¿½s nos pedirï¿½ tantas ventas por teclado como
	nï¿½mero de ventas se hayan indicado. Al final mostrara la suma de
	todas las ventas. Piensa que es lo que se repite y lo que no.*/
	
	
		Scanner entrada;//declarar el objeto	
		
		entrada = new Scanner(System.in); 
		
		System.out.println("Introducir nï¿½mero de ventas: ");
		int numero = entrada.nextInt();
		
		int contador=1;
		float ventas=0f;
		float ventaT=0f;
		do {
			System.out.println("Ventas: ");
	
			ventas = entrada.nextFloat();
			ventaT = ventaT + ventas;                   
			contador++;                               
		                                                
		}while(contador <= numero);
		
		
	
		System.out.println("La suma total de las ventas es: " + ventaT );
		
		entrada.close();
	
		
		/* for(int i=1, i <=ventas; i++)
		 * syso("Introduce el importe de la " + i + "Compra");
		 * total+=ent.nextFloat();
		 * 
		 * syso( El total a pagar es " + total)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		/*	int numVentas;
		int PrecioVenta;
		int total = 0;
		
		
		Scanner ent = new Scanner(System.in);
		System.out.println("¿Cuantas ventas has tenido?");
		numVentas=ent.nextInt();
		
		for(int i=0;i<numVentas;i++) {
			System.out.println("La " +(i+1)+ " venta ");
			total+=PrecioVenta=ent.nextInt();
			
		}
		
		System.out.println("Total= "+total);*/
		
		
	}

}
