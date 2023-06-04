package PrimerasClases;

public class BucleDo {
	public static void main(String[] args) {
		
		int numero =100;
		
		while(numero >= 0) {
			
			System.out.println(numero);
			numero-=2;
			
			if(numero ==48) {
				continue;
			}
			System.out.println(numero);
			numero-=2;
		}
		
		
		
		
	}

}
