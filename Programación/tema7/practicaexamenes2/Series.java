package practicaexamenes2;

public class Series extends Multimedia {

	private int temporadas;
	
	public Series() {
		super();
		this.temporadas=0;
	}

	public Series(String titulo,String genero,int temporadas) {
		super(titulo,genero);
		this.temporadas = temporadas;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		return "Series: \n" + super.toString()+ "Temporadas: \n"+ getTemporadas();
	}
	
	public String toFichero() {
		return "S;"+super.toFichero()+ ";"+ getTemporadas();
	}
	
	
	
}
