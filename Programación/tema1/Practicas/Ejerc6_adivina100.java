package Practicas;

import java.util.Scanner;

public class Ejerc6_adivina100 {
	public static void main(String[]args) {
		
	/*6º) Generar un número entero aleatorio entre 1 y 100. El usuario
tendrá 5 intentos para adivinar el número generado introduciendo
un número por teclado. Por cada intento se mostrará un mensaje
indicando si se ha pasado porque ha introducido un número mayor
que el generado, o se ha quedado corto porque es menor.*/	
		
		
		Scanner scanner = new Scanner(System.in);
		 int numeroAleatorio;
		 int intento;
		 int contador = 5;
		 
		 numeroAleatorio = (int) (Math.random()*101);
		 System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. "
		     + "Tienes 5 intentos.");
		 System.out.println(numeroAleatorio);
		
		 do {
		   System.out.println("Número contador: " + contador);
		   System.out.print("Introduce el número que creas posible: ");
		   intento = scanner.nextInt();
		   if (intento > numeroAleatorio) {
		     System.out.println("El número que buscas es menor, te quedan "
		         + (contador-1) + " intentos: ");
		   } else if (intento < numeroAleatorio){
		     System.out.println("El número que buscas es mayor, te quedan "
		         + (contador-1) + " intentos: ");
		   } else {
		     System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
		         + "buscando, has necesitado " + (5 - (contador-1)) +" intentos.");
		   }
		   contador--;
		 } while (intento != numeroAleatorio && contador > 0);
		 if (contador == 0) {
		   System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		 }
		
	

		
		
	}

}
