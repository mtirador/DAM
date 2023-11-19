package BancoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentasClientes {

	public static void main(String[] args) {
		
		
		//listar,ingresar,retirar
		
		ArrayList<Banco>clientes=new ArrayList<Banco>();
		
		clientes.add(new Banco("Jose",50.00));
		clientes.add(new Banco("Laura", 3000.00));
		clientes.add(new Banco("Marta", 2500.00));
		clientes.add(new Banco("Susana",1000.00));
		clientes.add(new Banco("Macarena",60000.00));
		
		int opcion=0;
		
		Scanner ent= new Scanner(System.in);
		
		do {
			
			System.out.println(" Liberbank");
			System.out.println(" 1. lista de clientes");
			System.out.println(" 2. ingresar ");
			System.out.println(" 3. retirar dinero");
			System.out.println(" 0. Salir");
			opcion=Integer.parseInt(ent.nextLine());
			
			
			switch(opcion) {
			
			case 0: System.out.println("Hasta Pronto ");break;
			case 1: listaClientes(clientes);break;
			case 2: ingresarDinero(clientes);break;
			case 3: retirardinero(clientes);break;
			default: System.out.println("No hay opción.");break;
			
			
			
			
			}
			
			
			
			
		}while(opcion!=0);

	}

	public static void listaClientes(ArrayList<Banco> clientes) {
		for(Banco cli:clientes) {
			System.out.println(cli);
		}
		
	}

	public static void ingresarDinero(ArrayList<Banco> clientes) {
		String nombre="";
		Scanner ent=new Scanner(System.in);
	
		
		System.out.println("Seleccione el titular del banco");
		nombre=ent.nextLine();
		for(Banco cli:clientes) {
			if(cli.getTitular().equalsIgnoreCase(nombre)) {
				System.out.println("cliente seleccionado: "+ nombre);
				System.out.println("¿importe a ingresar?");
				System.out.println(cli.mensajeIngresar(ent.nextDouble()));
				
			}
		}
		
	}

	public static void retirardinero(ArrayList<Banco> clientes) {
		String nombre="";
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Seleccione el titular del banco");
		nombre=ent.nextLine();
		
		for(Banco cli:clientes) {
			if(cli.getTitular().equalsIgnoreCase(nombre)) {
				System.out.println("cliente seleccionado: " + nombre);
				System.out.println("¿importe a retirar?");
				System.out.println(cli.mensajeRetirar(ent.nextDouble()));
			}
		}
		
	}

}
