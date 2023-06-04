package automoviles_ej1;

public class Taxi extends Vehiculo {
	
	private int numLicencia;

	public Taxi() {
		super();
		this.numLicencia =0;
	}

	public Taxi(String matricula,String modelo,int potencia,int numLicencia) {
		super(matricula,modelo,potencia); //llamar a la super clase
		this.numLicencia = numLicencia;
	}

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}

	@Override
	public String toString() {
		return "Taxi con " + getMatricula()+ " -"+ getModelo() + " -" + getPotencia()+ " -"+ getNumLicencia();
	}

	

	

					
	

}
