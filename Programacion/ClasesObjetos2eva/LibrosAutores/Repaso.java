package LibrosAutores;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		
		
		//instancia objeto autores con el con parametros
		
	//	String nombre,apellidos;
	//	int numObras;
	//	Autores tolkien=new Autores();
		
		//System.out.println(tolkien.getNombre()+ " "+ tolkien.getApellido());
		
	/*	Scanner ent= new Scanner(System.in);
		
		System.out.println("Introduce los datos de un autor ");
		nombre=ent.nextLine();
		
		System.out.println("Apellidos");
		apellidos=ent.nextLine();
		
		System.out.println("Numero de obras");
		numObras=ent.nextInt();
		
		Autores cervantes =new Autores(nombre,apellidos,numObras);
		System.out.println(cervantes);
*/
		
		
		
		Libros lib = new Libros();
		Autores aut = new Autores();
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduzca los datos de un libro: \n ISBN");
		lib.setisbn(ent.nextInt());
		ent.nextLine();	
		System.out.println("Titulo");
		lib.setlibro(ent.nextLine());
	
		System.out.println("Nombre");
		aut.setNombre(ent.nextLine());
		System.out.println("Apellido");
		aut.setApellido(ent.nextLine());
		System.out.println("Obras");
		aut.setNumObras(ent.nextInt());
		ent.nextLine();
		lib.setAutor(aut);
		
		System.out.println("¿Tiene Tapadura?");
		if(ent.nextLine().toUpperCase().charAt(0)=='S') {
			lib.settapadura(true);
		}else {
			lib.settapadura(false);
		}
		
		
		System.out.println("¿Que precio tiene?");
		lib.setPrecio(ent.nextFloat());
		System.out.println("***********************************\n\n");
		System.out.println(lib);
		
		
		
		
		
		
		
		
		
		
	}

}
