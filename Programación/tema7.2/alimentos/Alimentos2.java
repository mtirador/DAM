package alimentos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Alimentos2 {

    public static void main(String[] args) {
        // lectura
      //  lecturaFichero();
       escribirFichero();
    }

    public static void escribirFichero() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String[] linea = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\buffy\\OneDrive\\Escritorio\\alimentos.csv"));
            bw = new BufferedWriter(new FileWriter("AlimentosPrueba.csv"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                if (linea[1].equalsIgnoreCase("fruta")) {
                    bw.write(linea[0] + " has gastado "
                            + Integer.parseInt(linea[3]) * Float.parseFloat(linea[4].replace(",", ".")));
                    bw.newLine();
                }
            }
            bw.close();
            br.close();
            System.out.println("Archivo escrito exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Excepción IO");
        }
    }

    public static void lecturaFichero() {
        BufferedReader br = null;
        File fichero = new File("C:\\Users\\buffy\\OneDrive\\Escritorio\\alimentos.csv");
        try {
            br = new BufferedReader(new FileReader(fichero));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Excepción IO");
        }
    }
}
