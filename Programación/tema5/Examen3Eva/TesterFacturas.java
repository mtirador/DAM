package Examen3Eva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterFacturas {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		ArrayList<Facturas> lista = new ArrayList<Facturas>();
		Facturas a�adir = new Facturas();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < 5; i++) {

			System.out.println("Introduce el Codigo de la factura");
			a�adir.setCod(Integer.parseInt(ent.nextLine()));
			System.out.println("Ingresa el Nombre del Cliente: ");
			a�adir.setCliente(ent.nextLine());
			try {
				System.out.println("Introduce el importe");
				a�adir.setImporte(ent.nextDouble());
				ent.nextLine();
				System.out.println("Ingrese la fecha de la factura");
				a�adir.setFecha(LocalDate.parse(ent.nextLine(), df));

				lista.add(a�adir);

			} catch (DateTimeParseException ex) {
				System.out.println("Error al meter una fecha mal");
				System.out.println("Ingrese otra vez ");
				i--;
			}

		} // fin for

		System.out.println("Lista de usuarios: ");
		for (Facturas li : lista) {
			System.out.println(li.ToString());

		}

	}// fin del main

}
