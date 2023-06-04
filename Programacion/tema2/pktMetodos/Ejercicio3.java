package pktMetodos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*3¬∫) Crear un programa que contenga un m√©todo al cual le pasamos 3
par√°metros enteros introducidos por teclado (d√≠a, mes y a√±o). El m√©todo
deber√° devolver al main si la fecha es v√°lida o no en formato booleano (si
los d√≠as y los meses existen, ejemplo 31 de febrero no existe). En caso que
no sea v√°lida, el programa deber√° repetirse hasta que se introduzca una
fecha v√°lida. Si es v√°lida, se llamar√° a otro m√©todo que muestre la fecha
construida en el formato (4 ptos):*/
		
		int dia=0, mes= 0, aÒo=0;
		
		do {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce dia ");
		dia=ent.nextInt();
		System.out.println("introduce mes ");
		mes=ent.nextInt();
		System.out.println("introduce a√±o ");
		aÒo=ent.nextInt();
		
		}while (validarFecha(dia,mes,aÒo)==false); // (!validarFecha(dia,mes,a√±o);
		
		mostrarFecha(dia,mes,aÒo);
		
		
		
	}//fin main
	
	public static boolean validarFecha (int dia, int mes , int aÒo) {
		
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
	
	public static void mostrarFecha(int dia, int mes,int aÒo) {
		
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
		if(aÒo <0) {
			salida += "  de " + Math.abs(aÒo)+" A.C";
		}else {
			salida += " de " + aÒo + "D.C";
		}
		
		System.out.println(salida);
		
	}

}
