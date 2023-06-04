package Naves;

public class Wing extends Nave implements Tasa{
	
	
	private int numMotores;

	
	public Wing() {
		super();
		this.numMotores=0;
	}
	
	public Wing(String matricula,boolean bando,int numMotores) {
		super(matricula,bando);
		this.numMotores = numMotores;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	
	
	public float getTotal() {
		
		return (isBando())? getNumMotores()*TIMPERIO : getNumMotores()*TREPUBLICA;
	}
	@Override
	public String toString() {
		return "Wing [numMotores=" + numMotores + ", getNumMotores()=" + getNumMotores() + ", getTotal()=" + getTotal()
				+ ", getMatricula()=" + getMatricula() + ", isBando()=" + isBando() + ", toString()=" + super.toString() + "]";
	}

	public String toFichero() {
		return "W"+";"+super.toFichero()+";"+getNumMotores();
	}
	
	
	

}
