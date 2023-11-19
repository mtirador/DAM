package pktClases_Objetos;

import java.util.Scanner;

public class MiBancoRepaso {

	public static void main(String[] args) {
		
		CuentaCorriente[] clientes=new CuentaCorriente[5];
		
		clientes[0]=new CuentaCorriente("Marta",100);
		clientes[1]=new CuentaCorriente("Andres",10);
		clientes[2]=new CuentaCorriente("Victor",50);
		clientes[3]=new CuentaCorriente("Pablo",150);
		clientes[4]=new CuentaCorriente("Javier",200);
		
		Scanner ent=new Scanner(System.in);
		int opcion=0;
		
		do {
			
			System.out.println("Bienvenido a Caja Cantabria");
			System.out.println("lista de clientes[1]");
			System.out.println("Ingresar clientes[2]");
			System.out.println("Ingresar Saldo[3]");
			System.out.println("Retirar Saldo[4]");
			System.out.println("Transferencia [5]");
			System.out.println("Salir[0]");
			opcion=Integer.parseInt(ent.nextLine());
			switch(opcion) {
			
			case 1: listarClientes(clientes);break;
			case 2: ingresarClientes(clientes); break;
			case 3: ingresarSaldo(clientes);break;
			case 4: retirarSaldo(clientes);break;
			case 5: transferencia(clientes);break;
			case 0:System.out.println("salir");break;
			default: System.out.println("Esa Opción no es Válida");break;
			
			
			}
				
			
		}while(opcion!=0);

	}
	


	public static void listarClientes(CuentaCorriente lista[]) {
		
		for(CuentaCorriente cli:lista) {
			System.out.println(cli);
			
		}
		
	}
	
	
	// si hago este método no puedo usar el de transferencia (preguntar a manu)
	public static void ingresarClientes(CuentaCorriente[] lista) {
		Scanner ent=new Scanner(System.in);
		
		String titular="";
		double saldo=0.0;
		
		System.out.println("Ingrese el nuevo Titular de la Cuenta:");
		titular=ent.nextLine();
		System.out.println("Ingrese el saldo del titular");
		saldo=ent.nextDouble();
		ent.nextLine();
		
		//hago éste arreglo para que cuando busque en mi Array un hueco libre agregar al cliente
		for (int i = 0; i < lista.length; i++) {
		    if (lista[i] == null) {
		        lista[i] = new CuentaCorriente(titular, saldo);
		        System.out.println("El cliente " + titular + " ha sido agregado.");
		        break;
		    }
		}
		
		
	}
	
	public static void ingresarSaldo(CuentaCorriente lista[]) {
		Scanner ent=new Scanner(System.in);
		String titular="";
		double saldo=0.0;
		System.out.println("Introduce el nombre del titular");
		titular=ent.nextLine();
		
		for(CuentaCorriente cli:lista) {
			if(cli.getTitular().equalsIgnoreCase(titular)) {
				System.out.println("Importe a ingresar");
				System.out.println(cli.ingresarInfo(ent.nextDouble()));
				break;
			}
		}
	}
	
	
	public static void retirarSaldo(CuentaCorriente lista[]) {
		Scanner ent=new Scanner(System.in);
		String titular="";
		double saldo=0.0;
		System.out.println("Introduce el nombre del titular");
		titular=ent.nextLine();
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i].getTitular().equalsIgnoreCase(titular)) {
				System.out.println("Importe a retirar");
				System.out.println(lista[i].retirarInfo(ent.nextDouble()));
				break;
			}
			
		}
			
			
	}
	
	public static void transferencia(CuentaCorriente[]lista) {
		Scanner ent=new Scanner(System.in);
		String titular="";
		double cantidad=0;
		CuentaCorriente origen=null, destino=null;
		
		System.out.println("Introduce la cuenta origen");
		origen=buscarCuentaCorriente(ent.nextLine(),lista);
		
		System.out.println("Introduzca la cuenta destino de la transferencia");
		destino=buscarCuentaCorriente(ent.nextLine(),lista);	
		
		System.out.println(" ¿Cuánto quiere transferir? ");
		cantidad=ent.nextDouble();
		
		if(origen!=null && destino!=null) {
			if(!origen.retirarInfo(cantidad).contains("no se permites")) {
				destino.ingresarInfo(cantidad);
				System.out.println("Ingreso de "+ cantidad+ " realizado");
				System.out.println(origen);
				System.out.println(destino);	
			}else {
				
			System.out.println("Cantidad incorrecta o saldo insuficiente");
			
			}
		
		}else {
			System.out.println("No existe uno de los titulares");
		}
	}
	
	public static CuentaCorriente buscarCuentaCorriente(String titular,CuentaCorriente[] lista) {
		
		CuentaCorriente cliente=null;
		
		for (CuentaCorriente cli:lista) {
			if(cli.getTitular().equalsIgnoreCase(titular)) {
				cliente=cli;
				
			}
			
		}
		
		return cliente ;
		
	}
	
}