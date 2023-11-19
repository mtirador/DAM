package StarWars;

public class Wing extends Naves implements Tasas{

	private int motores;

	
	public Wing() {
		super();
		this.motores=0;
	}
	
	public Wing(String matricula,boolean imperio,int motores) {
		super(matricula,imperio);
		this.motores = motores;
	}

	public int getMotores() {
		return motores;
	}

	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	public float getTotal() {
		return (isImperio())? getMotores()*TIMPERIO : getMotores()*TREPUBLICA;
	}
	
	public String toFichero() {
		return "W"+";"+super.toFichero()+ ";"+getMotores();
	}
	
	
	
}
