package PracticasCasa;

import java.util.ArrayList;

public class ContinentesTester {

	public static void main(String[] args) {
		
		ArrayList<Continentes>lista=new ArrayList<Continentes>();
		
		lista.add(new Continentes("China","Asia",1393.6));
		lista.add(new Continentes("India","Asia",1368.0));
		lista.add(new Continentes("EEUU","America",329.5));
		lista.add(new Continentes("indonesia","Asia",270.2));
		lista.add(new Continentes("Brasil","Am�rica",211.8));
			double contMayor=0.0;
			double total=0.0;
			String datos="";
		//total de habitantes de los 5 paises
		for(Continentes con : lista) {
		
			total+=con.getHabitantes();
			
			
			if(con.getContinente().equalsIgnoreCase("Asia")) {
				System.out.println(con.getPais()+"<--Paises que est�n en Asia");
			}
			
			if(con.getHabitantes()>contMayor) {
				contMayor=con.getHabitantes();
				
					System.out.println(con.ToString());
			}
			
		}
	
		System.out.println(total+ " Millones de pe�a ");
	
		
		//cuales de los paises est�n en asia
		
		
		
		
		
		
		

	}

}
