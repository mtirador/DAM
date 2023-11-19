package HotelLoli;

import java.util.ArrayList;

public class Hotel {
	
	ArrayList<Habitaciones> lista ;
	
	
	public Hotel() {
		
		lista = new ArrayList<Habitaciones>();
		lista.add(new Habitaciones(101,"matrimonio", true, 40.0f,true));
		lista.add(new Habitaciones(102,"matrimonio", false, 30.0f,true));
		lista.add(new Habitaciones(103,"matrimonio", false, 30.0f,true));
		lista.add(new Habitaciones(104,"individuales", true, 25.0f,true));
		lista.add(new Habitaciones(105,"individuales", false, 20.0f,true));
		lista.add(new Habitaciones(106,"individuales", false, 20.0f,true));
		
	}
	
	public void mostrarHabitaciones() {
		for(Habitaciones hab : lista) {
			System.out.println(hab);
		}
	}
	
	public void mostrarLibres() {
		for(Habitaciones hab : lista) {
			if(hab.isLibre()){
				System.out.println(hab);							
			}
		}
	}
	
	public void mostrarOcupadas() {
		for(Habitaciones hab : lista) {
			if(!hab.isLibre()){
				System.out.println(hab);							
			}
		}
	}
	
	public String devolver(int habElegida) {
		String mensaje="";
		if(!lista.get(habElegida - 101).isLibre()) {
			mensaje=lista.get(habElegida - 101).liberar();
		}else {
			mensaje="Habitación no ocupada";
		}
		return mensaje;

	}
	
	public String reservar(int habElegida) {
		String mensaje="";
		if(lista.get(habElegida - 101).isLibre()) {
			mensaje=lista.get(habElegida - 101).reservar();
		}else {
			mensaje="Habitación no disponible";
		}
		return mensaje;
	}

}
