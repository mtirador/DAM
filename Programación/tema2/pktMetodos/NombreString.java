package pktMetodos;
import java.util.Scanner;

public class NombreString {
	public static void main(String[]args) {
		/* mediante un metodo utilizar la variable nombre */
		
		Scanner ent=new Scanner(System.in);
		String nombre= " ";
		
		
		System.out.println(" Introduce el nombre ");
		nombre =ent.nextLine();
		
		
		saludar(nombre);
		
		
		String salida = saludar1(nombre);
		System.out.println(salida);
		
		
		
		
		
		
	
	}//fin del main
	
	public static void saludar(String name) {
		
		System.out.println(" Buenos Dias, " + name);
		
	}

	
	
	public static String saludar1(String name) {
		
		String  saludo ="Buenos dias";
		
		saludo = saludo + " " + name;
		
		return saludo;
		
		
		
	}
	
	
	
	
}
