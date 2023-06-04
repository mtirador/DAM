package Naves;

public class Nave {
	
	
	private String matricula;
	private boolean bando;

	public Nave() {
		super();
		this.matricula="123456789w";
		this.bando=false;
	}
	
public Nave(String matricula, boolean bando) {
		super();
		this.matricula = matricula;
		this.bando = bando;
	}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public boolean isBando() {
	return bando;
}

public void setBando(boolean bando) {
	this.bando = bando;
}

@Override
public String toString() {
	return "Nave [matricula=" + matricula + ", bando=" + bando + "]";
}




protected String toFichero() {
	return getMatricula()+";"+isBando();
}




}