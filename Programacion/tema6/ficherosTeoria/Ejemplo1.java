package ficherosTeoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo1 {

	public static void main(String[] args) {
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(sr);
		String mensaje="";
		System.out.println("Introducir  una línea de texto:");
		
		try {
			mensaje=bf.readLine();
		} catch (IOException e) {
			System.out.println("Excepcion generada");
		}

			System.out.println("Introducido : \" "+ mensaje +"\"");
	}

}
