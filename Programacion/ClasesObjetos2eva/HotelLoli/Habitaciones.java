package HotelLoli;

public class Habitaciones {
	
	private int id;
	private String cama;
	private boolean terraza;
	private float precio;
	private boolean libre;
	
	
	public Habitaciones(int id, String cama, boolean terraza, float precio, boolean libre) {		
		this.id = id;
		this.cama = cama;
		this.terraza = terraza;
		this.precio = precio;
		this.libre = libre;		
	}
	
	public boolean isLibre() {
		return this.libre;
	}
	
	public String liberar() {
		int dias= (int)(Math.random() * 5) + 1;
		this.libre = true;
		return this.precio + " por dia," + " por " + dias + ", total = "+(this.precio * dias);

	}
	
	public String reservar() {
		this.libre = false;
		return this.id + " habitación reservada";
	}
	
	public String getHabitaculo() {
		String vistas="";
		if(this.terraza) {
			vistas = " con terraza";
		}else {
			vistas = " con ventanas";
		}
		return vistas;
	}
	
	@Override
	public String toString() {
		return "Habitaciones [id=" + id + ", cama=" + cama + ", terraza=" + getHabitaculo() + ", precio=" + precio + ", libre="
				+ libre + "]";
	}
}
