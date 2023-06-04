package SimulacroExamenFechas;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ticajes {
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		final int jornadaCompleta = 480;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		Duration entre=null;
		boolean flag=true;
		
		//hacer el bucle en casa

		try {
			
			System.out.println("Ingrese la entrada de trabajo");
			LocalTime hEntrada = LocalTime.parse(ent.nextLine(), df);
			
			System.out.println("Ingrese la salida de trabajo");
			LocalTime hSalida = LocalTime.parse(ent.nextLine(), df);

			entre = Duration.between(hEntrada, hSalida);
			System.out.println(entre);


			if (entre.toHours() >= 8) {
				System.out.println("Jornada completa");
			} else {
				System.out.println("Faltan " + (jornadaCompleta - entre.toHours() + "horas"));
			}
		
		} catch (DateTimeParseException ex) {
			System.out.println("Error al meter mal la fecha");
		}catch(DateTimeException ex) {
			System.out.println(ex.getMessage());
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		
		

	}

}
