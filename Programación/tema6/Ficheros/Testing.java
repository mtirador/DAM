package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//leer teoria y practicar 17/04/2023
public class Testing {
	public static void main(String[] args) {

		String fichero = "C:\\Users\\buffy\\OneDrive\\Escritorio\\LoremIpsum.txt";
		int linea = 1;
		BufferedReader br = null;
		FileReader file=null;

		try {
			file = new FileReader(fichero);
			br = new BufferedReader(file);

			if (!br.ready()) {
				throw new Exception();

			}

			while (br.ready()) {

				System.out.println(" Número línea " + linea + ":" + br.readLine());
				linea++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");

		} catch (IOException e) {
			System.out.println("Error al leer el fichero");

		} catch (Exception e) {
			System.out.println("Fichero vacio");
		} finally {
			try {
				br.close();
			} catch (IOException ex) {
				System.out.println("Error entrada/ salida");
			}
		}

	}
}
