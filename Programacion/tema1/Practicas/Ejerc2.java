package Practicas;

import java.util.Scanner;

public class Ejerc2 {
	public static void main(String[]args) {

		
		
		Scanner ent = new Scanner(System.in);	
		String passAlmacenada= "12345", passEntrada="";
		boolean acierto = false;//para el do
		int contador=3;//para el do
/*		
		for(int i=1; i<=3; i++) {
			System.out.println("Introduce contraseña (intento"+ i + ")");	 //indicar lo que quiero pedir
			passEntrada = ent.next();
			
			if(passEntrada.equals(passAlmacenada)) {    //equals `para comparar nombre es equals y para int el ==
				System.out.println("Enhorabuena");
				break;
				
			}else {
				System.out.println("Incorrecto");
			}
			
		}
		*/
		
		do {
			
			System.out.println("Introduce contraseña " + contador);	 
			passEntrada = ent.next();
			
			if(passEntrada.equals(passAlmacenada)) {    
				System.out.println("Enhorabuena");
				acierto=true;
				
			}else {
				System.out.println("Incorrecto");
				
			}
			contador--;
			
		}while(!acierto && contador>0);
		
	}

}
