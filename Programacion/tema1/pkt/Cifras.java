package pkt;

public class Cifras {
	public static void main(String[] args) {
		
	/*	int num = (int)Math.random()* 99999 ;
		int num = 97;
		if(num<=9) {
			System.out.println("1 cifra");
			
		}else if(num <=99) {
			System.out.println("2 cifras");
			
		}
		*/
		
		
		int num = (int) (Math.random() * 1000);
		
		int cont=0;
	    
		System.out.println("Numero generado " + num);
		
	    do {
	    	
	    	num/=10;
	    	cont++;
	    	
	    }while(num > 0);
	    
	    System.out.println("Tiene " + cont + " cifras ");
	    
	    
		
	}

}






