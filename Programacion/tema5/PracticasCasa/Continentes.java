package PracticasCasa;

public class Continentes {
	
	private String pais;
	private String continente;
	private double habitantes;
	
	
	public Continentes() {
		this.pais="Sin definir";
		this.continente="sin definir";
		this.habitantes=0.0;
	}
	
	public Continentes(String pais,String continente,double habitantes) {
		this.pais=pais;
		this.continente=continente;
		this.habitantes=habitantes;
	}

	public String getPais() {
		return pais;
	}

	public String getContinente() {
		return continente;
	}
	
	public double getHabitantes() {
		return habitantes;
	}
	
	
	
	//-----------------------------------------------
	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public void setHabitantes(double habitantes) {
		this.habitantes = habitantes;
	}
	
	
	public String ToString() {
		return "Pais" + this.getPais()+"\n"+ "Continente: "+ this.getContinente()+"\n"+ "Habitantes en millones "+"\n"+ this.getHabitantes();
	}
	
	
	

}
