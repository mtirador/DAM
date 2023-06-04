package NavesEspaciales;

import java.util.ArrayList;
import java.util.Scanner;

public class TorreControl {

	public static void main(String[] args) {
	
		int opcion=0;
		Scanner ent=new Scanner(System.in);
		
		ArrayList<Naves>lista=new ArrayList<Naves>();
		
	//hacer validacion de si no mete si y que se repita 
	//que el nombre del piloto no este vacio
	//que la matricula sean 3 letras y 3 numeros
		
	//poner las naves
		
		Naves nave1 =new Naves("Luigi","2345bgf",false,2);
		Naves nave2= new Naves("Super Mario ", "2312bgf", false,2);
		Naves nave4=new Naves("Pablo","2567bgr",true,2);
		lista.add(nave1);
		lista.add(nave2);
		
		
		do{
			  
			System.out.println("BASE DE DATOS DE STAR WARS:");
			  System.out.println("1. LISTA NAVES");  
			  System.out.println("2. Aï¿½ADIR NAVES");
			  System.out.println("3. ELIMINAR");
			  System.out.println("0. Salir");
			  opcion = Integer.parseInt(ent.nextLine());
			  
		  switch (opcion) {
		   
		  case 1: listarNaves(lista);break;
			  
		  case 2: AñadirNaves(lista);break;
			  
		  case 3:break;
		  
		  default: System.out.println("No Opciones con esa accion"); break;
		
		    
		  }
		  

	}while(opcion !=4);
		
		
		

	}//fin main
	
	public static void listarNaves(ArrayList<Naves>lista) {
		
		System.out.println("Mostrar clientes");
		
	
		
		 for(Naves n:lista) {
			
			 System.out.println(n.toString());
		 }
	
		 
	 }
		
			 
	 public static void AñadirNaves(ArrayList<Naves>lista) {
		 
		 Naves nave3=new Naves();
		 int id;
		 String piloto;
		 String matricula;
		 boolean guerra = false;
		 double precio;
		 String validacion;
		 
		 Scanner ent=new Scanner(System.in);
		 
		 System.out.println("Ingrese un piloto");
		 piloto=ent.nextLine();
		 
		 System.out.println("Ingrese matricula");
		 matricula=ent.nextLine();
		 
		 System.out.println("ï¿½Hay guerra?");
		 validacion=ent.nextLine();
		 if(validacion.toUpperCase().charAt(0)=='S') {
			guerra=true; 
			System.out.println("Hay guerra");
		 }else if(validacion.toUpperCase().charAt(0)=='N') {
			 guerra=false;
			 System.out.println("Paz");
		 }
		 
		 
		 System.out.println("ï¿½Cuï¿½l es el precio?");
		 precio=ent.nextDouble();
		 
		 lista.add(new Naves(piloto,matricula,guerra,precio));
		 
		
	}
	 
	 public static void eliminarNave(ArrayList<Naves>lista) { 
		 
		 Scanner ent=new Scanner(System.in);
		 //cuando recorra la lista elijo el id y luego comparo con la lista y eliminar con remove
		 int cont;
		 int deleteN=0;
		 deleteN = Integer.parseInt(ent.nextLine());
		  
		 System.out.println("Eliminar nave, Introduzca el id");
		 
		 for(int i=0;i<lista.size();i++) {
			 
			 if(lista.get(i).getId()==deleteN) {     
				 lista.remove(i);
			 }
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
	 }
	
	
	

}//fin class
