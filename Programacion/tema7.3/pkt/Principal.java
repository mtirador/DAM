package pkt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
	
		ArrayList<Empleados>lista=new ArrayList<Empleados>();
		
		try {
			leerFichero(lista);
			
			for (Empleados empleados : lista) {
				System.out.println(empleados.toFichero());
				
			}
			
			escribirFichero(lista);
			
		} catch (FileNotFoundException e) {
		System.out.println("Error, fichero no encontrado");
		} catch (IOException e) {
		System.out.println("El fichero no se puede leer ni escribir");
		}

	}//fin main

	public static void escribirFichero(ArrayList<Empleados> lista) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("nominas.csv"));
		
		for (Empleados empleados : lista) {
			bw.write(empleados.toFichero());
			bw.newLine();
			
		}
		bw.close();
	}

	public static void leerFichero(ArrayList<Empleados> lista) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("fichajes.csv"));
		String []linea=null;
		
		
		while(br.ready()) {
			linea=br.readLine().split(";");
			try {
			if(linea[3].equalsIgnoreCase("operador")) {
				
				lista.add(new Operadores(linea[0],linea[1],linea[2],
						LocalTime.parse(linea[5]),
						LocalTime.parse(linea[6]),
						Integer.parseInt(linea[4])));
			}else if(linea[3].equalsIgnoreCase("oficina")) {
				lista.add(new Oficinistas(linea[0],linea[1],linea[2],LocalTime.parse(linea[5]),LocalTime.parse(linea[6]),linea[4]));
			}
			}catch(DateTimeParseException e) {
				System.out.println("Error fecha en"+ Arrays.toString(linea));
			}catch(NumberFormatException e) {
				System.out.println("Taller erróneo "+ Arrays.toString(linea));
			}
		}
		br.close();
	}

}
