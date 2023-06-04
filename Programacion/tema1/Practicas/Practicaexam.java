package Practicas;

public class Practicaexam {
	public static void main(String[]args) {
		
/*Declarar los datos necesarios para realizar el cálculo de IMC y mostrar
por pantalla. La fórmula del IMC es el peso en kilógramos dividido por el cuadrado
de la altura en metros (kg/m2):

IMC < 18,5 Necesitas comer más.
IMC entre 18,5 y menor de 25, normal.
IMC >= 25 y menor de 30, obesidad.
IMC >= 30 Obesidad mórbida.*/

/*
		float kilos=61.0f;
		float altura=1.69f;
		float imc=kilos/((altura*altura));
		
		System.out.println(imc);
		
		if(imc<18.5f) {
			System.out.println("Necesita comer más");
		}else if(imc>=18.5f && imc<25f) {
			System.out.println("Su peso es normal");
		}else if (imc>=25f && imc<30f) {
			System.out.println("Obesidad");
			
		}else {
			
			System.out.println("Obesidad morbida");
			
		}
		*/
		
		
		/*2o) Construir un programa en el que, utilizando un bucle for, se escriba
por pantalla una tabla de conversión de grados Fahrenheit a Celsius, para
los valores de 0 grados Fahrenheit hasta 300 grados Fahrenheit, en
intervalos de 20. La regla de conversión es la siguiente:
oC = (0 °F − 32) × 5 / 9. (3 ptos).*/
		
	
		
/*			
	float celsius = 0.0f;
	float faren =0.0f;
	
		
		do {
			
			celsius= (faren - 32)*5/9;
		System.out.println(faren+ "faren"+ "--->"+ celsius+ "Celsius");
			faren+=20;
			
			
			
		}while(faren<=300);
	
		////////////////////////////////////////////////////////////////////
		
		for(int fa=300 ; fa>=0 ; fa-=20) {
			celsius = ((float)(fa-32)*5)/9 ;
			System.out.println(fa + " F --> " + celsius+ " C");
		}
	

		/////////////////////////////////////////////////////////////////////////
		
		*/
		
		
		/*Crear un algoritmo en el que se generen 100 números aleatorios y
muestre por pantalla el número más alto generado y las veces que
aparece. (4 ptos).*/
		
	int aleatorio = 0, menor=100,mayor=0,contMay=0, contMenor=0;
		
		for(int i=1;i<=100;i++) {
			aleatorio=(int)(Math.random()*101);
			if (aleatorio<menor) {
				menor=aleatorio;
				contMenor=1;
				
			}else if (aleatorio==menor){
				contMenor++;
				
			}
			if (aleatorio>mayor) {
				mayor=aleatorio;
				contMay=1;
				
			}else if (aleatorio==mayor) {
				contMay++;
				
			}
			System.out.println(aleatorio);
			
			
			
		}
	
		System.out.println("El num menor es " + menor+ 
				" y aparece " + contMenor + " veces");
		
		System.out.println("El num mayor es " + mayor+ 
				" y aparece " + contMay + " veces");
	
	}
}