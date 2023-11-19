package Practicas;

import java.util.Scanner;

public class Ejerc6_adivina100 {
	public static void main(String[]args) {
		
	/*6�) Generar un n�mero entero aleatorio entre 1 y 100. El usuario
tendr� 5 intentos para adivinar el n�mero generado introduciendo
un n�mero por teclado. Por cada intento se mostrar� un mensaje
indicando si se ha pasado porque ha introducido un n�mero mayor
que el generado, o se ha quedado corto porque es menor.*/	
		
		
		Scanner scanner = new Scanner(System.in);
		 int numeroAleatorio;
		 int intento;
		 int contador = 5;
		 
		 numeroAleatorio = (int) (Math.random()*101);
		 System.out.println("Intenta adivinar un n�mero aleatorio entre el 1 y 100. "
		     + "Tienes 5 intentos.");
		 System.out.println(numeroAleatorio);
		
		 do {
		   System.out.println("N�mero contador: " + contador);
		   System.out.print("Introduce el n�mero que creas posible: ");
		   intento = scanner.nextInt();
		   if (intento > numeroAleatorio) {
		     System.out.println("El n�mero que buscas es menor, te quedan "
		         + (contador-1) + " intentos: ");
		   } else if (intento < numeroAleatorio){
		     System.out.println("El n�mero que buscas es mayor, te quedan "
		         + (contador-1) + " intentos: ");
		   } else {
		     System.out.print("�CORRECTO! "+ numeroAleatorio + " era el n�mero que estabas "
		         + "buscando, has necesitado " + (5 - (contador-1)) +" intentos.");
		   }
		   contador--;
		 } while (intento != numeroAleatorio && contador > 0);
		 if (contador == 0) {
		   System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		 }
		
	

		
		
	}

}
