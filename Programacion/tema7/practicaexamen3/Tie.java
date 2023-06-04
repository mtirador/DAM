package practicaexamen3;

public class Tie extends Nave implements Tasa{
	private float cilindrada;
	

public Tie() {
	super();
	this.cilindrada=0.0f;
}
public Tie(String matricula,boolean bando,float cilindrada) {
	super(matricula,bando);
	this.cilindrada=cilindrada;
}
public float getCilindrada() {
	return cilindrada;
}
public void setCilindrada(float cilindrada) {
	this.cilindrada = cilindrada;
}
@Override
public float getTotal() {
	
	return (isBando())? getCilindrada()*TIMPERIO : getCilindrada()*TREPUBLICA;
}
@Override
public String toString() {
	return "Tie [cilindrada=" + cilindrada + ", getCilindrada()=" + getCilindrada() + ", getTotal()=" + getTotal()
			+ ", getMatricula()=" + getMatricula() + ", isBando()=" + isBando() + ", toString()=" + super.toString() + "]";
}

public String toFichero() {
	return "T"+";"+super.toFichero()+";"+getCilindrada();
}
}
