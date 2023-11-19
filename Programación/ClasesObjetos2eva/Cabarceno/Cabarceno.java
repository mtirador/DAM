package Cabarceno;
/**
 * 
 * @author Marta
 *
 */

public class Cabarceno {
	
	//atributos
	private int idAnimal;
	private String especie;
	private Habitats habitat;// de tipo enumerado
	private String comida;
	private double kilogramos;
	
	
	//constructores
	
	public Cabarceno() {
		
		this.idAnimal=0;
		this.especie="";
	//el null puede crear una excepcion a la hora de crear referencia
		this.habitat=null;
		this.comida="";
		this.kilogramos=0;
		
	}
	
	public Cabarceno(int idAnimal,String especie,Habitats habitat,String comida,double kilogramos) {
		
		this.idAnimal=idAnimal;
		this.especie=especie;
		this.comida=comida;
		this.habitat=Habitats.TIERRA;
		this.kilogramos=kilogramos;
		
	}
	
	
	

	public int getIdAnimal() {
		return idAnimal;
	}

	public String getComida() {
		return comida;
	}

	public String getEspecie() {
		return especie;
	}

	public Habitats getHabitat() {
		return habitat;
	}
	public double getKilogramos() {
		return kilogramos;
	}
	
	
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public void setHabitat(Habitats habitat) {
		this.habitat = habitat;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public void setKilogramos(double kilogramos) {
		this.kilogramos = kilogramos;
	}
	
	
	public String toString() {
		return "Animal: " + getIdAnimal() + " " + getEspecie()+ "\t"+"\n"+ 
				getHabitat() +", "+"Tipo de Alimentación: "+ getComida()+"; "+"\n" 
				+ "Kilogramos de comida: "+getKilogramos();
	}
	
	//constructor Copia
	
	public Cabarceno(Cabarceno anim) {
		this.idAnimal=anim.idAnimal;
		this.especie=anim.especie;
		this.comida=anim.comida;
		this.habitat=anim.habitat;
		this.kilogramos=anim.kilogramos;
		
	}
	//...........................................
	
	
	
	
	

}
