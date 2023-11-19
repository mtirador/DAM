package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

	public static void main(String[] args) {
		
		//esto es para escribir un fichero.
		
		String fichero = "C:\\Users\\buffy\\OneDrive\\Escritorio\\LoremIpsum.txt";
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		
		try {
			fw = new FileWriter(fichero);
			bw=new BufferedWriter(fw);
			
			bw.write("Hola Mundo");
			bw.newLine();//cada vez que quiera hacer un salto de linea utilizar un newLine en vez de /n
			bw.write("Segunda Linea");
			
			
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		
		}
		

	}

}
