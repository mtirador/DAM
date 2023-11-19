package AmachonVarito;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Alvaro
 * @version 1.0
 * 
 */

/* 0- SALIR
 * 1- LISTAR PRODUCTOS
 * 2- AÑADIR
 * 3- ELIMINAR
 * 4- MODIFICAR
 * 5- MISTERY BOX (x articulos --> con un max de precio)
 */



public class Cesta_Amachon {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resp = "", modif="";
		int option=0, deleteP=0, modific=0;
		
		ArrayList <Productos> lista = new ArrayList <Productos>();	//Declaración de ArrayList
		
		Productos colchon = new Productos("Colchon", "Muy comodo", Categorias.CatA, 10, 399.89);
		Productos ordenador = new Productos("Ordenador", "Gaming", Categorias.CatB, 4, 2000);
		lista.add(colchon);
		lista.add(ordenador);
		
		
		System.out.println("Bienvenido a Amachon");
		do {
			System.out.println("Que desea hacer?" + "\n" + "-Pulse '1' para listar los productos." + "\n"
					+ "-Pulse '2' para anadir un producto." + "\n" + "-Pulse '3' para eliminar un producto." + "\n" + "-Pulse '4' para modificar un producto." + "\n"
					+ "-Pulse '5' para obtener una Mistery Box." + "\n" + "-Pulse '0' para salir." + "\n"
					+ "- - - - - - - - - - - - - - - - - - - -");
			
			try {
				option=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				option=99;
			}
			
			
			switch(option) {
			
			case 0:
				System.out.println("Has salido.");
				break;
				
			case 1:
				System.out.println(lista.toString().replace("[", "").replace("]", "").replace(",", "\n"));
				break;
				
			case 2:
				addProducto(lista);
				break;
				
			case 3:
				System.out.println("Que producto desea borrar? Introduzca su ID");
				System.out.println(lista.toString().replace("[", "").replace("]", "").replace(",", "\n"));
				deleteP=Integer.parseInt(sc.nextLine());
				
				for(int i=0; i<lista.size(); i++) {
					if(lista.get(i).getId()==deleteP) {
						lista.remove(i);
					}
				}
				break;
				
			case 4:
				System.out.println(lista.toString().replace("[", "").replace("]", "").replace(",", "\n"));
				System.out.println("Que producto desea modificar?");
				modific=(Integer.parseInt(sc.nextLine()));
				
				for(int i=1; i<=lista.size(); i++) {
						System.out.println("Que desea modificar? (ID, NOMBRE, DESCRIPCION, PRECIO, STOCK, CATEGORIA O SALIR)");
						modif=sc.nextLine();
						
						if(modif.equalsIgnoreCase("id")) {
							System.out.println("Introduzca el nuevo ID");
							lista.get(i).setId(Math.abs(Integer.parseInt(sc.nextLine())));
							break;
						}else if(modif.equalsIgnoreCase("nombre")) {
							System.out.println("Introduzca el nuevo nombre");
							lista.get(i).setNombre(sc.nextLine());
							break;
						}else if(modif.equalsIgnoreCase("descripcion")){
							System.out.println("Introduzca la nueva descripcion");
							lista.get(i).setDesc(sc.nextLine());
							break;
						}else if(modif.equalsIgnoreCase("precio")) {
							System.out.println("Introduzca el nuevo precio");
							lista.get(i).setPrecio(Math.abs(Double.parseDouble(sc.nextLine())));
							break;
						}else if(modif.equalsIgnoreCase("stock")){
							System.out.println("Introduzca el nuevo stock");
							lista.get(i).setCant(Math.abs(Integer.parseInt(sc.nextLine())));
							break;
						}else if(modif.equalsIgnoreCase("categoria")){
							System.out.println("Introduzca la nueva categoria (CatA, CatB, CatC)");
							lista.get(i).setCate(Categorias.valueOf(sc.nextLine()));
							break;
						}else if(modif.equalsIgnoreCase("salir")){
							System.out.println("Has salido");
							break;
						}else {
							System.out.println("No hay ninguna caracteristica con ese nombre.");
						}
				}
				break;
				
			case 5:
				System.out.println("Mistery Box proximamente.");
				break;
			
			default: 
				System.out.println("No hay opciones con esa accion");
				break;
			}
			System.out.println("Desea continuar? (SI/NO)");
			resp=sc.nextLine();
		}while(resp.equalsIgnoreCase("SI") && option!=0);
		
		
		sc.close();
	}
	
	private static void addProducto(ArrayList <Productos> lista) {
		Scanner sc = new Scanner(System.in);
		
		String nombre="", desc="", entTeclado="";
		double precio=0;
		int stock=0;
		float cant=0f;
		boolean sinErrores=true, salir=false;
		Categorias cate = null;
		
		do {
			sinErrores=true;
			System.out.println("Introduzca el nombre del producto (o 'salir' para parar)");
			nombre = sc.nextLine().toLowerCase().trim();
			if(nombre.equalsIgnoreCase("salir")) {
				System.out.println("Adios");
				sinErrores=false;
				salir=true;
			}else if(!Validaciones.validarString(nombre, 20)) {
				System.out.println("(El nombre no puede ser nulo ni puede tener mas de 20 caracteres) \n");
				sinErrores=false;
			}
		}while(!sinErrores && !salir);
		
		if(!salir) {
			do {
				System.out.println("Introduzca una descripcion (o 'salir' para parar)");
				desc=sc.nextLine();
				if(desc.equalsIgnoreCase("salir")) {
					System.out.println("Adios");
					sinErrores=false;
					salir=true;
				}else if(!Validaciones.validarString(desc, 100)) {
					System.out.println("(La descripcion no puede ser nula ni puede tener mas de 100 caracteres) \n");
					sinErrores=false;
				}
				
			}while(!sinErrores && !salir);
		}
		
		
		if(!salir) {
			do {
				for(int i=0; i<Categorias.values().length;i++) {
					System.out.println((i+1)+ "-) "+ Categorias.values()[i]+"\n");
				}
				System.out.println("Introduzca la categoria del producto: ");
				entTeclado = sc.nextLine().toUpperCase().replace("Í","I");
				if(Validaciones.chkCategorias(entTeclado)!= null) {
					cate= Validaciones.chkCategorias(entTeclado);
					sinErrores=true;
				}else if(!entTeclado.equalsIgnoreCase("salir")){
					salir=true;
					sinErrores=false;
				}else{
					System.out.println("Categoria Incorrecta"); 
					sinErrores=false;
				}
				
				
			}while(!sinErrores && !salir);
		}
		
		
		//Control de las unidades
		if (!salir) {
			do {
				System.out.println("Cuantas unidades desea? Introduzca salir para parar");
				try {
					entTeclado=sc.nextLine().replace(',', '.');
					cant = Math.abs(Float.parseFloat(entTeclado));
					sinErrores=true;
					if(cant==0) {
						System.out.println("Tiene que ser mayor que 0");
						sinErrores=false;
					}
				}catch(NumberFormatException e){
					if(entTeclado.equalsIgnoreCase("salir")) {
						salir=true;
					}else {
						System.out.println("Introduzca un numero, no se admiten letras.");
						sinErrores=false;
					}
				}
			
			}while(!sinErrores && !salir);
		}
		
		
		if (!salir) {
			do {
				System.out.println("Que precio tiene el producto? Introduzca salir para parar");
				try {
					entTeclado=sc.nextLine().replace(',', '.');
					precio = Math.abs(Double.parseDouble(entTeclado));
					sinErrores=true;
					if(precio==0) {
						System.out.println("Tiene que ser mayor que 0");
						sinErrores=false;
					}
				}catch(NumberFormatException e){
					if(entTeclado.equalsIgnoreCase("salir")) {
						salir=true;
					}else {
						System.out.println("Introduzca un numero, no se admiten letras.");
						sinErrores=false;
					}
				}
			
			}while(!sinErrores && !salir);
		}
		
		
		
		if(sinErrores==true) {
			lista.add(new Productos(nombre, desc, cate, cant, precio));
		}
	}
}  