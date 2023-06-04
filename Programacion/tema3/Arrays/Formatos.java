package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Formatos {

	public static void main(String[] args) {

		
		
		double numero = Math.random()*101;
		DecimalFormat df =new DecimalFormat("#.##");
		
		System.out.println("sin formato --> "+ numero);
		System.out.printf("con formato --> %.2f" ,numero); // printf es para formatos
		System.out.println("con DecimalFormat ---> " + df.format(numero)); //recomendable 
		

	
	}
	
}

