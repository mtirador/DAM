package Ficheros;

import java.io.*;

public class SinScanner {

	public static void main(String[] args) {
//Solicitar ruta x teclado(sin usar scanner)| crear directorio "Mis tablas"|| 
		// dentro de mis tablas, 10 ficheros .txt con las 10 tablas de multiplicar)

		InputStreamReader ent = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ent);
		BufferedWriter bw=null;
		FileWriter fichero=null;

		System.out.println("Introduzca una ruta donde guardar las tablas: ");
		String ruta = "";
		try {
			ruta = br.readLine();

			String carpeta = "misTablas";

			File dir = new File(ruta + "\\" + carpeta);
			

			if (dir.mkdir() || dir.exists()) {
				System.out.println("Directorio creado");
				for(int i=1;i<=10;i++) {//bucle para cada tabla
					fichero= new FileWriter(dir+"\\tabla.del."+i+".txt");
					bw= new BufferedWriter(fichero);
					for(int j=0;j<=10;j++) {//bucle para cada operacion de la tabla
						bw.write(i+ " * "+ j + "= "+ (i*j));
						bw.newLine();
					}
				bw.close();
				}

			} else {
				System.out.println("El directorio no se ha creado");
			}

		} catch (IOException e) {
			System.out.println();
		}

	}

}
