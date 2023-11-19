package Tarea;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		GestionAlquileres gestion = new GestionAlquileres();

		int opcion;
		int opcion2;

		do {
			System.out
					.println("||----- AUTOMÓVILES POCHOLO S.A -----||" + "\n" + "1. Gestión de vehículos de la empresa"
							+ "\n" + "2. Realizar reserva" + "\n" + "3. Devolver un vehículo" + "\n"
							+ "4. Salir de la aplicación" + "\n" + "Seleccione una opción: ");
			try {
				opcion = Integer.parseInt(ent.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Error: ingrese un número");
				opcion = 0;// para que el programa siga funcionado
			}
			switch (opcion) {
			case 1:

				do {
					System.out.println("||---- GESTIÓN DE VEHÍCULOS DE LA EMPRESA ----||" + "\n"
							+ "1. Añadir un vehículo" + "\n" + "2. Listar vehículos" + "\n" + "3. Buscar un vehículo"
							+ "\n" + "4. Actualizar un vehículo" + "\n" + "5. Eliminar un vehículo" + "\n"
							+ "6. Volver al menú principal" + "\n" + "Elija una opción: ");
					try {
						opcion2 = Integer.parseInt(ent.nextLine());
					} catch (NumberFormatException ex) {
						System.out.println("Error: ingrese un número");
						opcion2 = 0; // aqui tambien pongo un valor para que el programa siga funcionando
					}
					switch (opcion2) {
					case 1:
						addAutomovil(gestion);
						break;
					case 2:
						listarAutomoviles(gestion);
						break;
					case 3:
						buscarAutomovil(ent, gestion);
						break;
					case 4:
						actualizarAutomovil(ent, gestion);
						break;
					case 5:
						eliminarAutomovil(ent, gestion);
						break;
					case 6: // aquí vuelvo al menu principal
						break;
					default:
						System.out.println("La opción seleccionada no existe");
						break;
					}// menu2

				} while (opcion2 != 6);
				break;
			case 2:
				reservarAutomovil(ent, gestion);
				break;
			case 3:
				devolverAutomovil(ent, gestion);
				break;
			case 4:
				System.out.println("Hasta Pronto.");
				break;
			default:
				System.out.println("La opción seleccionada no existe");
				break;
			}
		} while (opcion != 4);

	}// fin main

	public static void devolverAutomovil(Scanner ent, GestionAlquileres gestion) {
		String dni;
		String matricula;
		boolean matriculaOk;
		boolean dniOk;

		dniOk = false;
		System.out.println("Ingrese su Dni para comprobar sus Datos");
		dni = ent.nextLine();
		while (!dniOk) {
			if (Reservas.validarDni(dni)) {
				dniOk = true;
			} else {
				System.out.println("el dni no está ingresado correctamente, Ingreselo otra vez: ");
				dni = ent.nextLine();
			}
		}

		matriculaOk = false;
		System.out.println("Introduce la matricla del vehiculo");
		matricula = ent.nextLine();
		while (!matriculaOk) {
			if (Vehiculos.comprobarMatricula(matricula)) {
				if (!gestion.existeVehiculo(matricula)) {
					System.out.println(
							"No existe un vehiculo con la matricula" + matricula + ". Ingrese otra matricula: ");
					matricula = ent.nextLine();
				} else {
					if (gestion.comprobarAlquiler(matricula)) {
						matriculaOk = true;
					} else {
						System.out.println("Esta persona no tiene una reserva para este vehiculo.");
					}
				}
			} else {
				System.out.println("No valida. Ingrese la matricula otra vez: ");
				matricula = ent.nextLine();
			}
		}
		gestion.devolverVehiculo(dni, matricula);
		System.out.println("Vehículo devuelto correctamente.");
	}

	// lreservar sin terminar
	public static void reservarAutomovil(Scanner ent, GestionAlquileres gestion) {
		String dni;
		String matricula;
		boolean dniOk;
		boolean matriculaOk;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime fechaHora = null;

		// lista de los vehiculos que tengo
		System.out.println("Lista de los vehiculos de la BBDD");
		System.out.println(gestion.listaCoche.toString());

		dniOk = false;
		System.out.println("Ingrese su Dni para comprobar sus Datos");
		dni = ent.nextLine();
		while (!dniOk) {
			if (Reservas.validarDni(dni)) {
				dniOk = true;
			} else {
				System.out.println("el dni no está ingresado correctamente, Ingreselo otra vez: ");
				dni = ent.nextLine();
			}
		}

		matriculaOk = false;
		System.out.println("Introduce la matricula del vehiculo");
		matricula = ent.nextLine();
		while (!matriculaOk) {
			// Comprobamos que el formato de la matricula sea correcto
			if (Vehiculos.comprobarMatricula(matricula)) {
				// comprobamos si existe un vehiculo con esa matricula
				if (gestion.existeVehiculo(matricula)) {
					// Comprobamos si hay una reserva para el dni y la matricula, si existe volvemos
					// al menu
					if (gestion.comprobarPersonaCoche(dni, matricula)) {
						System.out.println("La persona con dni " + dni
								+ " ya tiene una reserva para el vehiculo con matricula " + matricula + ".");
						return;
					} else {
						matriculaOk = true;
					}
				} else {
					System.out.println(
							"No existe un vehiculo con la matricula" + matricula + ". Ingrese otra matricula: ");
					matricula = ent.nextLine();
				}
			} else {
				System.out.println("No valida. Ingrese la matricula otra vez: ");
				matricula = ent.nextLine();
			}
		}

		boolean fechaValida = false;
		while (!fechaValida) {
			try {
				System.out.println("fecha y hora de la reserva formato [dd-mm-yyyy hh:mm]");
				fechaHora = LocalDateTime.parse(ent.nextLine(), df);
				fechaValida = true;
			} catch (DateTimeParseException ex) {
				System.out.println("Error,  Introduzca la fecha y hora en el formato [dd-mm-yyyy hh:mm]");
			}
		}

		gestion.reservarVehiculo(dni, matricula, fechaHora);
	}

	public static void eliminarAutomovil(Scanner ent, GestionAlquileres gestion) {
		String deleteMatricula;
		System.out.println("Para eliminar un vehiculo, introduzca la matricula: ");
		deleteMatricula = ent.nextLine();

		gestion.eliminarVehiculo(deleteMatricula);
		System.out.println("vehiculo eliminado correctamente.");

	}

	// añadir vehiculos
	public static void addAutomovil(GestionAlquileres gestion) {

		Scanner ent = new Scanner(System.in);
		String matricula;
		int plazas = 0;
		char combustible;
		double precioDia = 0;
		boolean alquilado = false;
		boolean matriculaOk, plazaOk, combustibleOk, precioDiaOk;

		System.out.print("Ingrese la matrícula del vehículo: ");
		matricula = ent.nextLine();

		matriculaOk = false;
		while (!matriculaOk) {
			if (Vehiculos.comprobarMatricula(matricula)) {
				matriculaOk = true;
			} else {
				System.out.print("La matrícula ingresada no es válida. Por favor, ingrese otra: ");
				matricula = ent.nextLine();
			}
		}

		boolean repetir = true;// para qe se repita el try catch
		do {
			System.out.println("Numero de plazas: ");
			try {
				plazas = Integer.parseInt(ent.nextLine());
				plazaOk = false;

				while (!plazaOk) {
					if (Vehiculos.comprobarPlazas(plazas)) {
						plazaOk = true;
						repetir = false;
					} else {
						System.out.println("No existe esa plaza, Ingrese una plaza 1-9 inclusive");
						plazas = Integer.parseInt(ent.nextLine());
					}
				}
			} catch (NumberFormatException ex) {
				System.out.println("Error, has introducido un caracter diferente, introduzcalo de nuevo:");
			}
		} while (repetir);

		combustibleOk = false;
		System.out.println("Introduce el tipo de combustible [D,G,E,H]: ");
		combustible = ent.next().toUpperCase().charAt(0);
		ent.nextLine(); // si no lo pongo no entra
		while (!combustibleOk) {
			if (Vehiculos.validarCombustible(combustible)) {
				combustibleOk = true;
			} else {
				System.out.println("Todavia no se ha inventado ese combustible. Ingrese [D,G,E,H]");
				combustible = ent.next().toUpperCase().charAt(0);
				ent.nextLine(); // si no lo pongo no entra
			}
		}

		// aqui hay que hacer un trycatch
		do {
			precioDiaOk = false;
			while (!precioDiaOk) {
				try {
					System.out.println("Precio/dia del vehiculo: ");
					precioDia = Double.parseDouble(ent.nextLine());
					precioDiaOk = true;
					repetir = false;
				} catch (NumberFormatException ex) {
					System.out.println("el valor ingresado no es un numero");
				}
			}
		} while (repetir);

		boolean alquiladoOk = false;
		do {
			try {
				System.out.println("Alquilado: [true/false]");
				alquilado = ent.nextBoolean();
				alquiladoOk = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error,tiene que ingresar true o false");
				ent.nextLine(); // consume la entrada inválida del usuario
			}
		} while (!alquiladoOk);

		Vehiculos nuevo = new Vehiculos(matricula, plazas, combustible, precioDia, alquilado);
		gestion.addVehiculo(nuevo);

	}

	// listar vehiculos
	public static void listarAutomoviles(GestionAlquileres gestion) {
		for (Vehiculos coche : gestion.getListaCoches()) {
			System.out.println(coche);

		}
	}

	// buscar coche por la matricula
	public static void buscarAutomovil(Scanner ent, GestionAlquileres gestion) {
		boolean matriculaOk = false;
		String buscarMatricula;

		System.out.println("Ingrese la matricula del vehiculo:");
		buscarMatricula = ent.nextLine();
		while (!matriculaOk) {
			if (Vehiculos.comprobarMatricula(buscarMatricula)) {
				matriculaOk = true;
			} else {
				System.out.print("La matrícula ingresada no es válida. Por favor, ingrese otra: ");
				buscarMatricula = ent.nextLine();
			}
		} // fin while

		Vehiculos encontrado = gestion.buscarVehiculo(buscarMatricula);
		if (encontrado != null) {
			System.out.println("Tenemos el vehiculo: ");
			System.out.println(encontrado.toString());
		} else {
			System.out.println("No se encontro dicho vehiculo, compruebe bien la matricula.");
		}

	}

	public static void actualizarAutomovil(Scanner ent, GestionAlquileres gestion) {
		String matriculaActualizar;
		boolean matriculaOk = false;
		boolean matriculaOk1 = false;
		boolean plazasOk = false;
		boolean combustibleOk = false;

		System.out.println("Introduzca la matrícula del vehículo a actualizar: ");
		matriculaActualizar = ent.nextLine();
		while (!matriculaOk) {
			if (Vehiculos.comprobarMatricula(matriculaActualizar)) {
				matriculaOk = true;
			} else {
				System.out.println("Vuelve a introducir correctamente la matricula");
				matriculaActualizar = ent.nextLine();
			}
		}
		Vehiculos vehiculoActualizar = gestion.buscarVehiculo(matriculaActualizar);
		if (vehiculoActualizar != null) {
			System.out.println("Detalles del vehículo a actualizar: ");
			System.out.println(vehiculoActualizar);
			System.out.println("Introduzca los nuevos valores del vehículo: ");

			System.out.print("Matrícula: ");
			String nuevaMatricula = ent.nextLine();
			while (!matriculaOk1) {
				if (Vehiculos.comprobarMatricula(nuevaMatricula)) {
					matriculaOk1 = true;
				} else {
					System.out.println("Vuelve a introducir correctamente la matricula");
					nuevaMatricula = ent.nextLine();
				}
			}

			boolean repetir = true;
			int nuevasPlazas = 0;
			do {
				System.out.print("Número de plazas: ");
				try {
					nuevasPlazas = Integer.parseInt(ent.nextLine());
					plazasOk = false;
					while (!plazasOk) {
						if (Vehiculos.comprobarPlazas(nuevasPlazas)) {
							plazasOk = true;
							repetir = false;
						} else {
							System.out.println(
									"Las plazas disponibles son del 1-9 inclusives, ingrese la plaza entre ese intervalo");
							nuevasPlazas = Integer.parseInt(ent.nextLine());
						}
					}
				} catch (NumberFormatException ex) {
					System.out.println("Error, ingrese un valor numérico");
				}
			} while (repetir);

			System.out.print("Tipo de combustible [D, G, E, H]: ");
			char nuevoCombustible = ent.next().toUpperCase().charAt(0);
			ent.nextLine();// para que entre el scanner
			while (!combustibleOk) {
				if (Vehiculos.validarCombustible(nuevoCombustible)) {
					combustibleOk = true;
				} else {
					System.out.println("Ese combustible no existe, pruebe a ingresar [D],[G],[E],[H]");
					nuevoCombustible = ent.next().toUpperCase().charAt(0);
					ent.nextLine();// para que entre el scanner
				}

			}

			double nuevoPrecioDia = 0.0;
			boolean repetirPrecio = true;
			do {
				try {
					System.out.print("Precio por día: ");
					nuevoPrecioDia = Double.parseDouble(ent.nextLine());
					repetirPrecio = false;
				} catch (NumberFormatException ex) {
					System.out.println("Error, ingrese un valor numerico");
				}
			} while (repetirPrecio);

			boolean nuevoAlquilado = false;
			boolean repetirAlquilado = true;
			do {
				try {
					System.out.print("Estado de alquiler [true/false]: ");
					nuevoAlquilado = ent.nextBoolean();
					ent.nextLine();
					repetirAlquilado = false;
				} catch (InputMismatchException ex) {
					System.out.println("Error, tiene que ingresar true o false");
					ent.nextLine();
				}
			} while (repetirAlquilado);

			vehiculoActualizar.setMatricula(nuevaMatricula);
			vehiculoActualizar.setPlazas(nuevasPlazas);
			vehiculoActualizar.setCombustible(nuevoCombustible);
			vehiculoActualizar.setPrecioDia(nuevoPrecioDia);
			vehiculoActualizar.setAlquilado(nuevoAlquilado);
			System.out.println("Vehículo actualizado correctamente.");
		} else {
			System.out.println("No se encontró ningún vehículo con la matrícula " + matriculaActualizar);
		}

	}// fin actualizar

} // fin class
