package Tarea;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestionAlquileres {

	ArrayList<Vehiculos> listaCoche = new ArrayList<Vehiculos>();
	ArrayList<Reservas> listaReserva = new ArrayList<Reservas>();

	// añado un objeto de la clase Vehiculos a la listaCoche.
	public void addVehiculo(Vehiculos car) {
		this.listaCoche.add(car);

	}

	// listar los automoviles
	public ArrayList<Vehiculos> getListaCoches() {
		return this.listaCoche;
	}

	// busco un vehiculo en listaCoche, el parametro sera la matricula.
	public Vehiculos buscarVehiculo(String matricula) {
		// hago un foreach para recorrer la listaCoche y luego voy comparando
		for (Vehiculos coche : listaCoche) {
			if (coche.getMatricula().equals(matricula)) {
				return coche;
			}

		}
		return null;
	}

	public Reservas buscarReserva(String dni, String matricula) {
		Vehiculos coche = buscarVehiculo(matricula);

		// hago un foreach para recorrer la listaReserva y luego voy comparando
		for (Reservas r : listaReserva) {
			if (r.getDni().equals(dni) && r.getVehiculo().equals(coche)) {
				return r;
			}
		}
		return null;
	}

	public Boolean existeVehiculo(String matricula) {
		Boolean existe = false;
		// hago un foreach para recorrer la listaCoche y luego voy comparando
		for (Vehiculos coche : listaCoche) {
			if (coche.getMatricula().equals(matricula)) {
				return true;
			}

		}
		return existe;
	}

	// eliminar
	public void eliminarVehiculo(String matricula) {
		Vehiculos cocheDelete = buscarVehiculo(matricula); // reutilizo el metodo buscar
		if (cocheDelete != null) {
			listaCoche.remove(cocheDelete);
			System.out.println("Se ha eliminado el vehiculo");
		} else {
			System.out.println("La matricula no existe en nuestra Base de Datos.");
		}
	}

	// actualizar

	public boolean modificarVehiculo(String matricula, int plazas, char combustible, double precioDia) {
		Vehiculos coche = buscarVehiculo(matricula);

		if (coche != null) {
			coche.setMatricula(matricula);
			coche.setPlazas(plazas);
			coche.setCombustible(combustible);
			coche.setPrecioDia(precioDia);
			return true;

		} else {
			System.out.println("No se encontró el vehiculo");
			return false;
		}

	}
	// reservar

	public void reservarVehiculo(String dni, String matricula, LocalDateTime fechaHora) {

		Vehiculos coche = buscarVehiculo(matricula);
		if (coche != null) {
			// Verificamos si el vehículo está disponible
			if (coche.isAlquilado()) {
				System.out.println("El vehículo ya está alquilado. No se puede reservar.");
			} else {
				// Creamos la reserva y la agregamos a la lista de reservas
				Reservas reserva = new Reservas(dni, coche, fechaHora);
				listaReserva.add(reserva);
				coche.setAlquilado(true);
				System.out.println("Reserva realizada con éxito.");
			}
		} else {
			System.out.println("La matrícula no existe en nuestra base de datos.");
		}
	}

	public boolean comprobarPersonaCoche(String dni, String matricula) {
		// comprobamos si la la persona tiene una reserva para ese coche
		Boolean resultado = false;

		// Buscamos el coche
		Vehiculos coche = buscarVehiculo(matricula);

		// recorremos la lista de reservas y comprobamos si hay una reserva con el dni y
		// la matricula
		for (Reservas r : listaReserva) {
			if (r.getDni().equals(dni) && r.getVehiculo().equals(coche)) {
				return true;
			}
		}

		return resultado;
	}

	public boolean comprobarAlquiler(String matricula) {
		// Buscamos el coche y comprobamos si el coche esta alquilado
		Vehiculos coche = buscarVehiculo(matricula);
		return coche.isAlquilado();
	}

	public void devolverVehiculo(String dni, String matricula) {
		// Buscamos el coche y lo seteamos a alquilado = false
		Vehiculos coche = buscarVehiculo(matricula);
		coche.setAlquilado(false);

		// Buscamos la reserva para este dni y matricula y la borramos del listado de
		// reservas
		Reservas r = buscarReserva(dni, matricula);
		listaReserva.remove(r);
	}

}// fin class
