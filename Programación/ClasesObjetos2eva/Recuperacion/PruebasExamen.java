package Recuperacion;

import java.util.ArrayList;

public class PruebasExamen {

	public static void main(String[] args) {

		
		ArrayList<Videoclub>lista=new ArrayList<Videoclub>();
		
		
		lista.add(new Videoclub(1,"Star Wars","Fant�stico",100));
		lista.add(new Videoclub(2,"Willow","Fant�stico",0));
		lista.add(new Videoclub(3,"Harry Potter","Fant�stico",10));
		lista.add(new Videoclub(4,"Rambo","Acci�n",17));
		lista.add(new Videoclub(5,"Bambi","Dibujos",22));
		
		listarHabitaciones(lista);

	}//fin main
	
	//
		public static void listarHabitaciones (ArrayList<Videoclub>lista) {
			for(Videoclub peli:lista) {
				System.out.println(peli);
		}
	}

}

