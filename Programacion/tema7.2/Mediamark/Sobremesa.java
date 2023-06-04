package Mediamark;

public class Sobremesa extends Informatica {

	private String modCaja;
	
	public Sobremesa() {
		super();
		this.modCaja="ATX";
	}

	public Sobremesa(String nombre,float precio,String sisOp,String modCaja) {
		super(nombre,precio,sisOp);
		this.modCaja = modCaja;
	}

	public String getModCaja() {
		return modCaja;
	}

	public void setModCaja(String modCaja) {
		this.modCaja = modCaja;
	}

	
	public String verFicha() {
		return super.verFicha()+ "\n\sSistema Operativo: "+ this.getSisOp()+ "\n\s Caja" +this.getModCaja();
				
	}
	
	public float calcTasa() {
		return 0* TASA;
	}
	
	
	
}
