package automoviles_ej1;

public class Principal {

	public static void main(String[] args) {
		
		Taxi elFary =new Taxi();
		Taxi Farruquito= new Taxi("1234abe","Ford Fiesta",50,997);
		
		System.out.println(elFary);
		System.out.println(Farruquito);
		
		Autobus au=new Autobus("3333EEE","Enorme",333,56);
		System.out.println(au);
		
	}

}
