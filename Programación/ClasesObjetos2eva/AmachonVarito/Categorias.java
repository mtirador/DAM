package AmachonVarito;

public enum Categorias {

	CatA(21, false, 0, "Categoria A"), CatB(10, false, 5, "Categoria B"), CatC(0, true, 0, "Categoria C");

	private int impuesto;
	private boolean envFrio;
	private int dto;
	private String desc;

	Categorias(int impuesto, boolean envFrio, int dto, String desc) {
		this.impuesto = impuesto;
		this.envFrio = envFrio;
		this.dto = dto;
		this.desc = desc;

	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getDTO() {
		return (100 - this.dto) / 100;
	}

	public float getImpuesto() {
		return (100 + this.impuesto) / 100;
	}

	public String toString() {

		return this.desc + ":" + "\n\tCon el " + this.impuesto + "% de IVA y " + this.dto + "% de descuento \n" + "\t"
				+ ((this.envFrio) ? "Necesita nevera" : "No necesita nevera");
	}

}
