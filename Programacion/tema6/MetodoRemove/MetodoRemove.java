package MetodoRemove;

import java.util.ArrayList;

public class MetodoRemove {
	public static void main(String[]args) {
		
		ArrayList<String>asignaturas=new ArrayList<String>();
		
		asignaturas.add("FOL");
		asignaturas.add("BBDD");
		asignaturas.add("PRO");
		asignaturas.add("LMSGI");
		asignaturas.add("SIS");
		asignaturas.add("ED");
		
		
		/*
		 * asignaturas.remove("BBDD");
		asignaturas.remove(2);// SE ELIMINA LENGUAJES DE MARCAR PORQUE NHEMOS ELIMINADO PRIMERO BBDD
		
		for(String asig : asignaturas) {
			System.out.println(asig);
		}
		
		 */
		
		/*
		for(int i=0;i<asignaturas.size();i++) {
			if(asignaturas.get(i).equals("BBDD")) {
				asignaturas.remove(i);
			}
			System.out.println(asignaturas.get(i));
			
		}
		
		 *
		 */
		// si por ejemplo quiero eliminar usando el for each no se puede.es mejor que use el for normal
		
	
		
		
		
		
	}

}
