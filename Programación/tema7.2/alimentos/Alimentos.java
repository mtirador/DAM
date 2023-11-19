package alimentos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alimentos {
	public static void main(String[] args) {

		// lectura

		File fichero = new File("C:\\Users\\buffy\\OneDrive\\Escritorio\\alimentos.csv"); // o string
		BufferedReader br = null;
		BufferedWriter bw = null;
		String[] linea = null;
		String nombre = "", respuesta = "";
		int cantidad = 0;
		float precio = 0.0f;

		try {
			br = new BufferedReader(new InputStreamReader(System.in)); // escanner
			bw = new BufferedWriter(new FileWriter("misCompras"));
			System.out.println("¿que desea fruta o verdura?");
			respuesta = br.readLine();

			br = new BufferedReader(new FileReader(fichero));

			while (br.ready()) {
				//System.out.println(br.readLine());
//				linea = br.readLine().split(";");
//				nombre = linea[0];
//				cantidad = Integer.parseInt(linea[3]);
//				precio = Float.parseFloat(linea[4].replace(",", "."));
//
//				System.out.println(nombre + "te llevas: " + cantidad + "precio individual: " + precio + "a pagar: "
//						+ (cantidad * precio));

				linea = br.readLine().split(";");

				if (respuesta.equalsIgnoreCase(linea[1])) {
					bw.write(linea[0] + " has gastado "
							+ Integer.parseInt(linea[3]) * Float.parseFloat(linea[4].replace(",", ".")));
					bw.newLine();
				}

			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println();
		}

	}// fin main

}
