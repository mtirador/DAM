package pkt;
/**
 * @author Marta
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HabitacionesTester {
	
	public static void main(String[] args) {
	
		Scanner ent=new Scanner(System.in);
		
		ArrayList<Hotel>lista=new ArrayList<Hotel>();
		
		lista.add(new Hotel(1,"Matrimonio","Ventana",false,30.00));
		lista.add(new Hotel(2,"Matrimonio","Ventana",false,30.00));
		lista.add(new Hotel(3,"Matrimonio","con Terraza",true,40.00));
		
		lista.add(new Hotel(4,"Individual","Ventana",false,20.00));
		lista.add(new Hotel(5,"Individual","Ventana",false,20.00));
		lista.add(new Hotel(6,"Individual","con Terraza",true,25.00));
		
		
		
		int opcion=0;
		
		do{
			  System.out.println(" ");
			  System.out.println("BASE DE DATOS DEL HOTEL RACING:");
			  System.out.println("1. LISTA HABITACIONES");  
			  System.out.println("2. HACER RESERVA");
			  System.out.println("3. DEVOLVER HABITACIÓN");
			  System.out.println("0. Salir");
			  System.out.println(" ");
			  opcion = Integer.parseInt(ent.nextLine());
			  
		  switch (opcion) {
		  
		  case 0: System.out.println("Hasta luego");break;
		   
		  case 1: listarHabitaciones(lista);break;
			  
		  case 2: reservarHabitacion(lista);break;
			  
		  case 3: devolverHabitacion(lista);break;
		  
		 
		  default: System.out.println("No puedes romper el programa"); break;
		
		    
		  }
		  

	}while(opcion !=0);
		
		
	}//fin main

	public static void listarHabitaciones(ArrayList<Hotel> lista) {
		System.out.println("HABITACIONES DEL HOTEL");
		for(Hotel mostrar:lista) {
			System.out.println(mostrar);
			
		}
		
	}
	
	public static void reservarHabitacion(ArrayList<Hotel>lista) {  
		
		Scanner ent= new Scanner(System.in);
		int usuario=0;//respuesta usuario
		
		
		System.out.println("HABITACIONES DISPONIBLES:");
		for(Hotel hab:lista) {
			if(hab.isReservada()==false) {
				System.out.println("La habitación: "+ hab.getId()+" está disponible");
				
			}
			
		}
		
		System.out.println("¿Qué habitación quiere reservar?");
		usuario=ent.nextInt();
		
		for(Hotel hab:lista) {
			if(hab.getId()==usuario) {
				if(hab.isReservada()==false ) {
					hab.setReservada(true);
					System.out.println("Reservaste la habitación "+ usuario+ " precio: "+ hab.getPrecio());
					break;
				}else {
					System.out.println("Habitación"+hab.getId()+ "ocupada");
					break;
				}
				
			}else {
				System.out.println("Habitación"+hab.getId()+ "ocupada");
			}
		}				 
				 
				 
		}
	
	//aprovecho la lógica del método anterior, cambiando por false

	public static void devolverHabitacion(ArrayList<Hotel>lista) {
		Scanner ent=new Scanner(System.in);
		int usuario=0;
		
		System.out.println("HABITACIONES OCUPADAS");
		for(Hotel hab:lista) {
			if(hab.isReservada()==true) {
				System.out.println("La Habitación: "+ hab.getId()+" está ocupada");
				
				
			}else if(hab.isReservada()==false ){
				System.out.println("La Habitación: " + hab.getId()+ " no se puede devolver ");	
			}
			
		}
		
	
		System.out.println("¿Qué habitación quiere devolver?");
		usuario=ent.nextInt();
		int dias=(int)(Math.random()*5)+1;
		double total;
		
		for(Hotel hab:lista) {
			if(hab.getId()==usuario) {
				if(hab.isReservada()==true ) {
					hab.setReservada(false);
					total=dias*hab.getPrecio();
					System.out.println("Devolviste la habitación "+ usuario + " precio dia: "+ hab.getPrecio());
					System.out.println("Dias ocupada-->"+ dias+ "|| Cantidad a pagar: "+ total);
					System.out.println("");
					System.out.println("A soltar la panoja");
					break;
				}else if(hab.isReservada()==false) {
					System.out.println("La habitación "+ hab.getId() + " está libre.[No se puede devolver]");
					break;
				}
				
			}else {
				
			
			}
		}
		
		
		
		
		
		
		
		}//fin main
		
	
	
	
	
	
	
	
	
	
}//fin class
