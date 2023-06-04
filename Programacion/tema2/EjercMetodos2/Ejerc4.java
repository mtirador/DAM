package EjercMetodos2;

import java.util.Scanner;

public class Ejerc4 {

	public static void main(String[] args) {
		
/*Crear un programa que permita introducir números hasta que se introduzca
un dato no numérico. Por cada número introducido deberá mostrarse por
pantalla si es par o impar (el cálculo se realizará mediante un método).*/
		
		String dato= " ";
		Scanner ent = new Scanner(System.in);	
		System.out.println("Introduce un numero ");
		dato = ent.nextLine();
		
		boolean datoNumerico =true;
		
		
		do {
			System.out.println("Introduce un numero ");
			dato = ent.nextLine();
			
			datoNumerico = validar(dato);
			if(datoNumerico && (Integer.parseInt(dato))%2==0){
				System.out.println("Es par");
			}else if(datoNumerico && (Integer.parseInt(dato)%2 !=0)) {
				System.out.println("Es impar");
				
			}
					
			
			
		}while(datoNumerico);
		
		
		

		

	}
	
	public static boolean validar(String cadena) {
		
		boolean res=true;
		for(int i=0;i<cadena.length();i++) {
			
			
			if(!Character.isDigit(cadena.charAt(i))) {
				res= false;
			}
			
			
		}
			
			
		
			return res;
	}

}
