package zoo;

public class Loro extends Animal implements misSonidos{

	private String pico;

	public Loro(String especie, String pico) {
		super(especie);
		this.pico = pico;
	}
	
	public Loro() {
		super();
		this.pico="";
		
	}

	@Override
	public void sonido() {
		
		System.out.println("El loro repite lo que dices");
		
	}
	

	
	
}
