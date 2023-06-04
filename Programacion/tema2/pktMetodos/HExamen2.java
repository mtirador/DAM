package pktMetodos;

import java.util.Scanner;

public class HExamen2 {
	public static void main(String[]args) {
		
		
		Scanner ent = new Scanner(System.in);
		int numero=0;
		String respuesta= "";
		boolean continuar= true;
		
	do {	
		System.out.println("Introduce un numero");
		numero = ent.nextInt();
		
		if(numero >= 1 && numero <=5) {
		System.out.println("La vocal "+ vocal(numero)  + " es la " + numero);
		}else {
		System.out.println("VALOR INCORRECTO (1 - 5) ");
		}
		
		System.out.println("¿Desea continuar si/no?");
		respuesta = ent.next();
		
		if(respuesta.equalsIgnoreCase("si")) {
			continuar=true;
			
			
		}else if(respuesta.equalsIgnoreCase("no")){
			continuar=false;
		}
		
	}while(continuar==true);
	
	
	
	}
	 
	public static char vocal(int num) {
		char letra=' ';
		switch(num) {
		
		case 1:
			letra= 'a';
			break;
		case 2:
			letra= 'e';
			break;
		case 3:
			letra= 'i';
			break;
		case 4:
			letra= 'o';
			break;
		case 5:
			letra= 'u';
			break;
		
		}
		
		return letra;
		
	}

}
