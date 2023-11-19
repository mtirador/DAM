package StarWars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Parking {

	public static void main(String[] args) {

		// Variables y objetos
		Map<String, Naves> misNaves = new HashMap<>();
		int opcion = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 leerFichero(misNaves);

		do {
			System.out.println("Intoduzca la opcion deseada: \n" + "1º) Añadir nave \n " + "2º) Eliminar nave \n "
					+ "3º)Ver naves \n " + "0) Salir ");

			try {
				opcion = Integer.parseInt(br.readLine());
				switch (opcion) {
				case 1 -> addNave(misNaves, br);
				case 2 -> delNave(misNaves);
				case 3 -> showNaves(misNaves);
				case 0 -> System.out.println("Adios");
				default -> System.out.println("Opcion no contemplada");
				}

			} catch (NumberFormatException e) {
				System.out.println("Opcion no valida");
			} catch (IOException e) {

			}

		} while (opcion != 0);
		try {
			escribirFichero(misNaves);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	public static void escribirFichero(Map<String, Naves> naves) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("parking.csv"));
		
		for(String clave: naves.keySet()) {
			bw.write(naves.get(clave).toFichero());
			bw.newLine();
			
		}
		bw.close();
	}

	public static void leerFichero(Map<String, Naves> naves) {
		BufferedReader br = null;
		String[] linea = null;

		try {
			br = new BufferedReader(new FileReader("parking.csv"));
			while (br.ready()) {
				linea = br.readLine().split(";");
				if (linea[0].equalsIgnoreCase("w")) {
					naves.put(linea[1], new Wing(linea[1], Boolean.parseBoolean(linea[2]), Integer.parseInt(linea[3])));
				} else if (linea[0].equalsIgnoreCase("t")) {
					naves.put(linea[1], new Ties(linea[1], Boolean.parseBoolean(linea[2]), Float.parseFloat(linea[3])));
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("	Cuidado,no existe el fichero");
		} catch (IOException ex) {
			System.out.println("Error de E/S");
		}

	}

	public static void addNave(Map<String, Naves> misNaves, BufferedReader br) throws IOException {

		// array para manejar los datos y luego parseandole
		String[] datos = new String[3];
		boolean run = true;
		while (run) {
			System.out.println("Introduce matricula: ");
			try {
				datos[0] = br.readLine();
				run = false;
			} catch (IOException ex) {
				System.out.println("Error al introducir la matricula");
			}
		} // fin while

		run = true;
		while (run) {
			System.out.println("Pertenece al  imperio o no: ");
			try {
				datos[1] = br.readLine().toLowerCase();
				run = !(datos[1].charAt(0) == 's' || datos[1].charAt(0) == 'n');
			} catch (IOException ex) {
				System.out.println("Error al decir si pertenece al imperio o no");
			}
		} // fin while

		run = true;
		while (run) {
			System.out.println("Que tipo de nave es(Wing o Tie) ");
			try {
				switch (br.readLine().toLowerCase().charAt(0)) {
				case 'w':
					System.out.println("¿cuantos motores tiene?");
					datos[2] = br.readLine();

					break;
				case 't':
					System.out.println("¿Qué cilindrada tiene?");
					datos[2] = br.readLine();
					break;
				default:
					System.out.println("tipo de nave no contemplada");

				}

			} catch (IOException ex) {

			}

		} // fin while
	}

	public static void showNaves(Map<String, Naves> misNaves) {

		for (String clave : misNaves.keySet()) {
			System.out.println(misNaves.get(clave));

		}

	}// fin naves

	public static void delNave(Map<String, Naves> misNaves) {

		System.out.println("Indique la matricula de la nave a eliminar");
		showNaves(misNaves);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String matricula = "";

		try {
			matricula = br.readLine();
			if (misNaves.containsKey(matricula)) {
				misNaves.remove(matricula);
				System.out.println("Matricula eliminada");
			}

		} catch (IOException ex) {
			System.out.println("Error en la E/S");
		}

	}

}
