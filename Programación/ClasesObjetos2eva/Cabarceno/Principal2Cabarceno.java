package Cabarceno;

import java.util.Arrays;
import java.util.Scanner;

public class Principal2Cabarceno {

	public static void main(String[] args) {
		
	//mediante teclado opcion 1
		
	/*	Scanner ent=new Scanner(System.in);
		int id=0;
		String especie="";
		String comida="";
		double kg=0.0;
		
		
		Cabarceno nuevo=new Cabarceno(id,especie,null,comida,kg);
		
		System.out.println("Introdce el id");
		id=ent.nextInt();*/
		
		
		Scanner ent=new Scanner(System.in);
		Cabarceno nuevo = new Cabarceno();
		
		System.out.println("Introduce el Id");
		nuevo.setIdAnimal(Integer.parseInt(ent.nextLine()));
		
		System.out.println("Introduce una especie");
		nuevo.setEspecie(ent.nextLine());
		
		System.out.println("Escoge un habitat: " + Arrays.toString(Habitats.values()));
		nuevo.setHabitat(Habitats.valueOf(ent.nextLine().toUpperCase()));
		
		if(nuevo.getHabitat()== Habitats.TIERRA) {
			System.out.println("verdadero");
		}else {
			System.out.println("falso");
		}
		
		
		System.out.println("Introduce el tipo de comida");
		nuevo.setComida(ent.nextLine());
		//clases envolventes
		System.out.println("Introduce los kg de comida");
		nuevo.setKilogramos(Double.parseDouble(ent.nextLine()));

	}

}
