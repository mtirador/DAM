package Envolventes;

public class ConversionEnvolventes {
	public static void main(String[]args) {
		
		/*Las conversiones entre los tipos primitivos y sus clase de envolente son automaticas.
		No e necesario hacer un casting. Para realizarlas se utiliza el Boxing/Unboxing.*/
		
	/*	
		double x = 29.95;
		Double y;
		y =x; //boxing: convertir un tipo primitivo en u clase WRAPPER
		*/
		
		double x;
		Double y =29.95;
		x = y; //unboxing: Convertir un ojeto de una clse Wrapper en su tipo primitivo
		
		
		
	}

}
