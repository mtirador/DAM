package Excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaExcepcionesMarta {

	public static void main(String[] args) {

		Scanner ent=new Scanner(System.in);
		//estoy diciendo que hay 14 posiciones pero solo tengo instanciado 5
		double[] miArray =new double[5];
		
		
		//si está el try yiene que estar el catch o los catch
		
//aqui se pone todo el coduigo que pueda generar error
		
	 	try {
			miArray[0]=ent.nextDouble();
			miArray[4]=4;
			LocalDate fecha=LocalDate.parse("9-9-22");
			System.out.println(fecha);
		
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}catch(DateTimeParseException ex) {
			System.out.println("la fecha no es válida");
		}catch(Exception ex) {
	 		System.out.println("mi error");
	 	}
		
		System.out.println("FIN DEL PROGRAMA");

		
		//........................
		

		
		
		
		
		

	}//fin main

}//fin class
