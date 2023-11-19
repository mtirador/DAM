package CorrecionExamenFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Marta
 *
 */

public class TesterFacturas {

	public static void main(String[] args) {
			
		ArrayList<Facturas>lista=new ArrayList<Facturas>();
		Facturas fact =null;
		Scanner ent=new Scanner (System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i=0;i<1;i++) {
		try {
		fact =new Facturas();
		System.out.println("introduce el numero de la factura");
		fact.setNumFactura(Integer.parseInt(ent.nextLine()));
		System.out.println("nombre del cliente");
		fact.setNomCliente(ent.nextLine());
		System.out.println("Importe de la factura");
		fact.setImporte(Float.parseFloat(ent.nextLine().replace(",", ".")));// tambien se puede hacer con double
		System.out.println("Fecha de la factura ");
		fact.setFechaF(LocalDate.parse(ent.nextLine(), df));
		
		lista.add(fact);
		
		} catch (DateTimeParseException ex) {
			System.out.println("Error al meter una fecha mal");
			System.out.println("Ingrese otra vez ");
			i--;
		}catch (NumberFormatException ex) {
			System.out.println("Valor no numérico ");
			System.out.println("Ingrese otra vez ");
			i--;
		}catch(Exception ex) {
			System.out.println("Cualquier excepcion");
			i--;
		}
		
		}//fin del for
		
		float total=0.0f;
		for (Facturas li : lista) {
			System.out.println(li);
			///falta el total aqui
			
		}
		System.out.println();
		
		

		
		
		
		
		
		
	}//fin main
	

}//fin class
