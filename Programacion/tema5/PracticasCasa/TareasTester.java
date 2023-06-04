package PracticasCasa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TareasTester {

	public static void main(String[] args) {

		ArrayList<Tareas> lista = new ArrayList<Tareas>();
		

		Scanner ent = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("Menu de opciones");
			System.out.println("[1]-->Añadir Tareas");
			System.out.println("[2]-->Listar Tareas");
			System.out.println("[3]-->Eliminar una Tarea de la lista");
			System.out.println("[4]-->Mostrar tareas que se encuentren en un rango de fechas especificado por el usuario");
			System.out.println("[5]-->Mostrar las tareas por orden de prioridad");
			System.out.println("[0]--> Salir");
			
			System.out.println("Ingrese la opcion");
			opcion=Integer.parseInt(ent.nextLine());
			

			switch (opcion) {

			case 1:añadirTarea(lista);break;
			case 2:listarTareas(lista);break;
			case 0 :System.out.println("Hasta Pronto");break;
			default:System.out.println("Esa opcion no se encuentra en el menú");break;
			}

		} while (opcion !=0);
		

	}

	public static void añadirTarea(ArrayList<Tareas> lista) {
		Scanner ent=new Scanner(System.in);
		String descripcion="";
		LocalDate finicio=null;
		LocalDate ffinal=null;
		String dificultad="";
		
		System.out.println("Ingrese la descripcion de la tarea ");
		descripcion=ent.nextLine();
		System.out.println("Ingrese la fecha de inicio de la tarea yyyy-mm-dd");
		finicio=LocalDate.parse(ent.nextLine());
		System.out.println("Ingrese la fecha de fin de la tarea yyyy-mm-dd");
		ffinal=LocalDate.parse(ent.nextLine());
		System.out.println("Ingrese la dificultad");
		dificultad=ent.nextLine();
		
		lista.add(new Tareas(descripcion,finicio,ffinal,dificultad));
		
	
		

	}

	public static void listarTareas(ArrayList<Tareas> lista) {
		System.out.println("Mostrar las tareas");
		for (Tareas cositas : lista) {
			System.out.println(cositas.ToString());
		}

	}

}
