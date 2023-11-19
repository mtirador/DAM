package Excepciones;

public class ExcepcionesNumero {

	public static void main(String[] args) {
	

		int num=15, num2=0;
		
		if(num2 % 2 !=0) {
			System.out.println(num/num2);
		}else {
			try {
				throw new NumberFormatException("numero impar");
			}catch(NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		try {
			if(num<0) {
				throw new Exception("Numero negativo");
			}else if(num>=0 && num<10) {
				throw new Exception("Numero entre 0 y 9");
			}else {
				throw new Exception("Numero mayor de 10");
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
