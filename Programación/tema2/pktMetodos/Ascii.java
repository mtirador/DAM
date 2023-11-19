package pktMetodos;

import java.util.Scanner;

public class Ascii {
	public static void main(String[]args) {
		
/*Crear un programa en Java que permita la entrada de un número por
la consola y mediante un método este nos devuelva el carácter
correspondiente de la tabla ASCII para mostrar por pantalla el número y el
carácter. El programa se ha de ejecutar mientras el usuario no indique lo
contrario, para ello aplicaremos lo necesario que permita que se repita la
ejecución y pare al preguntar si desea continuar.*/
		
		Scanner ent = new Scanner(System.in);
		int numero=0;
		String respuesta= " ";
		boolean continuar= true;
		
	
	do {
		System.out.println("Introduce un numero");
		numero =ent.nextInt();
		
		System.out.println("La vocal " + ascii(numero)+ " es el codigo " + numero);
		
		System.out.println("¿Desea continuar si/no? ");
		respuesta = ent.next();
		
		if(respuesta.equalsIgnoreCase("si")) {
			continuar = true;
		}else if(respuesta.equalsIgnoreCase("no")) {
			continuar=false;
			System.out.println("hasta pronto");
		}else {
			System.out.println("ERROR");
		}
		
	}while(continuar==true);
	
	
	
	}
	 
	public static char ascii(int num) {
		char letra=(char)num;
		
		
		return (char) num;
		
	}



		


	
	}
	
	
	
	
	
	

	
