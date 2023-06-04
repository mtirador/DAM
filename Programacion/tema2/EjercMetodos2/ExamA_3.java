package EjercMetodos2;
import java.util.Scanner;

public class ExamA_3 {

	public static void main(String[] args) {
		/*Crear un programa que contenga un método al cual le pasamos 2
parámetros enteros introducidos por teclado (número de carta y palo de
la baraja). El método deberá devolver al main si la carta es válida o no en
formato booleano (si el valor de la carta no es del 1 al 12 y el palo no es
del 1 al 4). En caso que no sea válida, el programa deberá repetirse hasta
que se introduzca una carta válida. Si es válida, se llamará a otro método
que muestre la carta elegida en el formato (4 ptos):
As de copas, sota de bastos, rey de oros…
Los palos van 1 = oros, 2 = copas, 3 = bastos y 4 = espadas.
Las cartas son los números menos el 1 = as, 10 = sota, 11 = caballo y
12 = rey.*/
		
		int numCarta = 0;
		do {
		Scanner ent=new Scanner(System.in);
		System.out.println("Ingrese un numero ");
		numCarta=ent.nextInt();
	
		System.out.println(numero(numCarta)+ " -----> " + verdad(numCarta) );	
			
		
		}while(verdad(numCarta)==false);
		
		
		

	}//fin main

	public static boolean verdad(int carta) {
		
		boolean acierto= true;
		
		if(carta>=1 && carta<=4) {
			acierto=true;
		}else if(carta>=10 && carta<=12) {
			acierto=true;
			
		}else if(carta>12) {
			acierto=false;
		}else {
			acierto=false;
		}
			
		
			return acierto;
		
	}
	
	public static int numero (int a) {
		

		switch(a) {
		
		case 1: System.out.println(a + " as de oros " );break;
		case 2: System.out.println(a + " es copas ");break;
		case 3: System.out.println(a + " es bastos ");break;
		case 4: System.out.println(a + " es espadas ");break;
		case 10: System.out.println(a + " sota ");break;
		case 11: System.out.println(a + " caballos ");break;
		case 12: System.out.println(a + " es oros ");break;
	
		
		
		}
		return a;
		
	}

}
