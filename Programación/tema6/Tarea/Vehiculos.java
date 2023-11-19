package Tarea;

import java.text.DecimalFormat;

public class Vehiculos {
	private String matricula;
	private int plazas;
	private char combustible;
	private double precioDia;
	private boolean alquilado;

	public Vehiculos() {

	}

	public Vehiculos(String matricula, int plazas, char combustible, double precioDia, boolean alquilado) {

		this.matricula = matricula;
		this.plazas = plazas;
		this.combustible = combustible;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getPlazas() {
		return plazas;
	}

	public char getCombustible() {
		return combustible;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	// --------------

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public void setPrecioDia(double precioDia) {

		this.precioDia = precioDia;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	// comprobar la matricula
	public static boolean comprobarMatricula(String matricula) {
		boolean valida;

		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matricula válida");
			valida = true;
		} else {
			System.out.println("Matricula inválida");
			valida = false;
		}
		return valida;
	}

	// validar las plazas
	public static boolean comprobarPlazas(int plazas) {
		return plazas <= 9 && plazas >= 1;
	}

	// validar combustible
	public static boolean validarCombustible(char combustible) {
		char combusMayus = Character.toUpperCase(combustible);
		return combusMayus == 'D' || combusMayus == 'G' || combusMayus == 'E' || combusMayus == 'H';
	}

	// formatear
	public static String formatearPrecio(double precioDia) {
		DecimalFormat pdf = new DecimalFormat("#.00");
		return pdf.format(precioDia);
	}

	public String toString() {
		return "Matricula: " + this.getMatricula() + "\n" + "Plazas: " + this.getPlazas() + "\n" + "Combustible: "
				+ this.getCombustible() + "\n" + "Precio por día: " + formatearPrecio(this.getPrecioDia()) + "\n"
				+ "Estado de alquiler: " + this.isAlquilado() + "\n";
	}

}
