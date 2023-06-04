package NavesEspaciales;
/**
 * 
 * @author Marta
 *
 */

public class Naves {
	
	//atributos
	private static int autoid=0;
	private int id;
	private String piloto;
	private String matricula;
	private boolean guerra;
	private double precio;
	
	
	//constructores
	
	public Naves() {
		this.id=++autoid;
		this.piloto=" sin definir ";
		this.matricula="sin definir";
		this.guerra=true;
		this.precio=0.0;
		
	}
	
	
	public Naves(String piloto,String matricula,boolean guerra,double precio) {
		
		this.id=++autoid;
		this.piloto=piloto;
		this.matricula=matricula;
		this.guerra=guerra;
		this.precio=precio;
			
	}
	
	


	public static int getAutoid() {
		return autoid;
	}


	public int getId() {
		return id;
	}

	public String getPiloto() {
		return piloto;
	}
	

	public String getMatricula() {
		return matricula;
	}	
	
	public double getPrecio() {
		return precio;
	}
	
	
	//.................setters.......
	
	public static void setAutoid(int autoid) {
		Naves.autoid = autoid;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public boolean isGuerra() {
		return guerra;
	}


	public void setGuerra(boolean guerra) {
		this.guerra = guerra;
		
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String mensajeGuerra() {
		return (isGuerra())? "si" : "no";
	}
	
	
	
	public String toString() {
		return "Id: "+ getId() +" "+ "Piloto: "+ getPiloto() +" "+ "Matricula de la nave " + getMatricula() +" "+" Guerra: "+ mensajeGuerra() +
				"Precio: "+ getPrecio();
		
		
	}
	
	
	

}
