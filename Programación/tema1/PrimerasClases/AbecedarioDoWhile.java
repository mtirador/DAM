package PrimerasClases;

public class AbecedarioDoWhile {
	public static void main(String[]args) {
		
		/*3�) Usando un bucle do_while realizar el algoritmo que muestre las letras may�sculas del alfabeto espa�ol.*/
	
		char car= 'a';
		
	
		do{
			
			System.out.println("El caracter: " + (int)car + "es "+ car);		
			car ++;
			
		} while(car<'z');
		
	}

}


