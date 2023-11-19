package Arrays;

import java.util.Scanner;

public class EjercicioLista {

	public static void main(String[] args) {
		
		/*Introducir por teclado el nombre. si existe mostrar la posición, si no mostrar "no existe*/
	
		String[]alumnos = {"Irene", "German","Andres","Javier"};
		boolean encontrado=false;
		String nombreBuscar="", salida= "no existe en la lista";
		
		Scanner ent=new Scanner(System.in);
		System.out.println("Introduce el nombre de un alumno: ");
		nombreBuscar=ent.nextLine();
		
		for(int i=0; i<alumnos.length;i++) {
			
		/*	if(nombreBuscar.equalsIgnoreCase(alumnos[i])) {
				System.out.println(alumnos[i] +" Existe en la posicion "+ i);
				break;
			}else if(i==alumnos.length-1){
				
			}
			*/
			
			if(nombreBuscar.equalsIgnoreCase(alumnos[i])) {
				System.out.println(alumnos[i]+ " Existe en la posicion " + i);
				encontrado=true;
				salida=alumnos[i]+" encontrado en la posición "+ i;
				break;
				
				
			}
			
			
		}//fin for
		
		System.out.println(salida);

	}//fin main

}
