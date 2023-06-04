package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SinScanner2 {

	public static void main(String[] args) {
		
		//Solicitar ruta x teclado(sin usar scanner)| crear directorio "Mis tablas"|| 
				// dentro de mis tablas, 10 ficheros .txt con las 10 tablas de multiplicar)

				InputStreamReader ent = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ent);
				BufferedWriter fichero=null;
				

				System.out.println("Introduzca una ruta donde guardar las tablas: ");
				
				try {
					String ruta = br.readLine();

					String carpeta = "misTablas";

					File dir = new File(ruta + "\\" + carpeta);
					

					if (dir.mkdir() || dir.exists()) {
						System.out.println("Directorio creado");
						for(int i=1;i<=10;i++) {//bucle para cada tabla
							fichero=new BufferedWriter (new FileWriter(dir+"\\tabla.del."+i+".txt"));
							for(int j=i;j<=10;j++) {//bucle para cada operacion de la tabla
								fichero.newLine();
							}
						}

					} else {
						System.out.println("El directorio no se ha creado");
					}

				} catch (IOException e) {
					System.out.println();
				}

		

	}

}
