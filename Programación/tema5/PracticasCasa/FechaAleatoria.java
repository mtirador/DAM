package PracticasCasa;

import java.time.DateTimeException;
import java.time.LocalDate;

public class FechaAleatoria {

	public static void main(String[] args) {

		boolean flag = true;

		do {
			try {
				System.out.println(genFecha());
				flag = false;

			} catch (DateTimeException ex) {
				System.out.println("fecha incorrecta");

			}

		} while (flag);
	}

	public static LocalDate genFecha() {
		int dias = (int) (Math.random() * 31)+1;
		int meses = (int) (Math.random() * 32)+1; //le doy valor 32 para que me cree fallos
		int años = (int) (Math.random() * 2024);

		LocalDate fechaAleatoria = LocalDate.of(años, meses, dias);

		return fechaAleatoria;
	}
	
	/*
	 * public static LocalDate.genFecha(){
	 * 
	 * LocalDate fecha=nulll;
	 * boolean run=true;
	 * 
	 * 
	 * while(run){
	 * try{
	 * 			fecha=LocalDate.of(int)(Math.random()*2024),
	 * 					(int)(Math.random()*31),
	 * 					(int)(Math random() *32));)
	 * 				run=false;
	 * 
	 * }catch(DateTimeException ex){
	 * System.out.println(ex.getMessage());
	 * }
	 * 
	 * 
	 * }
	 * return fecha;
	 * )
	 * 
	 * }
	 * 
	 * 
	 
	*/
	

}
