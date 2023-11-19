package pkt;

public class TablasDeVerdad {

	public static void main(String[] args) {
		
		int numero = 5;
		int CantidadRetrasos = 20;
		int CantidadErrores = 16;
		Boolean Recarga = true;
		Boolean CargaTotal = false;
		Double PorcentajeCarga = 19.80;
		Boolean Energia = false;

		System.out.println("¿numero >5 ?");
		valor(numero);//si el numero es mayor a 5
		System.out.println("¿numero =5?");
		valor2(numero); // si un numero es igual a 5
		System.out.println("Numero >5 o Numero = 5.");
		valor3(numero); //Numero > 5 o Numero = 5.
		System.out.println("CantidadErrores y CantidadRetrasos son pares?");
		cantidadPar(CantidadRetrasos,CantidadErrores);
		System.out.println("CantidadErrores es menor que 6 o CantidadRetrasos es\r\n"
				+ "menor que 5.");
		verdad65(CantidadErrores,CantidadRetrasos);
		System.out.println("CantidadRetrasos >8 y CantidadErrorres >5");
		verdad85(CantidadErrores,CantidadRetrasos);
		System.out.println("recarga es verdad y porcentajeCarga es menor de 20.00 y energia es verdad");
		rePorEne(Recarga,PorcentajeCarga,Energia);
		System.out.println("Recarga es verdad y energia falso");
		cargaEne(Recarga,Energia);
		System.out.println("CargaTotal es falso y Recarga es verdad y Energia es verdad");
		cargaReEne(CargaTotal,Recarga,Energia);
		System.out.println("cargaTotal es verdad y recarga es falso y energia es falso");
		verdadVari(CargaTotal,Recarga,Energia);
	    System.out.println("Si PorcentajeCarga es igual a 100.00, entonces CargaTotal es verdad y Recarga es falso:");
	    verdadPenultima(CargaTotal, Recarga, PorcentajeCarga);
	    System.out.println("(CantidadErrores es mayor que 10 y energía es verdad) o (Numero es 5 y CantidadRetrasos es menor que 20):");
	    verdadUltima(CantidadErrores, Energia, numero, CantidadRetrasos);

		
	}
	
	


	private static void valor(int numero) {
		System.out.println(numero>5? true : false);	
	}
	
	private static void valor2(int numero) {
		System.out.println(numero==5?true:false);
	
	}
	private static void valor3(int numero) {
	 System.out.println(numero>5 || numero==5?true:false);
	}
	
	private static void cantidadPar(int cantErrores, int cantRetrasos) {
	    boolean sonPares = (cantErrores % 2 == 0) && (cantRetrasos % 2 == 0);
	    System.out.println(sonPares);
	}
	
	private static void verdad65(int cantErr, int cantRetr) {
	    System.out.println(cantErr < 6 || cantRetr < 5 ? true : false);
	}

	private static void verdad85(int cantRetr, int cantErr) {
	    System.out.println(cantRetr > 8 && cantErr > 5 ? true : false);
	}

	
	 private static void rePorEne(boolean recarga,double porcentaje,boolean energia) {
	        // recarga es verdad y porcentajeCarga es menor de 20.00 y energia es verdad
	       System.out.println(recarga && porcentaje<20.00 && energia?true:false); 
	 }

	 private static void cargaEne(boolean recarga,boolean energia) {
		 System.out.println(recarga&&energia?true:false);
		 
	 }
	 
	 private static void cargaReEne(boolean carga,boolean recarga,boolean energia) {
			// TODO Auto-generated method stub
			System.out.println(carga && recarga && energia?true:false);
		}
	 
	 private static void verdadVari(boolean carga,boolean recarga, boolean energia) {
			// TODO Auto-generated method stub
			System.out.println(!carga&&recarga&&!energia?true:false);
			
		}
	 
	 private static void verdadPenultima(boolean cargaTotal, boolean recarga, double porcentajeCarga) {
	     System.out.println(porcentajeCarga == 100.00 && cargaTotal && !recarga);
	 }

	 
	 private static void verdadUltima(int cantErrores, boolean energia, int numero, int cantRetrasos) {
	     System.out.println((cantErrores > 10 && energia) || (numero == 5 && cantRetrasos < 20));
	 }

	

	 
	 
	 
}
