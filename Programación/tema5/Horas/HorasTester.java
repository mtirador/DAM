package Horas;

import java.time.Duration;
import java.time.LocalTime;

public class HorasTester {

	public static void main(String[] args) {
	
		LocalTime entrada=LocalTime.of(13, 0);
		LocalTime salida=LocalTime.of(20, 30);
		
		Duration entre=Duration.between(entrada, salida);
		
		System.out.println(entre.toHours());
		System.out.println(String.format("Minutos %s", entre.toMinutes()));

	}

}
