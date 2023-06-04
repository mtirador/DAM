package utilidades;

public class Utiles {
	
	//Método estático para válidar un DNI
	public static String validarDNI(String dni) {
		String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		String numero="";
		char letra=' ';

		if(dni.length() == 9) {
			numero= dni.substring(0, dni.length()-1);
			letra= dni.charAt(dni.length()-1);
			for(int i=0; i< numero.length() ; i++) {
				if( !Character.isDigit(numero.charAt(i))) {
					dni = "DNI incorrecto";
					break;
				}
			}
			if(!dni.equalsIgnoreCase("DNI incorrecto")) {
				if(letra != letrasDNI.charAt(Integer.parseInt(numero)%23)) {
					dni = "DNI incorrecto";
				}
			}
		}else {
			dni="DNI incorrecto";
		}
		
		return dni;
	}
	
	public static String getCargo() {
		
		String[] cargos = {"CEO","Jefa","Analista","Limpiador"};
		
		return cargos[(int)(Math.random()*cargos.length)];
	}
	
}
