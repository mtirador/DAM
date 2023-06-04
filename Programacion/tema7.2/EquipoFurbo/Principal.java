package EquipoFurbo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();

	leerFichero(lista);
	
		listarFichero(lista);
	

	}

	public static void listarFichero(ArrayList<Persona> lista) {
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Plantilla.csv"));

            for (Persona r : lista) {
                bw.write(r.toFichero());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero");
        } catch(Exception e) {
            System.out.println("Error");
        }
    }
	

	public static void leerFichero(ArrayList<Persona> lista) {

		BufferedReader br = null;
		String[] linea = null;

		try {
			br = new BufferedReader(new FileReader("Racing.csv"));

			while (br.ready()) {
				linea=br.readLine().split(";");
				if (linea[3].equalsIgnoreCase("Jugador")) {
					lista.add(new Jugador(linea[0], linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[5]),
							linea[4]));
				} else if (linea[3].equalsIgnoreCase("tecnico")) {
					lista.add(new Tecnico(linea[0], linea[1], Integer.parseInt(linea[2]), linea[4]));

				}

			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("Cuidado, archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error entrada/salida");
		}

	}

}
