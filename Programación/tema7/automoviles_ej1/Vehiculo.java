package automoviles_ej1;

public class Vehiculo {
	
	private String matricula;
	private String modelo;
	private int potencia;
	
	
	public Vehiculo() {
		
		this.matricula="sin definir";
		this.modelo="sin definir";
		this.potencia=0;
			
	}
	
	public Vehiculo(String matricula, String modelo, int potencia) {

		this.matricula = matricula;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	
	

}
