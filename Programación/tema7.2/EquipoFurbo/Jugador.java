package EquipoFurbo;

public class Jugador extends Persona {
	
	private int numCamiseta;
	private String posicion;
	
	
	public Jugador() {
		super();
		this.numCamiseta=0;
		this.posicion="nose";
		
	}
	
	
	public Jugador(String nombre,String apellidos,int anios,int numCamiseta, String posicion) {
		super(nombre,apellidos,anios);
		this.numCamiseta = numCamiseta;
		this.posicion = posicion;
	}



	public int getNumCamiseta() {
		return numCamiseta;
	}



	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
//	public String toFichero() {
//		return this.getNombre()+ this.getApellidos()+ this.getNumCamiseta()+this.getPosicion();
//	}


	@Override
	public String toString() {
		return "Jugador [numCamiseta=" + numCamiseta + ", posicion=" + posicion + "]";
	}
	
	public String toFichero() {
		return super.toFichero()+ this.getPosicion();

		
		}

}
