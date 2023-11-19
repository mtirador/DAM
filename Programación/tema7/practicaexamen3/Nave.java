package practicaexamen3;

public class Nave {
	private String matricula;
	private boolean bando;
	
protected Nave() {
	this.matricula="";
	this.bando=true;
}
protected Nave(String matricula, boolean bando) {
	this.matricula=this.matricula;
	this.bando=this.bando;
}
protected String getMatricula() {
	return matricula;
}
protected void setMatricula(String matricula) {
	this.matricula = matricula;
}
protected boolean isBando() {
	return bando;
}
protected void setBando(boolean bando) {
	this.bando = bando;
}

protected String toFichero() {
	return getMatricula()+";"+isBando();
}
}
