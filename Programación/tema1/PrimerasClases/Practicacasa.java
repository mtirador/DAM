package PrimerasClases;

public class Practicacasa {
	public static void main(String [] args) {
	/*	
		String Estacion = "Otoño";
		
		switch(Estacion) {
		
		case "Primavera":
			System.out.println("La estacion de las flores");
			break;
			
		case"Verano":
			System.out.println("La estacion de la playa y el calor");
			break;
			
		case"Otoño":
			System.out.println("La estacion de la caida de hojas");
			break;
			
		case"Invierno":
			System.out.println("La estacion de las Navidades");
			break;
		
			default:
			System.out.println("No existe esa estacion");
		
		
		}
		
	}
		*/
		
/*	char num='E';
		
		switch(num) {
		
		case 69:
			System.out.println(num + " = " + (int)num );
			break;
			
		default:
			System.out.println( "no es valido");
		
		
		}
		}
		
	*/	
		
/*
		int n=-12;
		int n1=1;
		
		if (n>1) {
			System.out.println(n + " es mayor que "+ n1);
			
		
		
		}else {
			
			System.out.println(n1 + " es mayor que "+n);
			
			
			
		}
		}
		
		*/
	/*	
		int n =2 ,n1=0;
		
		while(n1 <=10) {
			
		System.out.println((n*n1));
		n1++;
		
		
		}
		}
			
	*/
	// Escribir un programa que imprima todos los números pares entre dos números aleatorios.
		
		int num1 =(int)(Math.random()*101);
		int num2 = (int)(Math.random()*101);
		
		System.out.println(num1+ ","+ num2);
		                                                  //x=60
		                                                  //y=25
		int menor=0,mayor=0;
		
		if(num1 >num2) {
			mayor =num1;
			menor=num2;
			
		}else {
			mayor=num2;
			menor=num1;
			
		}
		for(int i= menor; i<=mayor; i++ ) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			
		}
		
	
		
	}
	
}



		
		
		
		
		
		
		
		
		
		
		
		
		
			
	


