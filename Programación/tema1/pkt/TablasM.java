package pkt;

public class TablasM {
	public static void main(String[]args) {
		/*
		int num=0;
		
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 2 es " + num*2);
			
		}
		
		for (num=1;num<=10;num++) {
			System.out.println("La tabla del 3 es " + num*3);
		}
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 4 es " + num*4);
		}
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 5 es " + num*5);
		}
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 6 es " + num*6);
		}
		
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 7 es " + num*7);
		}
	
		
		for (num=1;num<=10;num++) {
			
			System.out.println("La tabla del 8 es " + num*8);
		}
		*/
		String linea="";
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				linea+= j + " * "+ i + "= "+(j*i)+ "\t";
				
			}
			System.out.println(linea);
			linea="";
		}
		
	}

}
