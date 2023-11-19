package AmachonVarito;

public class Productos {

	private int id;
	private String nombre;
	private String desc;
	private Categorias cate;
	private float cant;
	private double precio;

	// Atributo estatico
	private static int autoId = 0;

	// Constructores
	public Productos() {
		this.id = ++autoId;
		this.nombre = "Sin definir";
		this.desc= "";
		this.cate= null;
		this.cant=0.0f;
		this.precio=0.00;
	}

	public Productos (String nombre, String desc, Categorias cate, float cant, double precio) {
		this.id = ++autoId;
		this.nombre=nombre;
		this.desc=desc;
		this.cate=cate;
		this.cant=cant;
		this.precio=precio;
	}

	// Setters
	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDesc() {
		return this.desc;
	}

	public Categorias getCate() {
		return this.cate;
	}

	public float getCant() {
		return this.cant;
	}

	public double getPrecio() {
		return this.precio;
	}

	// Getters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setCate(Categorias cate) {
		this.cate = cate;
	}

	public void setCant(float cant) {
		this.cant = cant;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return this.cant * this.precio * cate.getDTO() * cate.getImpuesto();
	}

	public String toString() {
		return getId() + " Producto: " + getNombre() + " \n\tDescripción: " + getDesc() + " \n\tCategoria: " + getCate()
				+ " \n\tCantidad: " + getCant() + " \n\tPrecio: " + getPrecio() + "\nPrecio Total: " + getTotal();
	}
}
