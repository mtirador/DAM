package PrimerasClases;

public class Edificio {
	public static void main(String args[]) {
		
		int plantas=8, carga=1000;
		
		if((carga>500)&&(plantas<=8)) {
			System.out.println("El ascensor funciona este");
		}
		if((carga<=300)&&(plantas>8))
			System.out.println("El ascensor funciona");
		
	}
}



//edificio de 12 plantas
//ascensor 500kn (1-8)
//ascensor 300kg (9-12)