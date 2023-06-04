package AmachonVarito;

public class Validaciones {

	public static boolean validarString(String cadena, int longitudMax) {
		return (!cadena.isBlank() && cadena.length() < longitudMax);
	}
	
	
	
	public static boolean validarUnidades (int unidades) {
		return (unidades>=1)? true:false;
	}
	
	
	public static Categorias chkCategorias(String eCate) {
		char letra=' ';
		Categorias cat = null;
		
		if(eCate.length()==1) {
			letra=eCate.charAt(0);
		}
		
		if(eCate.equals(Categorias.CatA.getDesc().toUpperCase().replace("Í", "I"))
				|| letra == '1' || letra == 'A') {
				cat = Categorias.CatA;
				
			}else if(eCate.equals(Categorias.CatB.getDesc().toUpperCase().replace("Í", "I")) 
				|| letra == '2' || letra == 'B') {
				cat = Categorias.CatB;
				
			}else if(eCate.equals(Categorias.CatC.getDesc().toUpperCase().replace("Í", "I")) 
				|| letra == '3' || letra == 'C') {
				cat = Categorias.CatC;
				
			}else {
				System.out.println("Categoria no encontrada");
			}
		
		return cat;
	}
}

