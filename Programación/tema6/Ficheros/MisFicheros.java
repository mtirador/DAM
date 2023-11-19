package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MisFicheros {
	public static void main(String[] args) {
		// File dir =new File(C:\\Users\\Clases\\Dowloads\\")

		// la clase file tiene 3 constructores
		/*
		 * File dir = new File("C:\\Users\\buffy\\Downloads"); //hay que poner dos
		 * barras System.out.println(dir.getAbsolutePath());
		 * 
		 */
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.println("Introduce el directorio ");
		String path = "";
		try {
			path = br.readLine();

		} catch (IOException e) {
			System.out.println("Entrada incorrecta");
			leerDir(path);
		}

		File dir = new File(path);

		for (File fichero : dir.listFiles()) {

			if (fichero.isDirectory()) {
				System.out.println("Se puede escanear el contenido" + fichero.getName());
			} else {
				System.out.println(fichero.getName() + "Es un archivo de "
						+ String.format("%.2f", fichero.length() / 1024.00f) + " kb");
			}

		} // for

	}// main

	public static void leerDir(String ruta) {
		File dir = new File(ruta.toString());

		for (File fichero : dir.listFiles()) {

			if (fichero.isDirectory()) {
				System.out.println("Se puede escanear el contenido en " + fichero.getName());
			} else {
				System.out.println(fichero.getName() + "archivo");
			}
		}

	}

}// fin class
