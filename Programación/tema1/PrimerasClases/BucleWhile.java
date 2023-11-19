package PrimerasClases;
//
//public class BucleWhile {
//	public static void main(String[]args) {
//		
//	
//		int contador=1;
//		
//		while(contador<=10) {
//			
//			System.out.println(contador);
//			contador++;
//			
//			
//			
//			
//		}
//	}
//
//}
//	public class BucleWhile{
//		
//		public static void main(String[]args) {
//			
//			int contador=1,tabla=8;
//			
//			System.out.println("Tabla del " + tabla);
//			
//			while(contador<=10) {
//				System.out.println(tabla + "*" + contador + "=" + (tabla*contador));
//				
//				contador++;
//				
//			}
//		}
//	
//}

	public class BucleWhile{
		
		public static void main(String[] args) {
			
			int numero=100;
			
			while(numero>=0) {
				if(numero%2 == 0) {
					System.out.println(numero);
					numero-=2;
				}
			}
		}
	}