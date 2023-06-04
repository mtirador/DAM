package Netflix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//		Peliculas p = new Peliculas("Aladin", "Dibujos", 1.5);
//		Series serie = new Series("Fargo", "Suspense", 4);
//		Libros libro = new Libros("1984", "Politica", "G.Orwell");
//
//		//añado a un arraylist todas las peliculas que he metido
//		ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
//		lista.add(serie);
//		lista.add(p);
//		lista.add(libro);
//
//		for (Multimedia m : lista) {
//			System.out.println(m);
//		}
//		// luego hacer los entrada por fichero y que se guarden
		BufferedWriter bw = null;
		BufferedReader br = null;
		ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
		String[] linea = null;

		// parte de lectura
		try {
			br = new BufferedReader(new FileReader("misArchivos.csv"));
			// una vez que esta creado el buffer para leer de forma secuencia se crea el
			// bucle while para leer la linea
			// si br esta listo paa leer ...de vuelve true
			while (br.ready()) {
				linea = br.readLine().split(";");
				try {
					// siempre linea de cero para que en este caso encuentre cada letra y lo separe
					if (linea[0].equalsIgnoreCase("P")) {
						lista.add(new Peliculas(linea[1], linea[2], Integer.parseInt(linea[3])));

					} else if (linea[0].equalsIgnoreCase("S")) {
						lista.add(new Series(linea[1], linea[2], Integer.parseInt(linea[3])));
					} else if (linea[0].equalsIgnoreCase("L")) {
						lista.add(new Libros(linea[1], linea[2], linea[3]));

					}

				} catch (NumberFormatException ex) {
					System.out.println("Error, dato no númerico" + linea[3] + " en" + linea[1]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		} catch (IOException e) {
			System.out.println("Error E/S");
		} catch (Exception e) {

		}

		for (Multimedia m : lista) {
			System.out.println(m);
		}

		lista.add(new Peliculas("MiPelicula", "Miedo", 120));
		lista.add(new Series("MiSerie", "Humor", 3));
		lista.add(new Libros("MiLibro", "Docu", "Anonimo"));

		try {
			bw = new BufferedWriter(new FileWriter("misArchivos.csv"));
			for (Multimedia m : lista) {
				bw.write(m.toFichero());
				bw.newLine();
			}

			bw.close();

		} catch (IOException e) {
			System.out.println("Error de E/S");
		}

	
		
	}// fin main

}// fin class
