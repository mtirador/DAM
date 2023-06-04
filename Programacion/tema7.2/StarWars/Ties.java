package StarWars;

public class Ties extends Naves implements Tasas {

	private float cilindrada;

		
	public Ties() {
		super();
		this.cilindrada=0.0f;
	}
	
	public Ties(String matricula,boolean imperio,float cilindrada) {
		super(matricula,imperio);
		this.cilindrada = cilindrada;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public float getTotal() {
	
		return (isImperio())? getCilindrada()*TIMPERIO: getCilindrada()*TREPUBLICA;
	}
	
	public String toFichero() {
		return "	T"+";"+super.toFichero()+ ";"+getCilindrada();
	}
	
	
}
