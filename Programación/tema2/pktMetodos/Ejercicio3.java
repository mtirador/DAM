package pktMetodos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*3º) Crear un programa que contenga un método al cual le pasamos 3
parámetros enteros introducidos por teclado (día, mes y año). El método
deberá devolver al main si la fecha es válida o no en formato booleano (si
los días y los meses existen, ejemplo 31 de febrero no existe). En caso que
no sea válida, el programa deberá repetirse hasta que se introduzca una
fecha válida. Si es válida, se llamará a otro método que muestre la fecha
construida en el formato (4 ptos):*/
		
		int dia=0, mes= 0, a�o=0;
		
		do {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce dia ");
		dia=ent.nextInt();
		System.out.println("introduce mes ");
		mes=ent.nextInt();
		System.out.println("introduce año ");
		a�o=ent.nextInt();
		
		}while (validarFecha(dia,mes,a�o)==false); // (!validarFecha(dia,mes,año);
		
		mostrarFecha(dia,mes,a�o);
		
		
		
	}//fin main
	
	public static boolean validarFecha (int dia, int mes , int a�o) {
		
		boolean valida = true;
		
		if(( mes == 4 || mes==6 || mes ==9 || mes==11) && (dia < 1 || dia >30)){
			valida=false;
		}else if((mes == 2) && (dia <1 || dia >28)){
			valida = false;
			
		}else if ((mes==1 || mes ==3 || mes==5 ||mes ==7 || mes==10 || mes ==12) && (dia <1 || dia>31)){
			valida = false;
		}
		
		
		
		return valida;
		
	}
	
	public static void mostrarFecha(int dia, int mes,int a�o) {
		
		String salida = String.valueOf(dia);
		
		switch(mes) {
		
		case 1: salida +="enero"; break;
		case 2: salida +="febrero"; break;
		case 3: salida +="marzo"; break;
		case 4: salida +="abril"; break;
		case 5: salida +="mayo"; break;
		case 6: salida +="junio"; break;
		case 7: salida +="julio"; break;
		case 8: salida +="agosto"; break;
		case 9: salida +="septiembre"; break;
		case 10: salida +="octubre"; break;
		case 11: salida +="noviembre"; break;
		case 12: salida +="diciembre"; break;
		
		
		
		}
		if(a�o <0) {
			salida += "  de " + Math.abs(a�o)+" A.C";
		}else {
			salida += " de " + a�o + "D.C";
		}
		
		System.out.println(salida);
		
	}

}
