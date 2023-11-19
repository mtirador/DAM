package amachonNew;

public class Validaciones {
	
	public static boolean validarUnidades(int unidades){
		
		
		return (unidades>=1)?true:false;
		
		
	}
	
	public static boolean validarString(String cadena) {
		boolean validacionOk;
		
		
		
		//return(cadena.length()>0 || !cadena.equals(" "))?true:false;
		
		if(!cadena.isBlank()) {
			validacionOk=true;
		}else {
			validacionOk=false;
		}
		return validacionOk;
	}
	
	public static boolean validarString(String cadena,int longitudMax) {
		boolean validacionOk;
		
		if(!cadena.isBlank() && cadena.length()<=longitudMax) {
			validacionOk=true;
			
		}else {
			validacionOk=false;
			
		}
		return validacionOk;
	}
	
	public static Categorias chkCategorias(String entCat) {
		Categorias cat=null;
		
		if(entCat.equals(Categorias.CATA.getDesc().toUpperCase().replace("Í","I"))
				|| entCat.charAt(0) == '1' || entCat.charAt(0) == 'A') {
			cat=Categorias.CATA;
		}else if(entCat.equals(Categorias.CATB.getDesc().toUpperCase().replace("Í","I"))
				|| entCat.charAt(0) == '1' || entCat.charAt(0) == 'A') {
			cat=Categorias.CATB;
		
		}else if(entCat.equals(Categorias.CATC.getDesc().toUpperCase().replace("Í","I"))
				|| entCat.charAt(0) == '1' || entCat.charAt(0) == 'A') {
			cat=Categorias.CATC;
			
		}else {
			cat=null;
		}
			
			return cat;
			
	}

	
	
	
}
