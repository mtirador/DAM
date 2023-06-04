package pktClases_Objetos;

import java.util.Scanner;

public class MenúBanco {

	public static void main(String[] args) {
		

		//clientes que vamos a tener en CuentaCorriente
		
		CuentaCorriente[] clientes= new CuentaCorriente[5];
		
		double saldoTotal=0;

		
		clientes[0]=new CuentaCorriente("Saul");
		clientes[1]=new CuentaCorriente("Andres");
		clientes[2]=new CuentaCorriente("Marta");
		clientes[3]=new CuentaCorriente("Irene",55);
		clientes[4]=new CuentaCorriente("Constantin");
		
		
	
		
		int opcion=5;
		Scanner ent=new Scanner(System.in);
		
		
		
		  
			do{
			  
				System.out.println("Menï¿½ de opciones:");
				  System.out.println("1. Clientes");
				  System.out.println("2. Ingresos de dinero");
				  System.out.println("3. Retiradas de dinero");
				  System.out.println("4. Transferencias");
				  System.out.println("5. Salir");
				  opcion = ent.nextInt();
				  
			  switch (opcion) {
			   
			    
			    case 1:listarClientes(clientes); break;
			    case 2: ingresar(clientes); break;
			    case 3: retirar(clientes);break;
			    case 4: transferencia(clientes);break;
			    case 5: System.out.println("Adios"); break;
			    default: System.out.println("ERROR");break;
			    
			  }
			  

		}while(opcion !=5);
			

	}//fin main
	
	public static void listarClientes(CuentaCorriente[] lista) {
		
		for(CuentaCorriente cli:lista) {
			System.out.println(cli);
		}
	
	}
	
	
	public static void ingresar(CuentaCorriente[]lista) {
		Scanner ent = new Scanner(System.in);
		String nombre="";
		System.out.println("Introduce el nombre del titular");
		nombre=ent.nextLine();
		
		for(CuentaCorriente cli:lista) {
			if(cli.getTitular().equalsIgnoreCase(nombre)) {
				System.out.println("Importe a ingressar");
				System.out.println(cli.ingresarInfo(ent.nextDouble()));
				break;
			}
		}
	}
	
	
	public static void retirar(CuentaCorriente[]lista) {
		Scanner ent=new Scanner(System.in);
		String nombre="";
		System.out.println("Introduce el nombre del titular");
		nombre=ent.nextLine();
		
		for(int i=0; i<lista.length;i++) {
			if(lista[i].getTitular().equalsIgnoreCase(nombre)) {
				System.out.println("Importe retirar");
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
		
		System.out.println(" ï¿½Cuï¿½nto quiere transferir? ");
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
	
}//fin class
