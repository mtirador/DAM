package Mediamark;


import java.util.HashMap;
import java.util.Map;

		public class Principal2 {

			public static void main(String[]args) {
				Portatil por=new Portatil("Omen",1500.00f,"windows11",16.00f);
				Sobremesa mes=new Sobremesa("pepino",3000.00f,"win11","atx");
				Hogar lavadora=new Hogar("siemens",550.55f,true);
				Hogar lavavajillas=new Hogar("Balay",200.00f,false);
				
				Map<String, Productos> lista = new HashMap<>();

				lista.put("por", por);
				lista.put("mes", mes);
				lista.put("lavadora",lavadora);
				lista.put("lavavajillas", lavavajillas);
				
				
				System.out.println(lista.get("por").verFicha());
			
				for (String s : lista.keySet()) {
					System.out.println(lista.get(s).verFicha());
				}
		
			
				
				
				
				
			}

		}


