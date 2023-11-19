package pktMetodos;

import java.util.Scanner;

public class EjercicioMayor {
	public static void main(String[]args) {
		
		//un programa en Java que calcule si un numero es mayor que otro utilizando un método.
		//Realizar otro método para indicar el menor de los números.

		
		Scanner ent = new Scanner(System.in);
		
		int num1, num2, resultado, menor1;
		
		System.out.println("Introduce un numero");
		num1= ent.nextInt();
		System.out.println("Introduce otro numero");
		num2 = ent.nextInt();
		resultado = mayor(num1,num2);
		menor1 = menor(num1,num2);
		
		System.out.println("El numero Mayor es "+ mayor(num1,num2));
		System.out.println("El numero Menor es "+  menor(num1,num2));
		
		
}	
	
		public static int mayor(int a ,int b) {
			
		int numMayor = 0;
			
			if(a>b) {
				numMayor = a;
			
						
			}else if(b>a) {
				numMayor=b;
				
			}else {
				
				System.out.println(a + " y "+ b + " son iguales");
			}
				
			
			return numMayor ;
			
		}
		
		public static int menor(int a ,int b) {
			
			int numMenor = 0;
				
				if(a<b) {
					numMenor = a;
				
							
				}else if(b<a) {
					numMenor=b;
					
				}else {
				
						
				}
				
				return numMenor ;
				
				
	}
		

		
		
		
}

