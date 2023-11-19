package pktMetodos;

import java.util.Scanner;

public class Recu1 {

public static void main(String[] args) {
		

		
		int num;
		int num2;
		int num3;
		int resultado;
		
		
		Scanner ent=new Scanner(System.in);
		System.out.println("Ingrese un numero 1");
		num=ent.nextInt();
		System.out.println("Ingrese otro numero  2");
		num2=ent.nextInt();
		System.out.println("Ingrese el numero 3");
		num3=ent.nextInt();
		
		resultado= mayor(num,num2,num3);
		
		System.out.println("El numero mayor es ---->"+ resultado);
		
		
		
		
	}//fin main
	
	public static int mayor (int a, int b, int c) {
		
		int numMayor=0;
		if(a>b && a>c) {
			numMayor=a;
		}else if(b>a &&b>c) {
			numMayor=b;
		}else if(c>a && c>b) {
			numMayor=c;
		}else {
			System.out.println("Son iguales ");
		}
		
		
		return(numMayor);
	}

}