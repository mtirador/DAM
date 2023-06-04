package amachonNew;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
	public static void main(String[]args) {
		
		
	/*	//asi se instaciarian uno a uno
		//Productos pan=new Productos();
		//Productos leche=new Productos();
		
		ArrayList<Productos>lista=new ArrayList<Productos>();
		//añadir otro producto
		Productos p=new Productos();
		
		
		
		p.setNombre("Colchon");
		lista.add(p);
		
		//añadir otro producto
		p=new Productos();
		p.setNombre("Colchon2");
		lista.add(p);
		lista.get(0).setNombre("liada");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		*/
		
		
		ArrayList<Productos>miLista=new ArrayList<>();
		String[] array=new String[5];
		
		
		//Productos p = new Productos();	
		//Productos p1=new Productos("Portatil","MSI",Categorias.CATB,1,2999.50);
		miLista.add(new Productos("Portatil","MSI",Categorias.CATB,1,2999.50));
		
		/*Productos p2=new Productos();
		p2.setNombre("Portatil");
		miLista.add(p2);
		p2.setDescripcion("Gaming");
		p2.setCantidad(8);
		p2.setCate(Categorias.CATB);
		p2.setId(0);
		p2.setPrecio(1500);
		
		miLista.add(p2);*/
		miLista.add(new Productos("Portatil","MSI",Categorias.CATB,2,2999.50));
		miLista.add(new Productos("Sobremesa","HP",Categorias.CATB,1,2000.50));
		miLista.add(new Productos("Raton","MSI",Categorias.CATB,5,1500));
		miLista.add(new Productos("Teclado","MSI",Categorias.CATB,1,3000));
		
		for (Productos prod:miLista) {
			System.out.println(prod);
			
		}
		
		for(int i=0; i<miLista.size();i++) {
			//System.out.println(miLista.get(i));
			System.out.println(miLista.get(i).getNombre()+"Total: "+ miLista.get(i).getTotal() );
		}
		
		
		
		System.out.println(miLista.get(0));
		
		
		//para modificar, eliminar.sin scanner
		
		//...............................................................
		
		

		
		/*for(Productos p : miLista ) {
			p=new Productos();
			p.setNombre(ent.Nombre);
			miLista.add(p);
		}
	*/
	
	}

}
