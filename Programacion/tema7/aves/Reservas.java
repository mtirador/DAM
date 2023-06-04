package aves;

public class Reservas implements Precios{

	private int id;
	private static int autoId = 0;
	private int numEntradas;
	private int numGuias;
	private double duracion;
	private double recorrido;
	private boolean espectaculo;
	
	
	protected Reservas() {
		this.id = ++autoId;
		this.numEntradas = 0;
		this.numGuias = 0;
		this.duracion = 0;
		this.recorrido = 0;
		this.espectaculo = false;
	}
	
	protected Reservas(int numEntradas, int numGuias, double duracion, double recorrido, boolean espectaculo) {
		this.id = ++autoId;
		this.numEntradas = numEntradas;
		this.numGuias = numGuias;
		this.duracion = duracion;
		this.recorrido = recorrido;
		this.espectaculo = espectaculo;
	}

	//GETTERS
	protected int getId() {
		return id;
	}
	
	protected int getNumEntradas() {
		return numEntradas;
	}

	protected int getNumGuias() {
		return numGuias;
	}

	protected double getDuracion() {
		return duracion;
	}

	protected double getRecorrido() {
		return recorrido;
	}

	protected boolean isEspectaculo() {
		return espectaculo;
	}

	//SETTERS
	protected void setNumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}

	protected void setNumGuias(int numGuias) {
		this.numGuias = numGuias;
	}

	protected void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	protected void setRecorrido(double recorrido) {
		this.recorrido = recorrido;
	}

	protected void setEspectaculo(boolean espectaculo) {
		this.espectaculo = espectaculo;
	}
	
	
	public String mensajeEspectaculo() {
		return (isEspectaculo()) ? "Espectaculos disponibles" : "Sin espectaculos disponibles";
	}


	@Override
	public float calcPrecio() {
		return numEntradas*(PRECIOENTRADA-PRECIOENTRADA*DESCUENTO);
	}
	
	public String toFichero() {
		return getNumEntradas() + ";" + getNumGuias() + ";" + getDuracion() + ";" + getRecorrido() + ";" + mensajeEspectaculo();
	}
	
}

