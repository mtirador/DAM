package aves;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Taquillas {

	public static void main(String[] args) {

		ArrayList<Reservas> lista = new ArrayList<Reservas>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int opcion = 0;

		lista.add(new Aves_Rapaces(6, 2, 180, 3.5, true, 4, 3));
		lista.add(new Aves_Exoticas(12, 3, 240, 5.2, true, 6, "Loro"));
		lista.add(new Mar(20, 2, 90, 1.5, false, "Delfin"));

		leerFichero(lista, br);

		do {
			System.out.println("Introduce la opcion deseada: \n" + "1) Aniadir reserva\n" + "2) Eliminar reserva\n"
					+ "3) Ver reservas\n" + "0) Salir");

			try {
				opcion = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Error");
				opcion = 100;
			}

			switch (opcion) {
			case 1 -> addReserva(lista, br);
			case 2 -> deleteReserva(lista, br);
			case 3 -> listarReservas(lista, br);
			case 0 -> System.out.println("Has salido");
			default -> System.out.println("Opcion no valida");
			}

		} while (opcion != 0);

		escribirFichero(lista);
	}
	
	public static void listarReservas(ArrayList<Reservas> lista, BufferedReader br) {
		for(Reservas r : lista) {
			System.out.println(r.toString());
		}
	}
	
	private static void leerFichero(ArrayList<Reservas> lista, BufferedReader br) {

		String[] linea = null;

		try {
			br = new BufferedReader(new FileReader("Reservas.csv"));
			while (br.ready()) {
				linea = br.readLine().split(";");

				if (linea[0].equalsIgnoreCase("AR")) {
					lista.add(new Aves_Rapaces(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
							Double.parseDouble(linea[3]), Double.parseDouble(linea[4]), Boolean.parseBoolean(linea[5]),
							Integer.parseInt(linea[6]), Integer.parseInt(linea[7])));
					
				} else if (linea[0].equalsIgnoreCase("AE")) {
					lista.add(new Aves_Exoticas(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
							Double.parseDouble(linea[3]), Double.parseDouble(linea[4]), Boolean.parseBoolean(linea[5]),
							Integer.parseInt(linea[6]), linea[7]));

				} else if (linea[0].equalsIgnoreCase("M")) {
					lista.add(new Mar(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
							Double.parseDouble(linea[3]), Double.parseDouble(linea[4]), Boolean.parseBoolean(linea[5]),
							linea[6]));
				}

			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cuidado, no existe el fichero");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}

	}
	
	
	private static void escribirFichero(ArrayList<Reservas> lista) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Reservas.csv"));

			for (Reservas r : lista) {
				bw.write(r.toFichero());
				bw.newLine();
			}

			bw.close();
		} catch (IOException e) {
			System.out.println("No existe el fichero");
		}
	}

	public static void addReserva(ArrayList<Reservas> lista, BufferedReader br) {
		String[] datos = new String[10];
		boolean run = true;

		while (run) {
			System.out.println("Introduce el numero de entradas: ");
			try {
				datos[0] = br.readLine();
				run = false;
			} catch (IOException e) {
				System.out.println("Error - Entradas");
			}
		}

		run = true;
		while (run) {
			System.out.println("Introduce el numero de guias: ");
			try {
				datos[1] = br.readLine();
			} catch (IOException e) {
				System.out.println("Error - Guias");

			}
		}
		
		run = true;
		while (run) {
			System.out.println("Introduce la duracion: ");
			try {
				datos[2] = br.readLine();
			} catch (IOException e) {
				System.out.println("Error - Duracion");

			}
		}
		
		run = true;
		while (run) {
			System.out.println("Introduce el recorrido (km)");
			try {
				datos[3] = br.readLine();
			} catch (IOException e) {
				System.out.println("Error - Recorrido");

			}
		}

		run = true;
		while (run) {
			System.out.println("Tiene espectaculos: ");

			try {
				datos[1] = br.readLine().toLowerCase();
				run= !(datos[1].charAt(0)=='s'||datos[1].charAt(0)=='n');
			} catch (IOException e) {
				System.out.println("Error - Espectaculos S/N");
			}
		}
		
		run = true;
		while (run) {
			System.out.println("Introduce el numero de guias: ");
			try {
				datos[5] = br.readLine();
			} catch (IOException e) {
				System.out.println("Error - Guias");

			}
		}
		
		
	}

	public static void deleteReserva(ArrayList<Reservas> lista, BufferedReader br) {

		System.out.println("Introduzca el ID de la reserva");
		int id = 0;

		try {
			id = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Error - Introduzca un numero por favor");
		} catch (IOException e) {
			System.out.println("Error E/S");
		}

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
				System.out.println("Reserva eliminada correctamente.");
			}
		}
	}

	

}
