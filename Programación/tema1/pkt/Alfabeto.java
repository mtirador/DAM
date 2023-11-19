package pkt;

public class Alfabeto {
	public static void main(String[] args) {
		/*2º) Usando un bucle while crear un algoritmo que muestre las letras minúsculas del alfabeto español. 
		
		char car='a';
		
		for (car='a';car<='z';car++){
			
			
			System.out.println("El caracter "+ (int)car + " es: " + car );
			
		}
		
		*/
		char car='a';
		
		while (car<='z') {
			
			System.out.println("El numero "+ (int)car + " es :" + car);
			
			car++;
			if(car=='o') {
				System.out.println('ñ');
			}
			
		}
		
		
	}

}

