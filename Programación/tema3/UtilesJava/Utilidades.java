package UtilesJava;

import java.util.Scanner;


/* realizar un algoritmo en el que dado 2 numeros,
 *  tengamos un metodo que genere un numero aleatorio entre esos dos numeros*/
public class Utilidades {
	
	public static int aleatorio(int numero1, int numero2) {
		int aleatorio=0, mayor=0, menor=0;
		
		mayor = getMayor(numero1, numero2);
		menor = getMenor(numero1, numero2);
		
		aleatorio = (int)(Math.random() * (mayor + 1 - menor) + menor);
		
		return aleatorio;
	}
	
	public static int getMayor(int numero1, int numero2) {
		
		int mayor=0;
		
		if(numero1 > numero2) {
			mayor = numero1;
		}else {
			mayor = numero2;
		}
		
		return mayor;
	}
	
	public static int getMenor(int numero1, int numero2) {
		
		int menor=0;
		
		if(numero1 < numero2) {
			menor = numero1;
		}else {
			menor = numero2;
		}
		
		return menor;
		
	}
	
}