package EjercMetodos2;

import java.util.Scanner;

public class Ejerc2 {
	public static void main(String[]args) {
		
		
		//Crear un programa con un método que reciba la hora, minutos y segundos
		//en el siguiente formato HH:MM:SS y muestre los segundos totales.
		
		
		Scanner ent = new Scanner(System.in);
		String hora = " ";
		long segundos=0;
		
		System.out.println("Introduce la hora HH:MM:SS");
		hora = ent.nextLine();
		
		segundos = aSegundos(hora);
		System.out.println("Total segundos " + segundos);
		
			
		
		
	}
	
	public static long aSegundos(String tiempo) {
		
		long resultado = 0;
		
		long horas =Long.parseLong(tiempo.substring(0, 2));              // (tiempo.substring(0, 2));
		long min = Long.parseLong(tiempo.substring(3, 5));               //(tiempo.substring(3, 5));
		long seg = Long.parseLong(tiempo.substring(6, 8));               //(tiempo.substring(6, 8));
		
		resultado = horas + 3600 + min * 60 + seg;
		
		
		return resultado;
		
		
		
	}

}

		
		
		
		
		
		
		
		
		

