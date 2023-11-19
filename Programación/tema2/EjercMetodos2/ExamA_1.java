package EjercMetodos2;
import java.util.Scanner;

public class ExamA_1 {

	public static void main(String[] args) {
		/*1º) Crear un programa en Java que permita leer de la entrada estándar
una frase introducida por el usuario y muestre por consola los caracteres
de la frase y su correspondiente valor ASCII. (2 ptos).*/
		
		String frase = " ";
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese una frase");
		frase=ent.nextLine();
		
		for(int i=0; i<frase.length();i++) {
			
			System.out.println(i+ "---"+ frase.charAt(i)+"----"+ (int)frase.charAt(i));
			
			
			
			
		}
	
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}//fin main	
		
}