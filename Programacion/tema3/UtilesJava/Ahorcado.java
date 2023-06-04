package UtilesJava;


		import java.util.Scanner;
		import java.util.Random;
		 
		/**
		 * Juego del ahorcado en poco mas de media hora, mu simpleeeee
		 * @author victor
		 */
		public class Ahorcado {
		 
		    /**
		     * @param args the command line arguments
		     */
		    public static void main(String[] args) {
		        final int INTENTOS_TOTALES = 7; // Constante con el limite de fallos
		        int intentos = 0;
		        int aciertos = 0;
		        // Mierdas para leer por teclado
		        Scanner teclado = new Scanner(System.in);
		        teclado.useDelimiter("\n");
		        char resp;
		        // Random para pillar una palabra al azar
		        Random rnd = new Random();
		        // Creamos unas palabras y le asignamos una aleatoria a una varibale
		        String arrayPalabras[] = new String[3];
		        arrayPalabras[0] = "hola";
		        arrayPalabras[1] = "adios";
		        arrayPalabras[2] = "cojonudo";
		 
		        do {
		 
		        // Desguazamos la palabra y la guardamos en un array de caracteres
		        int alea = rnd.nextInt(3);
		        char[] desguazada = desguaza(arrayPalabras[alea]);
		        char[] copia = desguaza(arrayPalabras[alea]); // Algo auxiliar para mas tarde
		        // Array para pintar mierdecillas en pantalla(Guiones o letras vamos)
		        char[] tusRespuestas = new char[desguazada.length];
		 
		        // Rellenamos palabras ocn guiones
		        for(int i = 0; i < tusRespuestas.length; i++){
		            tusRespuestas[i] = '_';
		        }
		 
		        // Empezamos a pintar mierdas en pantalla
		        System.out.println("Adivina la palabra!");
		 
		        // Mientras que no nos pasemos con los intentos y no la acertemos...
		        while(intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){
		            imprimeOculta(tusRespuestas);
		            // Preguntamos mierdas por teclado
		            System.out.println("\nIntroduce una letra: ");
		            resp = teclado.next().toLowerCase().charAt(0);
		            // Recorremos el array y comprobamos si se ha producido un acierto
		            for(int i = 0; i < desguazada.length; i++){
		                if(desguazada[i]==resp){
		                    tusRespuestas[i] = desguazada[i];
		                    desguazada[i] = ' ';
		                    aciertos++;
		                }
		            }
		            intentos++;
		        }
		        // Si hemos acertado todas imprimimos un mensahe
		        if(aciertos == tusRespuestas.length){
		            System.out.print("\nFalocidades!! has acertado la palabra: ");
		            imprimeOculta(tusRespuestas);
		        }
		        // Si no otro
		        else{
		            System.out.print("\nMenudo ceporro eres! la palabra era: ");
		            for(int i = 0; i < copia.length; i++){
		                System.out.print(copia[i] + " ");
		            }
		        }
		        // Reseteamos contadores
		        intentos = 0;
		        aciertos = 0;
		        // Volvemos a preguntarle al usuario si quiere volver a perder el tiempo
		        resp = pregunta("\n\nQuieres volver a jugar?",teclado);
		        }while(resp != 'n');
		 
		    }
		 
		     /**
		     * Esto desguaza el String en un array de caracteres
		     * @return array de letras.
		     */
		    private static char[] desguaza(String palAzar){
		        char[] letras;
		        letras = new char[palAzar.length()];
		        for(int i = 0; i < palAzar.length(); i++){
		            letras[i] = palAzar.charAt(i);
		        }
		        return letras;
		    }
		 
		    /**
		     * Esto imprime la palabra con espacios
		     * @param tusRespuestas el array de caracteres
		     */
		    private static void imprimeOculta(char[] tusRespuestas){
		 
		        for(int i = 0; i < tusRespuestas.length; i++){
		            System.out.print(tusRespuestas[i] + " ");
		        }
		    }
		 
		    /**
		     * Esto nos pregunta si queremos volver a jugar y comprueba los caracteres
		     * introducidos
		     * @param men texto para mostrar al usuario
		     * @return caracter de respuesta (s/n)
		     */
		    public static char pregunta(String men, Scanner teclado) {
		        char resp;
		        System.out.println(men + " (s/n)");
		        resp = teclado.next().toLowerCase().charAt(0);
		        while (resp != 's' && resp != 'n') {
		            System.out.println("Error! solo se admite S o N");
		            resp = teclado.next().toLowerCase().charAt(0);
		        }
		        return resp;
		    }
		 
		}

	


