package aves;

public class TierraYAire extends Reservas{

	private int espectaculos;
	
	protected TierraYAire() {
		super();
		this.espectaculos = 0;
	}
	
	protected TierraYAire(int numEntradas, int numGuias, double duracion, double recorrido, boolean espectaculo, int espectaculos) {
		super(numEntradas, numGuias, duracion, recorrido, espectaculo);
		this.espectaculos = espectaculos;
	}
	
	
	protected int getEspectaculos() {
		return espectaculos;
	}

	protected void setEspectaculos(int espectaculos) {
		this.espectaculos = espectaculos;
	}

	public String toFichero() {
		return super.toFichero() + ";" + getEspectaculos();
	}
	
}
