package PrimerasClases;

public class Testear {
	public static void main(String[] args) {
		
		
		/*Generar numeros aleatorios entre 0-100  y contar cuantas veces aparece un numero X usando el do-while*/
		
	
		int numX=21;
		int aleatorio;
		int contador=0;
		int cont=0;
		
		do {
			aleatorio=(int)(Math.random()*101);
			System.out.println(aleatorio);
			contador++;
			if (numX == aleatorio) {
				cont++;
					
			}
			
			
			
		}while(contador<=100);
		
	System.out.println(numX+" aparece tantas veces "+ cont);	
	}
	

}
