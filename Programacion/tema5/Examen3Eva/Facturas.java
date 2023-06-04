package Examen3Eva;

import java.time.LocalDate;

public class Facturas {

	private int cod;
	private String cliente;
	private double importe;
	private LocalDate fecha;

	public Facturas() {
		this.cod = 0;
		this.cliente = "Sin definir";
		this.importe = 0.0;
		this.fecha = null;

	}

	public Facturas(int cod, String cliente, double importe, LocalDate fecha) {
		this.cod = cod;
		this.cliente = cliente;
		this.importe = importe;
		this.fecha = fecha;

	}

	public int getCod() {
		return cod;
	}

	public String getCliente() {
		return cliente;
	}

	public double getImporte() {
		return importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	// fecha cobro
	public double fechaCobro() {
		int dias = 0;

		if (this.getImporte() < 10000) {
			dias = 30;
			System.out.println("Se cobra a 30 dias");

		} else if (this.getImporte() >= 10000 && this.getImporte() <= 50000) {
			dias = 60;
			System.out.println("Se cobra a 60 dias");

		} else if (this.getImporte() > 50000) {
			dias = 90;
			System.out.println("Se cobrara a 90 dias");
		}
		return dias;

	}

	
	
	
	public String ToString() {

		return "Codigo de la factura: " + this.getCod() + " Nombre del cliente: " + this.getCliente() + " Importe: "
				+ this.getImporte() + " Fecha Factura:  " + this.getFecha() + "Fecha Cobro: " + fechaCobro();
	}

}
