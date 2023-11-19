package pkt;

public class Vehiculos1 {
	public static void main(String[] args) {
		/*Crear el algoritmo necesario para la gestión de un aparcamiento de vehículos. El aparcamiento está dividido en 3 plantas:
- La primera planta tiene 200 plazas disponibles para vehículos de menos de 500 kg de peso.
- La segunda planta tiene 150 plazas disponibles para vehículos de menos de 500 kg de peso.
- La tercera planta tiene 100 plazas disponibles para vehículos de 500 kg o más.
El programa deberá indicar a cada vehículo que entre en que planta debe aparcar.
*/
	
		
		float pesoV=0.0f;//peso del vehiculo
		int p1=200, p2=150,p3=100;// plazas libres
		
		pesoV=(float)((Math.random()*700) + 300);
		
		if(pesoV >= 500 && p3>0) {
			
			System.out.println("Su vehiculo de " + pesoV + "kg aparca en la planta 3");
		}else if (pesoV <500 && p1>0) {
			System.out.println("Su vehiculo de " + pesoV + "kg aparca en la planta 1");
		}else if(pesoV<500 && p2>0) {
			System.out.println("Su vehiculo de " + pesoV + "kg aparca en la planta 2");
		}else {
			System.out.println("Plazas no disponibles");
		}
		
		
		
		
		
		
		
	}

}
