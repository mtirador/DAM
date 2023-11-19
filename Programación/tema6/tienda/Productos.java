package tienda;

public class Productos {
	
	private String nombre;
	private String descripcion;
	private int cantidad;
	private double precio;
	
	public 	Productos() {
		this.nombre="sin definir";
		this.descripcion="sin definir";
		this.cantidad=0;
		this.precio=0.0;
		
	}
	
	public 	Productos(String linea) {
		this.nombre=linea.split(";")[0];
		this.descripcion=linea.split(";")[1];
		this.cantidad=Integer.parseInt(linea.split(";")[2]);
		this.precio=Double.parseDouble(linea.split(";")[3]);
		
	}

	public Productos(String nombre, String descripcion, int cantidad, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
	
	

}
