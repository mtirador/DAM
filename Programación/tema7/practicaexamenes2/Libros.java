package practicaexamenes2;

public class Libros extends Multimedia {
	
	private String autor;

	public Libros() {
		super();
		this.autor="";
	}
	
	public Libros(String titulo,String genero,String autor) {
		super(titulo,genero);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libros: \n" + super.toString()+ " Autor: \n" + this.getAutor();
	}

	public String toFichero() {
		return "L;"+super.toFichero()+ ";"+ getAutor();
	}
	
	
	

}
