package automoviles_ej1;

public class Autobus extends Vehiculo{
	
	private int numPlazas;
	
	
	
	public Autobus(String matricula,String modelo,int potencia,int numPlazas) {
		super(matricula,modelo,potencia);
		this.numPlazas=0;
	}

	public Autobus(int numPlazas) {
		super();
		this.numPlazas = numPlazas;
	}

	
	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	public String toString() {
		return "Autobus [numPlazas=" + numPlazas + super.toString();
	}
	
	
	

}
