package PrimerasClases;

import java.util.Scanner;

//Inicio del programa y declaraci�n de variables:
public class Pract_Scanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio;
		int intento;
		int contador = 10;
		// Obtenci�n de n�mero aleatorio
		numeroAleatorio = (int) (Math.random() * 101);
		System.out.println("Intenta adivinar un n�mero aleatorio entre el 1 y 100. " + "Tienes 10 intentos.");
		System.out.println(numeroAleatorio);
		// Realizaci�n del ciclo do-while
		do {
			System.out.println("N�mero contador: " + contador);
			System.out.print("Introduce el n�mero que creas posible: ");
			intento = scanner.nextInt();
			if (intento > numeroAleatorio) {
				System.out.println("El n�mero que buscas es menor, te quedan " + (contador - 1) + " intentos: ");
			} else if (intento < numeroAleatorio) {
				System.out.println("El n�mero que buscas es mayor, te quedan " + (contador - 1) + " intentos: ");
			} else {
				System.out.print("�CORRECTO! " + numeroAleatorio + " era el n�mero que estabas "
						+ "buscando, has necesitado " + (10 - (contador - 1)) + " intentos.");
			}
			contador--;
		} while (intento != numeroAleatorio && contador > 0);
		if (contador == 0) {
			System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		}

	}
}