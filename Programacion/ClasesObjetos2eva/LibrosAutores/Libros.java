package LibrosAutores;

public class Libros {
	
	//declarar los atributos (publicos o privados)
	
	//libros --> ISBN, TITULO, AUTOR, TAPADURA(SI ES O NO)
	
	private int isbn;
	private String titulo;
	private  Autores autor;
	private boolean tapadura;
	private float precio;
	
	//constructores
	
	public Libros() {
		this.isbn=0;
		this.titulo= "titulo sin definir";
		this.autor= new Autores("sin definir" , "Sin definir" ,0);
		this.tapadura=true;
		this.precio=0.0f;
		
	}	
	public Libros(int isbn,String titulo,Autores autor,boolean tapadura,float precio) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.tapadura=tapadura;
		this.precio=precio;
		
	}
	
	
	public int getisbn() {
		return this.isbn;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public Autores getautor() {
		return this.autor;
	}
	public boolean istapadura() {
		return this.tapadura;
		
	}
	
	public float getPrecio() {
		return (istapadura ())  ? this.precio * 1.05f : this.precio;
	}
	
	
	//------------------------------------------------------
	
	
	public void setPrecio(float precio) {
		this.precio=Math.abs(precio);
		
	}
	public String mensajeTapadura() {
		return (istapadura())? "tapa dura." : "tapa dura.";
	}
	
	
	public void setisbn(int isbn) {
		this.isbn=isbn;
		
	}
	public void setlibro(String libro) {
		this.titulo=libro;
	}
	public void settapadura(boolean tapadura) {
		this.tapadura=tapadura;
	}

	public void setAutor(Autores autor) {
		this.autor = autor;
	}
	
	//public String toString() {
//		return "Libro : " + getisbn()+", " + getTitulo()+", " + getautor()+ ", " + istapadura()+ " .";
	//}

	
	
	public String toString() {
		String mensaje = "Libro con Isbn: "+ getisbn()+
				"\n"+" Titulo del libro: "+ getTitulo()+
				"\n"+ getautor()+ "\n Tipo de tapa: "+ mensajeTapadura()+ getPrecio()+ "Euros";
		return mensaje;
	}
}//fin class
