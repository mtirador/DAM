package aves;

public class Mar extends Reservas{

	private String fotoAnimales;
	
	protected Mar() {
		super();
		this.fotoAnimales = "";
	}
	
	protected Mar(int numEntradas, int numGuias, double duracion, double recorrido, boolean espectaculo, String fotoAnimales) {
		super(numEntradas, numGuias, duracion, recorrido, espectaculo);
		this.fotoAnimales = fotoAnimales;
	}
	
	
	protected String getFotoAnimales() {
		return fotoAnimales;
	}

	protected void setFotoAnimales(String fotoAnimales) {
		this.fotoAnimales = fotoAnimales;
	}
	
	public String toString() {
		return "Numero de entradas: " + getNumEntradas() + "\n\tNumero de Guias: " + getNumGuias() + "\n\tDuracion: " + getDuracion()
		   + "\n\tRecorrido : " + getRecorrido() + "\n\t" + mensajeEspectaculo() + "\n\tFoto gratis con : " + getFotoAnimales() + "\n\t\tTotal a pagar: " + calcPrecio();
	}

	public String toFichero() {
		return "M" + ";" + super.toFichero() + ";" + getFotoAnimales();
	}
}
