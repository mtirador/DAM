package UtilesJava;


	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class AdivinaCombinacion {

	  private static final int LONGITUD_COMBINACION = 6;
	  private static final int MAX_INTENTOS = 10;

	  public static void main(String[] args) {
	    int[] combinacion = generaCombinacionAleatoria();
	    int[] intento = new int[LONGITUD_COMBINACION];
	    Scanner scanner = new Scanner(System.in);

	    for (int i = 1; i <= MAX_INTENTOS; i++) {
	      System.out.println("Intento " + i + " de " + MAX_INTENTOS + ":");
	      leeCombinacionUsuario(scanner, intento);
	      if (combinacionesIguales(combinacion, intento)) {
	        System.out.println("¡Has adivinado la combinación en " + i + " intentos!");
	        return;
	      }
	      muestraAsteriscos(combinacion, intento);
	      muestraPistas(combinacion, intento);
	    }

	    System.out.println("Lo siento, has superado el límite de intentos sin adivinar la combinación.");
	  }

	  private static int[] generaCombinacionAleatoria() {
	    Random random = new Random();
	    int[] combinacion = new int[LONGITUD_COMBINACION];
	    for (int i = 0; i < LONGITUD_COMBINACION; i++) {
	      combinacion[i] = random.nextInt(20) + 1;
	    }
	    return combinacion;
	  }

	  private static void leeCombinacionUsuario(Scanner scanner, int[] combinacion) {
	    for (int i = 0; i < LONGITUD_COMBINACION; i++) {
	      System.out.print("Introduce el número " + (i + 1) + ": ");
	      combinacion[i] = scanner.nextInt();
	    }
	  }

	  private static boolean combinacionesIguales(int[] combinacion, int[] intento) {
	    return Arrays.equals(combinacion, intento);
	  }

	  private static void muestraAsteriscos(int[] combinacion, int[] intento) {
	    for (int i = 0; i < LONGITUD_COMBINACION; i++) {
	      if (combinacion[i] == intento[i]) {
	        System.out.print(combinacion[i] + " ");
	      } else {
	        System.out.print("* ");
	      }
	    }
	    System.out.println();
	  }

	  private static void muestraPistas(int[] combinacion, int[] intento) {
	    for (int i = 0; i < LONGITUD_COMBINACION; i++);


	}

}
