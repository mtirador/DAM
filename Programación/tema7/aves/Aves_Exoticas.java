package aves;

public class Aves_Exoticas extends TierraYAire{

	private String fotoAves;
	
	protected Aves_Exoticas() {
		super();
		this.fotoAves = "";
	}
	
	protected Aves_Exoticas(int numEntradas, int numGuias, double duracion, double recorrido, boolean espectaculo, int espectaculos, String fotoAves) {
		super(numEntradas, numGuias, duracion, recorrido, espectaculo, espectaculos);
		this.fotoAves = fotoAves;
	}
	
	
	protected String getFotoAves() {
		return fotoAves;
	}

	protected void setFotoAves(String fotoAves) {
		this.fotoAves = fotoAves;
	}
	
	public String toString() {
		return "Numero de entradas: " + getNumEntradas() + "\n\tNumero de Guias: " + getNumGuias() + "\n\tDuracion: " + getDuracion() + "m"
		   + "\n\tRecorrido : " + getRecorrido() + "km" + "\n\t" + mensajeEspectaculo() + " (" + getEspectaculos() + ")" + "\n\tFoto gratis con : "
		   + getFotoAves() + "\n\t\tTotal a pagar: " + calcPrecio() + " euros";
	}
	
	public String toFichero() {
		return "AE" + ";" + super.toFichero() + ";" + getFotoAves();
	}
	
}
