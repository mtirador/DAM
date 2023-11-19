package examenes3;

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
		
		ArrayList<Empleados> lista = new ArrayList<Empleados>();
		
		try{
			leerFichajes(lista);
			
		for(Empleados e : lista) {
			System.out.println(e.toFichero());
		}
			
			escribirFichero(lista);
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no se ha encontrado");
		}catch(IOException ex) {
			System.out.println("El fichero no se puede leer/escribir");
		}

	}
	
	private static void escribirFichero(ArrayList<Empleados> lista) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("nominas.csv"));
		
		for(Empleados e : lista) {
			bw.write(e.toFichero());
			bw.newLine();
		}
		
		bw.close();
		
	}
	
	
	private static void leerFichajes(ArrayList<Empleados> lista) 
						throws FileNotFoundException, IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("fichajes.csv"));
		String[] linea=null;
		
		while(br.ready()) {			
			linea = br.readLine().split(";");	
			try {
				if(linea[3].equalsIgnoreCase("operador")) {
					
					lista.add(new Operadores(linea[0], linea[1], linea[2],
							LocalTime.parse(linea[5]),
							LocalTime.parse(linea[6]),
							Integer.parseInt(linea[4])));
					
				}else if(linea[3].equalsIgnoreCase("oficina")) {
					lista.add(new Oficinistas(linea[0], linea[1], linea[2],
							LocalTime.parse(linea[5]),
							LocalTime.parse(linea[6]),
							linea[4]));
				}
			}catch(DateTimeParseException ex) {
				System.out.println("Error fecha " + Arrays.toString(linea));
			}catch(NumberFormatException ex) {
				System.out.println("Taller erróneo " + Arrays.toString(linea));
			}
		}
		br.close();
	}
}
