package Practicas;

public class Recuperacion1 {
	public static void main(String[]args) {
		
		/*Construir un programa en el que, utilizando un bucle while o do_while
muestre por pantalla los números que hay entre 0 y un número aleatorio.
Para generar el número aleatorio utilizar la siguiente instrucción (3 ptos):
(int)(Math.random() * 80) + 20*/
		
		int num1= (int)(((Math.random()*80)+20));
		int num2=0;

		System.out.println(num2 + "," +num1);
		
		int menor=0,mayor=0;
		
		if(num1 >num2) {
			mayor =num1;
			menor=num2;
			
		}else {
			mayor=num2;
			menor=num1;
			
		}
		for(int i= menor; i<=mayor; i++ ) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			
			
			
			
		}
		
		
	

	/*	
		int num1=0;
		int num2=(int)(((Math.random()*80)+20));
		int contador=0;
		
		System.out.println(num1 + ","+num2);
		
		
		
		
		do {
			 num1=contador;
			
			 System.out.println(contador);
			 contador++;
			
			
			
		}while(contador<=num2);
		
		
		*/
		
		
	}

}
