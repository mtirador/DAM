package Mediamark;

public class Productos implements Mostrable, Comparable<Productos> {

	private String nombre;
	private float precio;
	
	protected Productos() {
		this.nombre="No definido";
		this.precio=0.0f;
	}
	
	protected Productos(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}




	@Override
	public String verFicha() {
		

	return "Producto:\n" + this.getNombre() +"\n"+ "Precio:\n"+ this.getPrecio(); 
		
	}

	@Override
	public float calcTasa() {
		
		return 0.0f;
	}

	@Override
	public int compareTo(Productos o) {
		
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	
	
	
	
}
