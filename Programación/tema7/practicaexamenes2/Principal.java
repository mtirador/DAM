package practicaexamenes2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Principal {

	public static void main(String[] args) {

		ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
		BufferedWriter bw = null;
		BufferedReader br = null;
		String[] linea = null;
		
	
		


		try {
			br = new BufferedReader(new FileReader("Multimedia.csv"));
			while (br.ready()) {
				linea = br.readLine().split(";");
				try {
				if (linea[0].equalsIgnoreCase("P")) {
					lista.add(new Peliculas(linea[1], linea[2], Integer.parseInt(linea[3])));
				} else if (linea[0].equalsIgnoreCase("S")) {
					lista.add(new Series(linea[1], linea[2], Integer.parseInt(linea[3])));
				} else if (linea[0].equalsIgnoreCase("L")) {
					lista.add(new Libros(linea[1], linea[2], linea[3]));

				}

			}catch (NumberFormatException ex) {
				System.out.println("Error, dato no númerico" + linea[3] + " en" + linea[1]);
			}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Cuidado,el archivo no está ");
		} catch (IOException e) {
			System.out.println("Error E/S");
		}catch (Exception e) {

		}
		
		for (Multimedia m : lista) {
			System.out.println(m);
		}
		
		lista.add( new Peliculas("Aladin", "Dibujos", 1));
		lista.add( new Series("Fargo", "Suspense", 4));
		lista.add(new Libros("1984", "Politica", "G.Orwell"));
		
		
		
		try {
			bw=new BufferedWriter(new FileWriter("Multimedia.csv"));
			for(Multimedia m: lista) {
				bw.write(m.toFichero());
				bw.newLine();
			}
			
			bw.flush();
		}catch(IOException e) {
			System.out.println("Error de E/S");
			
		}

	}// fin main

}// fin class
