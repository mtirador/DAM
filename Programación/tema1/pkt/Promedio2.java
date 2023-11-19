package pkt;

public class Promedio2 {
	public static void main(String[] args) {
		
		int programacion =4;
		int bases =5;
		int sistemas =7;
		int marcas=3;
		int promedio=0;
		
		promedio = (programacion + bases + sistemas + marcas) / 4;
		
		if(promedio>=5){
			System.out.println("El alumno aprobó " + promedio);
	
		}else{
			System.out.println("El alumno no aprobó " + promedio);
		}
	}

}
