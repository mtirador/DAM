package amachonNew;

public class Productos {

	/*Categoria: 
	 * Impuesto -entero porcentaje
	 * si o no -envase en frio
	 * dto - entero
	 */
	
	//si un atributo es privado solo se puede acceder desde la clase.
	
	
	private int id;
	private String nombre;
	private String descripcion;
	private float cantidad;
	private Categorias cate;
	private double precio;
	
	//atributo estático
	private static int autoId=0;
	
	
	public Productos() {
		
		this.id=++autoId;
		this.nombre="Sin definir";
		this.descripcion="";
		this.cate=Categorias.CATA;
		this.cantidad=0.0f;
		this.precio=0.0;
		
	}
	
	public Productos(String nombre, String descripcion,Categorias cate,float cantidad,double precio) {
		
		this.id=++autoId;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.cate=cate;
		this.cantidad=cantidad;
		this.precio=precio;
		
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public Categorias getCate() {
		return cate;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	

	//-------------------------------------------
	
	public void setId(int id) {
		this.id = id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCate(Categorias cate) {
		this.cate = cate;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getTotal() {  // esto es para sumar eltotal
		return this.cantidad * this.precio;
	}
	
	public String toString() {
		return "Nombre: "+ getNombre() + "|"+"Descripcion: " + getDescripcion() +"|"+" Categorias: \n"+ getCate()+"|"+
				" Cantidad: "+ getCantidad()+"|"+ "Precio: "+getPrecio();
		
	}
	

	
	
	
	
	
	

}//fin class
