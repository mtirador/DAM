package amachonNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Marta
 * @version
 */

public class CestaAmachon {
	
	public static void main(String[]args) {
		
		//Declaramos una lista de tipo Arraylist
		
		 ArrayList<Productos>lista = new ArrayList <Productos>() ;
		int opcion=0;
		Scanner ent=new Scanner(System.in);
		
	
		
		//Creamos un producto con todos los argumentos
		
		//Productos colchon = new Productos("Colchon","Muy comodo",Categorias.CATB,5,650.95); 
		//Productos lavadora= new Productos("Lavadora","Balay",Categorias.CATB,1,699.00);
		
		
		
		//aï¿½adir Productos (colchon) a la lista
		//lista.add(colchon); 
		//lista.add(lavadora);
		
		/*System.out.println("Introduzca Unidades");
		if(Validaciones.validarUnidades(0)) {
			lista.get(0).setCantidad(3);
		}else {
			System.out.println("unidades incorrectas");
		}*/
		//System.out.println(lista.size());//para saber el tamaï¿½o
		//System.out.println(lista.get(0));//para saber el indice
		//System.out.println(colchon.getNombre());
		
		
		do {
			
			System.out.println("Menu de opciones:");
			System.out.println("[1]Lista de Deseos");
			System.out.println("[2]Añadir");
			System.out.println("[3]Eliminar");
			System.out.println("[4]Modificar");
			System.out.println("[0]Salir");
			try {
			opcion =Integer.parseInt(ent.nextLine());
			}catch(NumberFormatException ex) {
				System.out.println("error");
				opcion=99; //meter un valor 99  que no es valido a la opcion para que no se pare en salir.
			}
			switch(opcion) {
			
				case 1:listaDeseos(lista);break;
				case 2:añadirObjetos(lista);break;
				case 3:eliminarObjetos(lista);break;
				case 4:modificarObjetos();break;
				case 0:System.out.println("Hasta Pronto");break;
				default:System.out.println("ERROR");
		
			
			}
		
			
			
		}while(opcion!=0);
		

	}//fin main
	
	//
	public static void listaDeseos(ArrayList<Productos> lista) {
		 System.out.println("Mostrar lista de deseos"); 
		 System.out.println("Cesta con: " + lista.size()+ "producto/s");
		 
			for (Productos producto : lista) {
		        System.out.println(producto.toString());
		    }
		 	
		
			
			/*for(int i=0;i<lista.size();i++) {
				System.out.println(lista.get(i));
			}*/
		
	}
	
	public static void añadirObjetos(ArrayList<Productos>lista) {
		
		Scanner ent = new Scanner(System.in);
		String nombre="",desc="",entCat="";
		float cant=0.0f;
		double precio=0.0;
		Categorias cat=null;
		boolean sinErrores=true,salir=false;
		
		do {
		sinErrores=true;
		System.out.println("Introduce el nombre del producto(introduzca salir para parar)");
		nombre=ent.nextLine().trim();
		if(nombre.equalsIgnoreCase("salir")) {
			System.out.println("Adios");
			sinErrores=false;
			salir=true;
		}else if(!Validaciones.validarString(nombre, 25)) {
			System.out.println("nombre no puede ser vacio o mas de 25 letras");
			sinErrores=false;
			
		}
		
		}while(!sinErrores && !salir);/*creamos clase validaciones y
		 hacemos metodos para validar las entradas por teclado*/
	
		
		
	if(!salir) { 
		
		//control descripcion
		 
		do {
			System.out.println("Introduce la descripcion o(introduzca salir para parar)");
			desc=ent.nextLine();
			if(desc.equalsIgnoreCase("salir")) {
				sinErrores=false;
				salir=true;
				System.out.println("adios");
			}else if(!Validaciones.validarString(desc,50)) {
				System.out.println("La descripcion no puede ser vacio o mas de 50 letras");
				sinErrores=false;
			}
		
			
		}while(!sinErrores && !salir);
	}
	
	
	//control de la categoria del producto
	if(!salir) {
		
		
		do {
			
			//Categorias[]listaCategorias=Categorias.values();
			System.out.println("Introduce la categoria del producto o (introduzca salir para parar)");
			for(int i=0; i< Categorias.values().length;i++) {
				System.out.println((i+1)+ ") "+ Categorias.values()[i]);     //esto es importante
			}
			System.out.println("Introduce Categoria del producto:");
			entCat=ent.nextLine().toUpperCase().replace("ï¿½","I");
			if(Validaciones.chkCategorias(entCat)!=null) {
				cat=Validaciones.chkCategorias(entCat);
			}else if(entCat.equals("salir")){
				salir=true;
				sinErrores=false;
			}else{
				
				System.out.println("Categoria incorrecta");
				sinErrores=false;
			}
			
			
			
			
		}while(!sinErrores && !salir);
		
		
	}
		
		
	if(sinErrores) {
		lista.add(new Productos(nombre,desc,null,cant,precio));
	}
	
	
	
	}
	
	
	public static void eliminarObjetos(ArrayList<Productos>lista) {
		
		 Scanner ent=new Scanner(System.in);
		 //cuando recorra la lista elijo el id y luego comparo con la lista y eliminar con remove
		 int cont;
		 int deleteN=0;	 
		 System.out.println("Eliminar producto, Introduzca el id");
		 deleteN = Integer.parseInt(ent.nextLine());
		  
	
		 
		 for(int i=0;i<lista.size();i++) {
			 
			 if(lista.get(i).getId()==deleteN) {     
				 lista.remove(i);
			 }
			 
		 }
		 
	}
		 	 
	
	
	public static void modificarObjetos() {
		
	}
	

}//fin class
