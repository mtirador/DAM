package Mediamark;

public class Informatica extends Productos {
	
	private String sisOp;

	public Informatica() {
		super();
		this.sisOp="FreeDOS";
	}
	
	protected Informatica(String nombre,float precio,String sisOp) {
		super(nombre,precio);
		this.sisOp = sisOp;
	}

	protected String getSisOp() {
		return sisOp;
	}

	public void setSisOp(String sisOp) {
		this.sisOp = sisOp;
	}

	
	public String  verFicha() {
		return super.verFicha(); 
	}

}
