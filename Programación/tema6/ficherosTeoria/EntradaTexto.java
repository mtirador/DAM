package ficherosTeoria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EntradaTexto {
    //ejercicio de entrada de texto desde un fichero

    public static void main(String[] args) throws IOException {
        // Entrada de texto desde un fichero

        FileReader fr = new FileReader("productos.csv");
        BufferedReader bf = new BufferedReader(fr);
        String linea = bf.readLine();

        while (linea != null) {
            //procesar el texto de la linea
            System.out.println(linea);
            linea = bf.readLine();
        }
        bf.close();
        fr.close();

    }
}
