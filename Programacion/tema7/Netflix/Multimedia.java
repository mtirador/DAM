package Netflix;

public class Multimedia {
	
	private String  titulo;
	private String genero;

	protected Multimedia() {
		this.titulo="";
		this.genero="";
	}
	
	protected Multimedia(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
		
	}


	protected String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	protected void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Titulo:"+ getTitulo() + ", Género:" + getGenero();
	}
	
	
	
	public String toFichero() {
		return getTitulo()+ getGenero();
	}
	
	
	

}
