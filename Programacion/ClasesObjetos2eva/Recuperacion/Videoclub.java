package Recuperacion;

public class Videoclub {
	
	private int codigo;
	private String titulo;
	private String genero;
	private int unidades;
	
	
	
	public Videoclub() {
		
		this.codigo=0;
		this.titulo="Sin definir";
		this.genero="sin definir";
		this.unidades=0;
		
	}
	
	public Videoclub(int codigo,String titulo,String genero,int unidades) {
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.genero=genero;
		this.unidades=unidades;
		
	}

	public final int getCodigo() {
		
		return codigo;
	}
	
	public final String getTitulo() {
		return titulo;
	}
	
	public final String getGenero() {
		return genero;
	}
	
	public final int getUnidades() {
		
		
		
		return unidades;
	}

	
	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public final void setGenero(String genero) {
		this.genero = genero;
	}
	
	public final void setUnidades(int unidades) {
		
		this.unidades = unidades;
	}
	
	/*public String mensaje() {
		String mensaje="";
		if(this.unidades==0) {
			mensaje="|| Stock:  NO DISPONIBLE";
		}else {
			mensaje="|| Stock: "+ getUnidades();
		}
		
		return mensaje;
	}
	
	*/
	
	//mirar bien la clase String
	
	public String mensaje() {
		String mensaje="";
		if(this.unidades==0) {
			mensaje="No Disponible";
		}else {
			mensaje=String.valueOf(unidades);
		}
		return mensaje;
	}
	
	

	public String toString() {
		
		return "Código : " + getCodigo() +" Título: "+ getTitulo()+ 
				" ||Género: "+ getGenero()+ "||Stock: "+ mensaje();
	}
	
	

}
