package amachonNew;

public enum Categorias {
	

	
	CATA(21,false,0,"Categoría A"),CATB(10,false,5,"Categoria B"),CATC(0,true,0,"Categoria C"),
	CATD(0,true,0,"Categoria D");
	
	private int impuesto;
	private boolean envFrio;
	private int dto;
	private String desc;
	
	Categorias(int impuesto,boolean envFrio,int dto,String desc){
		this.impuesto=impuesto;
		this.envFrio=envFrio;
		this.dto=dto;
		this.desc=desc;
		
	}
	
	public String toString() {
		return this.desc +"\n Con el "+ this.impuesto+ "%de IVA"+ this.dto+ "% de descuento \n"+
	((this.envFrio)?"Necesita refrigeración":"No necesita refrigeración");
		
	}

	public String getDesc() {
		return this.desc;
	}
	
	
	
	
	

}//fin enum
