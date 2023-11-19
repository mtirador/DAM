package ficheropractica;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TablaMultiplicar {

	public static void main(String[] args) {

		//generar la tabla del numero pasado como parametro
		
		hazTabla(3);
		leerArchivo();
		
		

	}
	
	
	public static void hazTabla(int n) {
		
		try {
			FileWriter f=new FileWriter("tabla.txt");
			for(int i=1;i<=10;i++) {
				f.write(n+" x "+ i+" = "+ n*i+"\n");
				
			}
			f.close();
		} catch (IOException e) {
			System.out.println("error");
		}
	}

	public static void leerArchivo() {
		
		FileReader r;
		try {
			r = new FileReader("tabla.txt");
	
		int c;
		c=r.read();
		
		while(c!=-1) {
			if(c !=-1)System.out.println((char)c);
			c=r.read();
		}
		r.close();
		
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
