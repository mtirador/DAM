package principal;

import java.util.ArrayList;

import utilidades.Utiles;

public class Pruebas {
	
	public static void main(String[] arg) {
		
		ArrayList<Empleado> misMinions = new ArrayList<Empleado>();
		Empleado masNomina= new Empleado();
				
		misMinions.add(new Empleado("99999999R","Pepe Perez",Utiles.getCargo(),1993,2300.44f));
		misMinions.add(new Empleado("99999999R","Luisa Perez",Utiles.getCargo(),2015,1334.44f));
		misMinions.add(new Empleado("99999999R","Maria Perez",Utiles.getCargo(),2001,1111.44f));
		misMinions.add(new Empleado("99999999R","Jose Perez",Utiles.getCargo(),2022,999.44f));
		misMinions.add(new Empleado("99999999R","Luis Perez",Utiles.getCargo(),2014,3456.44f));
		misMinions.add(new Empleado("99999999R","Felisa Perez",Utiles.getCargo(),1999,1200.44f));
				
		for(Empleado emp : misMinions) {
			
			if(emp.getExperiencia() > 10) {
				System.out.println(emp);
			}
			if(emp.getNomina() > masNomina.getNomina()) {
				masNomina= emp;
			}
		}
		
		System.out.println("El empleado con más nómina es " + masNomina);
		
	}

}
