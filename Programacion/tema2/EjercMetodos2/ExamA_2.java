package EjercMetodos2;
import java.util.Scanner;

public class ExamA_2 {

	public static void main(String[] args) {

/*2º) Crear un programa en Java que permita la entrada de un número por
la consola y mediante un método este nos devuelva la vocal
correspondiente si a=1, e=2, i=3, o=4, u=5 para mostrar por pantalla el
número y el carácter. El programa se ha de ejecutar mientras el usuario no
indique lo contrario, para ello aplicaremos lo necesario que permita que
se repita la ejecución y pare al preguntar si desea continuar. (4 ptos).*/
		
		int numero;
		String entrada= " ";
		boolean respuesta=true;
		
	do {	
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingrese un numero ");
		numero=ent.nextInt();
	
		if(numero >=1 && numero <=5) {
			System.out.println(numero+ "---->"+ vocal(numero) );	
		}else {
			System.out.println("valor incorrecto (1-5) ");
		}
		System.out.println("¿DESEA CONTINUAR? ");
		entrada= ent.next();
		
		if(entrada.equalsIgnoreCase("si")){
			respuesta=true;
		}else {
			respuesta=false;
		}
		
		


	}while(respuesta);

	}//fin del main
	
	
	public static char vocal(int num) {
		
	char letra = ' ';
	
	
	switch(num) {
	
	case 1: letra='a'; break;
	case 2: letra='e';break;
	case 3: letra='i';break;
	case 4: letra='o';break;
	case 5: letra='u';break;
	default:
		System.out.println("NO ES EL NUMERO QUE BUSCAMOS ");
		break;
		
	}
		
			
	return letra;	
	}

}
