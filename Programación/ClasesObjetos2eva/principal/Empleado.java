package principal;

import utilidades.Utiles;

public class Empleado {

	// atributos de la clase empleado
	private String dni;
	private String nombre;
	private String cargo;
	private int anio;
	private float salario;

	private final int YEAR = 2023;

	public Empleado() {
		this.dni = "";
		this.nombre = "";
		this.cargo = "";
		this.anio = YEAR;
		this.salario = 0.0f;
	}

	public Empleado(String dni, String nombre, String cargo, int anio, float salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.cargo = cargo;
		this.anio = anio;
		this.salario = salario;

	}

	public String getDni() {
		return Utiles.validarDNI(this.dni.toUpperCase());
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getYEAR() {
		return YEAR;
	}

	public float getNomina() {

		int trienio = this.getExperiencia() / 3;

		return this.getSalario() + (100 * trienio);
	}

	public int getExperiencia() {
		return YEAR - this.getAnio();
	}

	public String toString() {

		return this.getDni() + "  " + this.getNombre() + "\n" + this.getCargo() + " " + this.getAnio() + "\n"
				+ this.getNomina();
	}

}
