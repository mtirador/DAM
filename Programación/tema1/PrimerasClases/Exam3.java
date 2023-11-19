package PrimerasClases;

public class Exam3 {
	public static void main(String[]args) {
		
int aleatorio = 0, menor=100,mayor=0,contMay=0, contMenor=0;
		
		for(int i=1 ; i<=100 ; i++) {			
			aleatorio = (int)(Math.random() * 101);
			if(aleatorio < menor) {
				menor=aleatorio;
				contMenor=1;
			}else if(aleatorio == menor) {
				contMenor++;
			}		
			
			if(aleatorio > mayor) {
				mayor = aleatorio;
				contMay=1;
			}else if(aleatorio == mayor) {
				contMay++;
			}
			
			
			System.out.println(aleatorio);
		}
		System.out.println("El num menor es " + menor+ 
				" y aparece " + contMenor + " veces");
		
		System.out.println("El num mayor es " + mayor+ 
				" y aparece " + contMay + " veces");
	}
}




