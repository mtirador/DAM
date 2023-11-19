package tienda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarFichero {

	public static void main(String[] args) {

		// para lectura necesitamos un filereader
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Productos>lista=new ArrayList<Productos>();
		String list="";
		String[] producto=null;
		Productos p =null;
		int cont=1;
		
		try {
			fr = new FileReader("productos.csv"); // o puedo poner la rutacompleta o el csv en la carperta de ficheros

			br = new BufferedReader(fr);
			br.readLine();
			while (br.ready()) {
				cont ++;
				//linea=br.readLine();
				//producto= linea.split(";");
				//p=new Productos(producto[0],producto[1],Integer.parseInt(producto[2]),Double.parseDouble(producto[3]));
				//lista.add(p);
				
				try {
				lista.add(new Productos(br.readLine()));
				}catch(NumberFormatException e) { //este catch que estaba fuera del bucle le metemos dentro del while
					System.out.println(e.getMessage() +"Error al procesar el fichero" + cont);
					
				}
			
			}//fin while
			br.close();
			
		System.out.println(lista.size() + "Productos importados");
			for(Productos pr :lista) {
				System.out.println(pr);
				
			}
	
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		
		}
		
		
		
		
		
		
		
	}//main

}// class
