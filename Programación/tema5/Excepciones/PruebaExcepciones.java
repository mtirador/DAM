package Excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PruebaExcepciones {

	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		LocalDate cumple=null;
		String nombre="";
		int tlfno = 0;
		
		boolean flag = true;
				
		while(flag) {
			try {
				nombre= altaNombre();
				System.out.println("¿Cómo te llamas?");
				nombre = ent.nextLine();
				if(nombre.isBlank()) {
					throw new Exception("Nombre no puede ser blanco");
				}
				System.out.println("Número de teléfono");
				tlfno = Integer.parseInt(ent.nextLine());
				System.out.println("Introduce tu cumpleaños");
				cumple = LocalDate.parse(ent.nextLine());
				flag = false;
				
				//las primeras excepciones apareceran  antes por que la clase padre esta mas tarde
			}catch(DateTimeParseException  ex) {
				System.out.println("Fecha incorrecta");
			}catch(NumberFormatException ex) {
				System.out.println("Número de tlfno no válido");
			}catch (Exception ex) { //exception padre
				System.out.println(ex.getMessage());
			}finally {
				System.out.println("fin del bucle");
			}
		}

		System.out.println("Bienvenido " + nombre + "\ncon tfno: "+ tlfno + 
				"\nNacido un " + cumple.getDayOfWeek());
	}
	
		public static String altaNombre() throws Exception{
			
			Scanner ent=new Scanner(System.in);
			String nombre="";
			System.out.println("como te llamas");
			nombre=ent.nextLine();
			if(nombre.isBlank()) {
				throw new Exception("Nombre no puede ser blanco");
			}else if(nombre.length() >15) {
				throw new NumberFormatException("Longitud maxima 15 caracteres");
			}
			return nombre;
		}
	
	
	
}


