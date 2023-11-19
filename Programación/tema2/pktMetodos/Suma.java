package pktMetodos;

import java.util.Scanner;

public class Suma {
	public static void main(String[]aux) {
		
		Scanner ent = new Scanner(System.in);
		int num1=0, num2=0, resultado;
		
		System.out.println("Introduce un numero");
		num1= ent.nextInt();
		System.out.println("Introduce otro numero");
		num2 = ent.nextInt();
		resultado = sumar(num1, num2);
		
		System.out.println("la suma de "+ num1+" + "+ num2+ " es "+ resultado);
		
	}
	
	public static int sumar(int a , int b) {
	
		int total=0;
	
		total=a+b;
	
		return total;
	

	
	
	}

}
