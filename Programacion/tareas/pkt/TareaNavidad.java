package pkt;

import java.util.Arrays;
import java.util.Scanner;

public class TareaNavidad {

	public static void main(String[] args) {

		int [] listaNumeros;
		listaNumeros =new int[6];
		String[] salida = {"*","*","*","*","*","*"};
		int aleatorio = (int) (Math.random()*20)+1;
		int intentosTotales=10;
		int intentos = 0;
		int aciertos = 0;
	
		
		int numIntroducido;
		
		
	
		listaNumeros = DigitosAleatorios(aleatorio);// esto es lo que hay que adivinar
		
		Scanner ent =new Scanner(System.in);
		
			
		System.out.println("||** Desactiva la Bomba **||, (un juego de bibiBIZAK)");
		System.out.println("");
		System.out.println("REGLAS: tienes 10 intentos y por cada intento se validará\r\n"
				+ "el número introducido con la combinación, mucha suerte y... ");
		System.out.println("... por favor acierta, la humanidad depende de ti. (SIN PRESIÓN) ");
		System.out.println("---->  " + String.join(" ", salida)+ "  <----");
		System.out.println("");
		
		
		 //el bucle se cumplirá mientras aciertos sean menor que 6 e intentos menor que 10.
		while (aciertos < 6 && intentos < intentosTotales) {
		
		System.out.println("Introduce la combinación que crees: ");
		numIntroducido= ent.nextInt();
		
		for (int i = 0; i < listaNumeros.length; i++) {
			
		    if (listaNumeros[i] == numIntroducido) {
		      salida[i] = String.valueOf(numIntroducido);
		      aciertos++;
		    }else if(listaNumeros[i]>numIntroducido){
		    	System.out.println("El número de la posición "+ (i+1)+ " es mayor." );
		    	
		    }else {
		    	System.out.println("El número de la posición "+ (i+1)+ " es menor." );
		    }
		    
		  }//fin for

		  //System.out.println(Arrays.toString(salida)); 
			System.out.println(String.join(" ", salida));
		  intentos++;
		  
		}//fin while

		
		if (aciertos == 6 ) {
		  System.out.println("¡Bravo!, ¿no te sientes Tom Cruise en Misión Imposible?");    
		} else {
			System.out.println("ñeeeeee... bueno la humanidad está sobrevalorada. La contraseña era: " + Arrays.toString(listaNumeros));	  
		}
		
		ent.close();
		
	}//fin main
	
	public static int [] DigitosAleatorios (int aleatorios) { //metodo que genera 6 numeros aleatorios.
		
		int[] digitos;
		digitos =new int [6];
		
		for(int i=0;i<digitos.length;i++) {
			
			digitos[i]=(int)(Math.random()*20)+1;
		}
		System.out.println(Arrays.toString(digitos)); 
		
		return digitos;
	}
	

}//fin class
