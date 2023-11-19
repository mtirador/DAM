package Excepciones;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programita {

	public static void main(String[] args) {
		//tres datos enteros dia mes año y tenemos que construir una fecha y mostrarla por pantalla 
		//si has metido mal el mes que te lo pida
		
	/*	DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Ingrese una fecha ");
*/
		
		
		int dia=0,mes=0,año=0,numError=1,error=0;
		boolean flag=true;
		
		Scanner ent=new Scanner(System.in);
		LocalDate fecha=null;
		
		while(flag) {
		
			try {
				if (error==0) {
					System.out.println("Ingrese el dia");
					dia=Integer.parseInt(ent.nextLine());  //cuando utilizamos el parseint se pueden producir excepciones.
					error=1;
				}
					
				if (error==1) {
					System.out.println("Ingrese el mes");
					mes=Integer.parseInt(ent.nextLine());
					error=2;
				}
				
				if (error==2) {
					System.out.println("Ingrese el año");
					año=Integer.parseInt(ent.nextLine());
					error=3;
				}
				
				
				fecha= LocalDate.of(año, mes, dia);
				flag=false;
			
			}catch(DateTimeException ex) {
				System.out.println(ex.getMessage());
				if(ex.getMessage().contains("MonthOfYear")) {
					error=1;
				}else if(ex.getMessage().contains("DayOfMonth")) {
					error=2;
				}else {
					System.out.println("Fecha inválida");
					break;
				}
					
			}catch(NumberFormatException ex) {
				System.err.println(ex.getMessage());
			}
			
		}
			
			System.out.println("La fecha es " + fecha);
			
		}
	
	}
