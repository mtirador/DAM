package PrimerasClases;

public class Entreceroyaleatorio {
	public static void main(String[]args) {
		
		
		int num=0;
		int aleatorio=(int)((Math.random()*101));
		
		System.out.println(num+ ","+aleatorio);
		do {
			System.out.println(num);
			num++;
			
			
			
		}while(num<=aleatorio);
		
	}
}
