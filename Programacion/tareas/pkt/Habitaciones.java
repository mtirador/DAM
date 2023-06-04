package pkt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Marta
 *
 */

public class Habitaciones {
	public static void main(String[]args) {
		
		Scanner ent=new Scanner(System.in);
		
		ArrayList<Hotel>lista=new ArrayList<Hotel>();
		
		lista.add(new Hotel(1,"Matrimonio","Ventana",false,30.00));
		lista.add(new Hotel(2,"Matrimonio","Ventana",false,30.00));
		lista.add(new Hotel(3,"Matrimonio","con Terraza",false,40.00));
		
		lista.add(new Hotel(4,"Individual","Ventana",false,20.00));
		lista.add(new Hotel(5,"Individual","Ventana",false,20.00));
		lista.add(new Hotel(6,"Individual","con Terraza",true,25.00));
		
		
		
		int opcion=0;
		
		do{
			  
			  System.out.println("BASE DE DATOS DEL HOTEL RACING:");
			  System.out.println("1. LISTA HABITACIONES");  
			  System.out.println("2. HACER RESERVA");
			  System.out.println("3. DEVOLVER HABITACION");
			  System.out.println("0. Salir");
			  opcion = Integer.parseInt(ent.nextLine());
			  
		  switch (opcion) {
		  
		  case 0: System.out.println("Hasta luego");break;
		   
		  case 1: listarHabitaciones(lista);break;
			  
		  case 2: reservarHabitacion(lista);break;
			  
		  case 3: devolverHabitacion(lista);break;
		  
		 
		  default: System.out.println("No hay Opciones con esa acción"); break;
		
		    
		  }
		  

	}while(opcion !=0);
		
		
	}//fin main

	public static void listarHabitaciones(ArrayList<Hotel> lista) {
		System.out.println("Habitaciones del Hotel");
		for(Hotel mostrar:lista) {
			System.out.println(mostrar);
			
		}
		
	}
	
	public static void reservarHabitacion(ArrayList<Hotel>lista) {  
		
		Scanner ent= new Scanner(System.in);
		int usuario=0;//respuesta usuario
		
		
		System.out.println("Habitaciones disponibles actualmente");
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).isReservada()==false) {
				System.out.println("La habitacion "+ (i+1)+" está libre");
			}else if(lista.get(i).isReservada()==true) {
				System.out.println("La habitacion "+ (i+1)+ "está ocupada");
			}
				
		}
		
	
		System.out.println("¿Qué habitación quiere reservar?");
		usuario=ent.nextInt();
		
		if(usuario>0 && usuario <=lista.size()) {
			Hotel hab = lista.get(usuario-1);
			if(!hab.isReservada()) {
				hab.setReservada(true);
				System.out.println("Reservaste la habitación "+ usuario+ " precio: "+ hab.getPrecio());
			}else {
				System.out.println("habitación ocupada");
			}
		}else {
			System.out.println("has elegido una habitación que no existe.");
		}
			
		
	}

	public static void devolverHabitacion(ArrayList<Hotel>lista) {
		Scanner ent=new Scanner(System.in);
		int usuario=0;
		
		
		//primero saber qué habitación está ocupada.
		System.out.println("Habitaciones NO DISPONIBLES");
		//recorrer la lista para ver las habitaciones que no estan disponibles osea lo de arriba pero con true
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).isReservada()==true) {
				System.out.println("Habitación "+ (i+1)+ "no está disponible");
			}
		}
		System.out.println("¿Qué habitación quieres devolver?");
		usuario=ent.nextInt();
		
		if(usuario>0 && usuario <=lista.size() &&lista.get(usuario-1).isReservada()==true) {
			Hotel hab=lista.get(usuario-1);
			hab.setReservada(false);
			

			
			//lo que voy a pagar
			
			int dias=(int)(Math.random()*5)+1;
			double total=dias* hab.getPrecio();
			System.out.println("Total que tiene que pagar: "+total+ "euros"+"||"+"días de estancia"+ dias);
			
			
		}else {
			System.out.println("La habitación no está ocupada o no está disponible");
		}
		
		
		
			
		}
		
	
	
	
	
	
	
	
	
	
}//fin class
