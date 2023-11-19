package StarWars;

public class Naves {
	
	//tasa es de 0.5 el imperio y de 0.75 los rebeldes
	
	
	//atributos privados
	private String matricula;
	private boolean imperio;
	
	//hay que poner en los constructores. 
	
	protected Naves() {
		this.matricula="";
		this.imperio=false;
	}
	
	
	protected Naves(String matricula, boolean imperio) {
		this.matricula = matricula;
		this.imperio = imperio;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected boolean isImperio() {
		return imperio;
	}

	protected void setImperio(boolean imperio) {
		this.imperio = imperio;
	}
	
	
	protected String toFichero() {
		return getMatricula()+";"+((isImperio())?"Imperio":"Republica");
	}
	
	
	
	
	
	
	
	

}
