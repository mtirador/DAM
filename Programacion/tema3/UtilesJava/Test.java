package UtilesJava;

import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		
/*Calcular el importe de las entradas de un parque de atracciones si se sabe
que:
a. Existen entradas infantiles a 10€ y de adulto a 15€.
b. Si el importe total es superior a 100€ se aplicará un 10% de dto. al
total.*/
		
		int numInfantiles=0;
		int numAdulto=0;
		int entInfantiles=10;
		int entAdulto = 15;
		int total= (numAdulto*entAdulto)+(entInfantiles*numInfantiles);
		
		Scanner ent = new Scanner(System.in);
		System.out.println("¿cuantas entradas de infantiles necesita?");
		numInfantiles = ent.nextInt();
		System.out.println("¿cuantas entradas de adulto necesita?");
		numAdulto= ent.nextInt();
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
	}

}
