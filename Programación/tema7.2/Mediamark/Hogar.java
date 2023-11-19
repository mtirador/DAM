package Mediamark;

public class Hogar extends Productos{

	
	private boolean eficiente;
	
	public Hogar() {
		super();
		this.eficiente=false;
	}

	protected Hogar(String nombre,float precio,boolean eficiente) {
		super(nombre,precio);
		this.eficiente = eficiente;
	}

	public boolean isEficiente() {
		return eficiente;
	}

	public void setEficiente(boolean eficiente) {
		this.eficiente = eficiente;
	}
	
	public String verFicha() {
		return super.verFicha()+ " " + "\n\sEficiencia: " + ((this.eficiente) ? "producto eficiente a " : "producto no eficiente a ") + (getPrecio() + calcTasa()) + " euros";
				
	}
	
	public float calcTasa() {
//		float tasa=0.0f;
//		
//		if(eficiente) {
//			tasa=(getPrecio()*TASA/100);
//		}
//		return tasa;
		
		return (!eficiente)?(getPrecio()*TASA/100):0.0f;
	}
	

}
