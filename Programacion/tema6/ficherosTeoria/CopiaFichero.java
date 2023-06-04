package ficherosTeoria;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaFichero {

    public static void main(String[] args) throws IOException {
        // ejemplo de copia de un fichero

    	//Crea dos objetos File, uno para el archivo de entrada y otro para el archivo de salida.
        File fentrada = new File("C:\\Users\\buffy\\OneDrive\\Escritorio\\PROYECTO TUP\\bitacora.docx");
        File fsalida = new File("C:\\Users\\buffy\\OneDrive\\Escritorio\\PROYECTO TUP\\copia.docx");

        // Comprueba si el archivo de salida existe. Si no existe, crea uno nuevo en la ubicación especificada.
        if (!fsalida.exists()) {
            fsalida.createNewFile();
        }

        //Crea dos objetos FileReader y FileWriter para leer y escribir en los archivos de entrada y salida, respectivamente.
        FileReader entrada = new FileReader(fentrada);
        FileWriter salida = new FileWriter(fsalida);

        int dato; //se utilizará para almacenar los datos leídos del archivo de entrada.
        while ((dato = entrada.read()) != -1) {
            salida.write(dato);
        }
        // bucle while para leer los datos del archivo de entrada y escribirlos en el archivo de salida.
        //El bucle continuará mientras haya datos para leer, y se detendrá cuando se alcance el final del archivo (-1).

        entrada.close();
        salida.close();

    }
}
