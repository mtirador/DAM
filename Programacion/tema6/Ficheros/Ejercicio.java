package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio {
public static void main(String[] args) {
		
		//esto es para escribir un fichero.
		
		String fichero = "C:\\Users\\buffy\\OneDrive\\Escritorio\\LoremIpsum.txt";
		FileWriter fw=null;
		BufferedWriter bw=null;
		int cont=7;
		
		try {
			fw = new FileWriter(fichero);
			bw=new BufferedWriter(fw);
			
			bw.write("Hola Mundo");
			bw.newLine();//cada vez que quiera hacer un salto de linea utilizar un newLine en vez de /n
			bw.write("Segunda Linea");
			bw.newLine();
			
			for(int i=1;i<=10;i++) {
				bw.write(cont+"*"+i+"="+ (cont*i));
				bw.newLine();
			}

			
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		
		}
		
}
}
