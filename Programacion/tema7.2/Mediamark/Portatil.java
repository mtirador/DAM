package Mediamark;

public class Portatil extends Informatica {

	private float pulgadas;
	
	public Portatil() {
		super();
		this.pulgadas=0.0f;
	}

	public Portatil(String nombre,float precio,String sisOp,float pulgadas) {
		super(nombre,precio,sisOp);
		this.pulgadas = pulgadas;
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}

	
	public String verFicha() {
		return super.verFicha()+ "\n\sSistema Operativo: "+ this.getSisOp()+ "\n\n Pulgadas: "+ this.getPulgadas();
				
	}
	
	public float calcTasa() {
		return 0* TASA;
	}
	
	
}
