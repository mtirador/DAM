package Fechas;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Parquimetro {

	public static void main(String[] args) {
		
	
		Scanner ent=new Scanner(System.in);
		double importe=0.0;
		double minutos=0.0;
		
		//hora de entrada
		System.out.println("Ingrese cuando comienza su estacionamiento ");
		LocalTime entrada=LocalTime.parse(ent.nextLine());
		//System.out.println("la hora de su estacionamiento es "+ entrada);
		
		
		
		//hora de salida
		System.out.println("Hora de salida:");
		LocalTime salida=LocalTime.parse(ent.nextLine());
		System.out.println("La hora de salida de su estacionamiento es " + salida);
		
		
		
		minutos= ChronoUnit.MINUTES.between(entrada, salida);
		
		if(minutos<=60) {
			importe=minutos*0.20;
			System.out.println("Minutos: "+ minutos +"Tiene que pagar: "+ importe);
			
		}else if(minutos>60 && minutos<300) {
			importe=minutos*0.15;
			System.out.println("Minutos"+ minutos+ "Tiene que pagar: "+ importe);
			
		}else if(minutos>=300) {
			importe=minutos*0.10;
			System.out.println("Minutos "+minutos+"Tiene que pagar: "+ importe);
		
		}
	
		
		
		
	}

}
