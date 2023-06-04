package AmachonManu;

public enum Categorias {
	
	CATA(21,false,0,"categoria A"),CATB(10,false,5,"categoria B"),CATC(0,true,0, "categoria C");
	
	private int impuesto;
	private boolean envFrio;
	private int dto;
	private String desc;
	
	private Categorias(int impuesto, boolean envFrio, int dto, String desc){
		this.impuesto = impuesto;
		this.envFrio = envFrio;
		this.dto = dto;
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}
	
	public int getDTO() {
		return (100-this.dto)/100;
	}
	
	public String toString() {		
		return this.desc +":\n\tCon el "+ this.impuesto+" % de IVA y "+ this.dto+" % de descuento \n\t"+
				((this.envFrio)?"Necesita refrigeración":"No necesita refrigeración");
	}
}
