package pkt;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args) {
		int operador;
		System.out.println("|| BIENVENIDO A CALCULADORA BÁSICA ||");
		Scanner ent = new Scanner(System.in);
		int num1, num2,resultado;
		
		do {
		
		System.out.println(" ");
		System.out.println("Introduce un numero");
		num1= ent.nextInt();
		
		System.out.println("Seleccione un operador:  + , - , * , /  ");
		System.out.println("SUMAR[1], RESTAR [2],MULTIPLICAR[3],DIVIDIR[4], SALIR[5]");
		operador=ent.nextInt();
		
		System.out.println("Introduce otro numero");
		num2 = ent.nextInt();
		
	
		switch(operador) {
		
		case 1:
			resultado = sumar(num1, num2);
			System.out.println("la suma de "+ num1+" + "+ num2+ " es "+ resultado);
			
			break;
		case 2:
			resultado = restar(num1,num2);
			System.out.println("la resta de "+ num1+" - "+ num2+ " es "+ resultado);
			break;
		case 3:
			resultado = multiplicar(num1,num2);
			System.out.println("la multiplicacion de "+ num1+" * "+ num2+ " es "+ resultado);
			break;
		
		case 4:
			resultado = dividir(num1,num2);
			
			System.out.println("la division de "+ num1+" / "+ num2+ " es "+ resultado);
			break;
		
		case 5:
			System.out.println("Gracias, hasta pronto");
			
			break;
			
		default:
			System.out.println("El operador que ha utilizado no existe");
			
		
		} 
		
		}while(operador != 5);
		
		ent.close();
		
	}

	public static int sumar(int a , int b) {
	
		int total;
	
		total=a+b;
	
		return total;
	
	}

	public static int restar(int a , int b) {
	
		int total;
	
		total=a-b;
	
		return total;

	}

	public static int multiplicar(int a , int b) {
	
		int total;
	
		total=a*b;
	
		return total;
	
	}

	public static int dividir(int a , int b) {
		int total;
		try {
			
		
		total=a/b;
	
	/*	int total=0;
		
		if(b!=0) {
			total=a/b;
		}
	
	*/
		
	}catch(ArithmeticException ex) {
		System.out.println("Mensaje estandar");
		System.out.println(ex);
		ex.printStackTrace();
		total=0;
		
	}
		return total;
	}
	  
	 
}

