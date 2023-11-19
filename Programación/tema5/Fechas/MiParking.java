package Fechas;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MiParking {

	public static void main(String[] arg) {
		
		float[] monedas = {2.0f,1.0f,0.5f,0.2f,0.1f,0.05f,0.01f};
		Scanner ent = new Scanner(System.in);
		float precio= 0.05f, aPagar=0.0f, aDevolver=0.0f;
		int numMonedas=0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Introduzca la hora de entrada");
		LocalTime horaEntrada = LocalTime.parse(ent.nextLine());
		Duration estancia = Duration.between(horaEntrada, LocalTime.now());
		
//		if(horaEntrada.isBefore(LocalTime.now())) {
		if(estancia.isPositive()) {
			if((horaEntrada.compareTo(LocalTime.of(0, 0))>= 0 &&
					horaEntrada.compareTo(LocalTime.of(8, 0)) <= 0) ||
					(estancia.toHours() >= 5)){
				precio = 0.01f;
			}else if(estancia.toHours() >= 1 && estancia.toHours() < 5 ) {
				precio = 0.02f;
			}

			aPagar = Float.parseFloat(df.format(estancia.toMinutes()*precio).replace(",", "."));
			System.out.println("Debe por " + estancia.toHours() + " horas "
					+ (estancia.toMinutes() - estancia.toHours() * 60)+ " min, "
					+ (aPagar) + " a " + precio + "ct/min");

			System.out.println("Introduzca el importe");
			aDevolver = ent.nextInt() - aPagar;
			System.out.println("A devolver " + df.format(aDevolver));
			
			for(float moneda : monedas) {
				numMonedas = (int)(aDevolver / moneda);
				if( numMonedas > 0) {
					System.out.println(numMonedas + " de " + moneda + " euros");
					aDevolver -= (numMonedas*moneda);
				}
			}			

		}else {
			System.out.println("Hora no válida");
		}
		

	}
}
