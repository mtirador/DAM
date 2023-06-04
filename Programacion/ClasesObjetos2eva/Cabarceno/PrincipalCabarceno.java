package Cabarceno;

public class PrincipalCabarceno {
	public static void main(String[]args) {
		
		
		Cabarceno[] lista= new Cabarceno[4];
		
		Cabarceno Leon,Orangután,Paloma,Delfin;
		
		
		lista[0]= new Cabarceno(1,"Leon",Habitats.TIERRA,"Carne",9.80);
		lista[1]= new Cabarceno(2,"Orangutan",Habitats.TIERRA,"Carne",5.00);
		lista[2]= new Cabarceno(3,"Paloma",Habitats.AIRE,"Pienso",0.53);
		lista[3]= new Cabarceno(4,"Delfin",Habitats.MAR,"Pescado",4.65);
	
		Cabarceno leon=new Cabarceno(1,"Leon",Habitats.TIERRA,"Carne",9.80);
		Cabarceno copiaLeon=new Cabarceno(leon);
		
		System.out.println(leon);
		
		leon.setEspecie("Leon Africano");
		System.out.println("**************");
		System.out.println(leon);
		//1º 
	//	informe(lista);ñ
		
	}
	
	// 1º Generar un listado de los
	//animales agrupados por hábitat.
/*	public static void informe(Cabarceno[]lista) {
		String[] habitat={"Tierra","Mar","Aire"};
		double Carne = 0,Pienso = 0,Pescado = 0;
		
		for(int i=0; i<habitat.length;i++) {               //recorrer los habitats
			System.out.println("Animales de "+ habitat[i]+" :");    
			for(int j=0;j<lista.length;j++) {                    //recorrer lista
				if(lista[j].getHabitat().equalsIgnoreCase(habitat[i])){
					System.out.println(lista[j]);
					//Calcular los kg de cada comida
					//necesaria para alimentar a los animales cada semana.

					if(lista[j].getComida().equalsIgnoreCase("Carne")) {
						Carne+=lista[j].getKilogramos();
					}else if(lista[j].getComida().equalsIgnoreCase("Pienso")) {
						Pienso+=lista[j].getKilogramos();
					}else if (lista[j].getComida().equalsIgnoreCase("Pescado")){
						Pescado+=lista[j].getKilogramos();
						
					}
				
					
				}
			}
		}
		
		  System.out.println("Cantidad de carne necesaria a la semana: " + Carne * 7 + " kg");
		  System.out.println("Cantidad de pienso necesaria a la semana: " + Pienso * 7 + " kg");
		  System.out.println("Cantidad de pescado necesaria a la semana: " + Pescado * 7 + " kg");
		
		  
		*/
		
	}//fin del void
	
	
	

	







