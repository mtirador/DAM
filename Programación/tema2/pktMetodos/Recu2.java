package pktMetodos;

import java.util.Scanner;

public class Recu2 {

public static void main(String[]args) {
		
		/*construir un prorama en el que se introducita una frese cualquiera
		 * si lafrase no es terminar, el programa pedira otra frase maws asi hasta
		 * que se escriba terminar.alfinal se debe mostrar la frase  mas larga de todo
		 * ibtroducida"
		 */
		
		boolean continuar=true;
		String frase=" ";
		String fraseLarga="";
		Scanner ent =new Scanner(System.in);
		
		
		do {
			
			
		System.out.println("Ingresar frase ");
		frase=ent.nextLine();
		
		if(!frase.equalsIgnoreCase("Terminar")) {     
			continuar=false;     //un if es el primero true, puedes añadir un break para romper
			System.out.println(continuar);
			
		}else {
			continuar=true;
		}
		
			
		if(frase.length()>fraseLarga.length()) {    
			fraseLarga=frase;
			System.out.println(fraseLarga);
			
		}else{
			
					
		}

		
		}while(continuar==false);
		

				
		
		System.out.println("La frase mas larga es ... " + fraseLarga);
		
		
		
	}//fin main


	
	
	
	
	
	
	

}