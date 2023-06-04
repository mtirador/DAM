package Netflix;

public class Peliculas extends Multimedia{
	
	private int duracion;
	
	public Peliculas() {
		super();
		this.duracion=0;
	}

	public Peliculas(String titulo,String genero,int duracion) {
		super(titulo,genero);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula:  \n"+ super.toString()+" "+"Duración: "+this.getDuracion() ;
	}
	
	public String toFichero() {
		return "P;"+super.toFichero()+ ";"+ getDuracion();
	}
	
	

}
