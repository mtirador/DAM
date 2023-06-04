package Mediamark;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TesterMain {

	public static void main(String[]args) {
		Portatil por=new Portatil("Omen",1500.00f,"windows11",16.00f);
		Sobremesa mes=new Sobremesa("pepino",3000.00f,"win11","atx");
		Hogar lavadora=new Hogar("siemens",550.55f,true);
		Hogar lavavajillas=new Hogar("Balay",200.00f,false);
		
		ArrayList<Productos>lista=new ArrayList<Productos>();
		
		
		lista.add(por);
		lista.add(mes);
		lista.add(lavadora);
		lista.add(lavavajillas);
		
		
		//file
		// el new file se esta instanciando desde el directorio en el que estamos
		//va a crear un objeto en java de la clase file, no lo genera , es una instancia en la memoria.
		
		//utilizar siempre esta ruta ./
		File directorio=new File("./backups");
		if (!directorio.exists()) {
			 directorio.mkdir();
		}
		
		//copia de seguridad de esa (engo que escribir)

		//lo instancias todo en la misma linea 
		
		
		try {
			int contador=0;
			BufferedWriter bw=new BufferedWriter(new FileWriter(new File(directorio+"\\listabk.dat")));
			
			while (contador<lista.size()) {
			bw.write(lista.get(contador).verFicha());	
			contador++;
			bw.flush();
			}
			bw.close();
			

		} catch (IOException e) {
		
		}
		
		System.out.println("¿desea elminarlo todo?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String respuesta;
		
		try {
			respuesta=br.readLine().toLowerCase();
			if(respuesta.equalsIgnoreCase("si") || respuesta.charAt(0)=='s'){
				for(File fichero : directorio.listFiles()) {
					fichero.delete();
				}
				directorio.delete();
				
			}
		
		}catch(IOException ex) {
			System.out.println();
		}
		
		
//		for(Productos p: lista) {
//			System.out.println(p.verFicha());
//		}
//		
//		System.out.println("***********************");
//		
//		Collections.sort(lista,new OrdenProductos());
//		
//		for(Productos p: lista) {
//			System.out.println(p.verFicha());
//			
//		}
//		System.out.println("************************");
		
//
//		for(Productos p : lista) {
//			System.out.println(p.verFicha());
//			
//		}
//		
//		System.out.println("**********************");
		//metodo de la clase arrays que ordena
//		Arrays.sort(lista);
//		System.out.println(lista[0].compareTo(por));
//		for(Productos p : lista) {
//			System.out.println(p.verFicha());
//		}
//		
//		
		
		
		
		
	}

}
