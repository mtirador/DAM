package Recuperación3Fechas;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterEmpresa {
	public static void main(String[] args) {

		ArrayList<Empresa> lista = new ArrayList<Empresa>();
		Empresa emp = null;
		Scanner ent = new Scanner(System.in);

		extracted(lista, ent);

		for (Empresa empresa : lista) {
			System.out.println(empresa.ToString());
		}

	}// fin main

	public static void extracted(ArrayList<Empresa> lista, Scanner ent) {
		Empresa emp;
		for (int i = 0; i < 1; i++) {
			try {
				System.out.println("Ingrese el DNI del empleado:");
				emp = new Empresa();
				emp.setDni(ent.nextLine());
				System.out.println("Ingrese el nombre del empleado");
				emp.setNombre(ent.nextLine());
				System.out.println("Puesto: ");
				emp.setPuesto(ent.nextLine());
				System.out.println("Hora de entrada: ");
				emp.setHoraEnt(LocalTime.parse(ent.nextLine()));

				lista.add(emp);
			} catch (DateTimeParseException ex) {
				System.out.println("Error al ingresar mal la hora");
				i--;

			}catch(Throwable ex) {
				
			}

		} // fin for
	}
}// fin class
