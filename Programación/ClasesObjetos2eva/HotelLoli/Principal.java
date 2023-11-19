package HotelLoli;

import java.util.Scanner;

public class Principal {

	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		Hotel casaLoli = new Hotel();

		do {
			System.out.println("Men� del Hotel \n" +
					"1) Ver habitaciones\n" +
					"2) Reservar habitaci�n\n"+
					"3) Devolver habitaci�n\n" + 
					"0) Salir");
			
			opcion = ent.nextInt();
			
			switch(opcion) {
				case 1:
					casaLoli.mostrarHabitaciones();
					break;
					
				case 2:
					casaLoli.mostrarLibres();
					System.out.println("�Que habitaci�n va a reservar?");
					System.out.println(casaLoli.reservar(ent.nextInt()));					
					break;
					
				case 3:
					casaLoli.mostrarOcupadas();
					System.out.println("�Que habitaci�n va a devolver?");
					System.out.println(casaLoli.devolver(ent.nextInt()));					
					break;
					
				case 0:
					System.out.println("Adios");
					break;
					
				default: System.out.println("Opci�n no v�lida");
			}
		
		}while(opcion != 0);
		
	}
}
