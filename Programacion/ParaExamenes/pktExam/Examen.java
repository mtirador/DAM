package pktExam;

public class Examen {
	public static void main(String[] arg) {

		ifAnidado();
		bucleFor();
		bucleWhile();
		condicionalIf();
		condicionalSwitch();
		operadorLogico();
		doWhile();
		mathRandom();

	}

	private static void ifAnidado() {

		int numero = 44;

		if (numero < 10) {
			System.out.println("El numero es menor que 10");
		} else if (numero < 50) {
			System.out.println("El numero es mayor o igual que 10 y menor que 50");
		} else {
			System.out.println("El numero es mayor o igual a 50");
		}
	}

	private static void bucleFor() {

		for (int i = 1; i <= 10; i++) {// como estoy inicializando la variable i aqui significa que sólo forma parte
										// del bucle for.
			System.out.println("Hola " + i);
		}

	}

	private static void bucleWhile() {

		int contador = 1;

		while (contador < 30) { // todo lo que metamos dentro de estas llaves es lo que se va repetir

			System.out.println(contador);

			contador++;

		}
	}

	private static void condicionalIf() {

		int edad = 17;

		if (edad >= 18) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("No puedes pasar!!!");
		}
	}

	private static void condicionalSwitch() {

		int entrada = 0;

		switch (entrada) {

		case 1:
			System.out.println("Caso 1");
			// Lineas de codigo; tantas como necesitemos
			break; // Importante poner el break

		case 2:
			System.out.println("caso 2");
			break;
		case 3:
			System.out.println("caso 3");
			break;

		default:
			System.out.println("No existe esa opcion");
		}

	}

	private static void operadorLogico() {

		int numero = 22;

		if ((numero > 10) && (numero % 2 == 0)) {
			System.out.println("El numero es mayor que 10 y par");

		} else if (numero > 10) {
			System.out.println("El numero no es mayor que 10 e impar");

		} else if (numero % 2 == 0) {
			System.out.println("El numero es menor que 10 y par");

		} else
			System.out.println("El numero es menor que 10 e impar");
	}
	// hacer la tabla de 1)V,V 2)V,F 3)F,V 4) F,F

	private static void doWhile() {

		char letra = 'A';

		do {
			System.out.println(letra);
			letra += 1;

		} while (letra <= 'Z');
	}

	private static void mathRandom() {

		System.out.println(Math.random());// para darle aletoriedad al algoritmo

	}
}
