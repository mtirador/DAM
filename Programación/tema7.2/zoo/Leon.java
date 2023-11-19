package zoo;

public class Leon extends Animal implements misSonidos {
	
	private String manada;
	
	
	
	public Leon() {
		super();
		manada="";
	}
	
	public Leon(String especie,String manada ) {
		super(especie);
		this.manada=manada;
		
	}

	@Override
	public void sonido() {
		System.out.println("El leon hace grrrrr");
		
	}
	
	
	
	

}
