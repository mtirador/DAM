package LibrosAutores;

public class Autores_Principal {
	public static void main(String[]args) {
		
		//instancia objeto autores con e constructor con parametros
		
		Autores cervantes=new Autores();
		cervantes.setNombre("Miguel");
		cervantes.setApellido(" de Cervantes");
		cervantes.setNumObras(1);
		
		Autores tolkien = new Autores("J.R.R","Tolkien",9);
		
		
		
		System.out.println(cervantes.getNombre());
		System.out.println(tolkien.getNombre()+ tolkien.getApellido());
		
	//	Libros quijote = new Libros(12345,"El Quijote", new Autores("Miguel","de Cervantes"),true);
		

		
		//quijote.setisbn(12345);
		//quijote.setlibro("El Quijote");
		//quijote.setAutor(cervantes);
		//quijote.settapadura(true);
		
		//System.out.println(quijote);
		
		System.out.println(tolkien.toString());
		
	//	Libros elhobbit = new Libros(123456,"El hobbit",tolkien,true);
		
	//	System.out.println(elhobbit.toString());
		
		
		Autores gabrielGarcia = new Autores("Gabriel", "García Márquez", 20);
		Libros cienAnosDeSoledad = new Libros(922222, "Cien años de soledad", gabrielGarcia, true, 25.99f);
		
		System.out.println(gabrielGarcia.toString());
		System.out.println(cienAnosDeSoledad.toString());


		
		
		
		
		
		
		
		
		
	}//fin main

}//fin class
