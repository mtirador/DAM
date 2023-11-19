package pkt;

public class Hotel {
	
	
	private int id;
	private String tipo;
	private String descripcion;
	private boolean reservada;
	private double precio;
	
	
	
	
	public Hotel(int id,String tipo,String descripcion,boolean reservada,double precio) {
		this.id=id;
		this.tipo=tipo;
		this.descripcion=descripcion;
		this.reservada=reservada;
		this.precio=precio;
		
	}

	public int getId() {
		return id;
	}


	public String getTipo() {
		return tipo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean isReservada() {
		return reservada;
	}
	
	public double getPrecio() {
		return precio;
	}

	//........................................
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String mensajeReservada() {
		return (isReservada())? " Si ":" No ";
	}
	
	
	public String toString() {
		return "Habitación Número: "+ this.getId()+"||Tipo-->" + this.getTipo() + 
				"|| Descripción-->"+ this.getDescripcion()+
				"||¿Está reservada?-->"+this.mensajeReservada()+"||Precio--> "+ this.getPrecio();
	}
	
	
	

}
