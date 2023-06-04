package PrimerasClases;

public class AbecedarioDoWhile {
	public static void main(String[]args) {
		
		/*3º) Usando un bucle do_while realizar el algoritmo que muestre las letras mayúsculas del alfabeto español.*/
	
		char car= 'a';
		
	
		do{
			
			System.out.println("El caracter: " + (int)car + "es "+ car);		
			car ++;
			
		} while(car<'z');
		
	}

}


