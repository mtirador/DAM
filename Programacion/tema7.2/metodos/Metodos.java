package metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Metodos {

	public static void main(String[] args) {

		leerFichero();

		escribirFichero();
		
	}

	public static void escribirFichero() {
		String fileName = "ruta_del_fichero"; // Reemplaza "ruta_del_fichero" con la ruta y nombre real de tu fichero

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write("Hola, esto es un ejemplo de escritura en un fichero.");
			bw.newLine(); // Añade una nueva línea
			bw.write("¡Espero que te sea útil!");

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leerFichero() {
		String fileName = "ruta_del_fichero"; // Reemplaza "ruta_del_fichero" con la ruta real de tu fichero

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
