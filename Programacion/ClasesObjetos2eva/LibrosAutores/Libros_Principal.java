package LibrosAutores;

public class Libros_Principal {
	public static void main(String[]args) {
		
		//4 atributos o propiedades isbn,titulo,autor, tapadura
	
	Libros elQuijote = new Libros();
	//Libros elLazarillo = new Libros(1234567890,"El Lazarillo de Tormes", "Anonimo",true);
	
	Autores CarmenMola = new Autores("Carmen","Mola",8);
	
	//System.out.println(elQuijote.getautor());
	
//	boolean tapa= false;
//	String mensaje=(tapa)? "tapa dura": "tapa blanda";
//	System.out.println(mensaje);
	
	//System.out.println(elLazarillo.toString());//usamos el toString para mostrar los valores
	
	//System.out.println(elQuijote.toString());
	
	System.out.println(CarmenMola.toString());
	
	
	
	
	
	
	}//fin main
}//fin class
