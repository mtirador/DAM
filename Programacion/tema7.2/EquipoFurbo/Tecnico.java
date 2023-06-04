package EquipoFurbo;

public class Tecnico extends Persona{
	
	private String puesto; //principal,secundario o medico

	public Tecnico() {
		super();
		this.puesto="sin definir";
	}
	
	public Tecnico(String nombre,String apellidos,int anios,String puesto) {
		super(nombre,apellidos,anios);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String toFichero() {
		return super.toFichero()+this.getPuesto();
	}

	@Override
	public String toString() {
		return "Tecnico [puesto=" + puesto + "]";
	}
	
	

}
