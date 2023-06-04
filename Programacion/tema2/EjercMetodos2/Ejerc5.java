package EjercMetodos2;

import java.util.Scanner;

public class Ejerc5 {

	public static void main(String[]args) {
		
		//Calcular el importe de las entradas de un parque de atracciones si se sabe
		//que:
			//a. Existen entradas infantiles a 10€ y de adulto a 15€.
			//b. Si el importe total es superior a 100€ se aplicará un 10% de dto. al
			//total.
		
		Scanner ent = new Scanner(System.in);
		int entAdultos=0, entInfantiles=0;
		
		System.out.println("¿cuantas entradas necesita un adulto");
		entAdultos = ent.nextInt();
		System.out.println("¿cuantas entradas infantiles?");
		entInfantiles = ent.nextInt();
		
		
		System.out.println("total a pagar es :" + total(entAdultos,entInfantiles));
		
		
		
		
	}
	   
		public static float total(int adultos, int enanos) {
			float total=0.0f;
			
			total+=(adultos * 15)+(enanos * 10);
			total = dto(total);
		
			return total;
		
	}
		public static float dto (float total) {
			//if (total>200){
			//   total+=0.9f;
			// }
			return(total > 100)?(total*0.9f):(total);
		}
	
	

}
