package Tarea;

import java.util.Scanner;

public class PrincipalNo {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		GestionAlquileres gestion=new GestionAlquileres();
		
		
	do {
		System.out.println("MENU DE OPCIONES: " + "\n" + "1. Añadir vehiculo" + "\n" + "2. Listar Vehiculos" + "\n"
				+ "3. Buscar Vehiculo" + "\n" + "4. Actualizar vehiculo" + "\n" + "5. Eliminar vehiculo"+ "\n"+ "0. Salir");
		
		opcion=Integer.parseInt(ent.nextLine());
		
		switch(opcion) {
		
		case 1: 
			addVehiculo(gestion);
			break;
		case 2: 
			System.out.println(gestion.listaCoche.toString());
			break;
		case 3:
			
			break;
		case 4: 
			
			break;
		case 5: 
			
			break;
		case 0:
			System.out.println("Hasta Pronto");
			break;
		default: 
			System.out.println("Opcion no valida"); 
		break;
		
		}//fin switch
		
		
	 }while (opcion!=0);

	}

	public static void addVehiculo(GestionAlquileres gestion) {
		Vehiculos coche1=new Vehiculos("123456b",4,'D',20.5,false);
		gestion.addVehiculo(coche1);
	}

}
