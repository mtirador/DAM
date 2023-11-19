package Practicas;

import java.util.Scanner;

public class Ejerc5 {
	public static void main(String[]args) {
		
/*5º) Pedir números al usuario y cuando el usuario meta un -1 se
terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor número introducido
– suma de todos los números
– suma de los números positivos
– suma de los números negativos
– media de la suma (la primera que pido)
El número -1 no contara como número.*/
		
		
		
		Scanner ent = new Scanner(System.in);
		int numero=0;
		int mayor=0,menor=Integer.MAX_VALUE;
		
		while(numero != -1) {
			
			System.out.println("Introduce un numero");
			numero= ent.nextInt();
			
			if (numero>mayor) {
				mayor = numero;
			}else if(numero<menor) {
				menor = numero;
			}
			
			
			
		}
		
		
		
	System.out.println("El mayor es " + mayor);	
	System.out.println("El menor es " + menor);
		
		
		
	}

}
