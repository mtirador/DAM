package Arrays;

public class ClaseStringFormat {

	public static void main(String[] args) {
	
		int num= 100;
		
		String salida = "*"+ String.format("%10s",num) + "*";
		
		System.out.println(salida);
		
		num=12345;
		salida= "*"+ String.format("%10s", num) + "*";
		
		System.out.println(salida);

	}

}
