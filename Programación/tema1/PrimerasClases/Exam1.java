package PrimerasClases;

public class Exam1 {
	public static void main(String [] args) {
		
		float kg= 47.00f;
		float alt=1.5f;
		float imc = (kg / (alt*alt));
		
		System.out.println(imc);
		
		if (imc<18.5) {
			System.out.println("El indice de masa corporal indica que necesita comer más");
		}else if (imc >=18.5 && imc<25 ) {
			System.out.println("El indice de masa corporal es normal");
				
		}else if (imc >=25 && imc<30) {
			System.out.println("Obesidad");
		
		}else if (imc>=30) {
			System.out.println("obesidad mórbida");		
		}else {
			System.out.println("todo bien");
			
			
			
			//imc=kg/(float)(Math.pow(alt,2));
		}
		
		
		

		/* float salario = 1533.98f, salAnual=0.0f;
		 * salAnual*=14;
		 * 
		 * if(salAnual <15000) {
		 * syso ("IRPF DEL 9%);
		 * Else if (salAnual >= 15000 && salAnual < 25000){
		 * syso
		 * }else if(salAnual>=25000 || salAnual < 50000){
		 * syso
		 * }else{
		 * syso
		 * }
		 * }
		 * 
		 * 
		 * */
		
		
	}

}
