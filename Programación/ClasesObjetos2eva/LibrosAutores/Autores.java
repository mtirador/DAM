package LibrosAutores;

public class Autores {

	public String nombre;
	public String apellido;
	public int numObras;
	
	//constructor por defecto
	public Autores(){
		this.nombre= "Anonimo";
		this.apellido= "";
		this.numObras= 1;
	}
	
	//constructor con parámetros
	
	public Autores(String nombre, String apellido, int numObras) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.numObras=numObras;
		
	}
	public Autores(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.numObras=1;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	
	public int getNumObras() {
		return this.numObras;
	}
	
	//------------------------------------------------
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setNumObras(int numObras) {
		this.numObras = numObras;
	}
	public void setnombrecompleto(String nombrecompleto){
		this.nombre=nombrecompleto.split(" ")[0];
		this.apellido= nombrecompleto.split(" ")[1];
	}
	
	public String toString() {
		return  "Autor: "+ getNombre()+ " " + getApellido()+ "\n Numero de obras: "+ getNumObras();
		
	}
	
	
}//finclass
