package pktClases_Objetos;

public class Fclass {
	
	
	/*Para practicar esta tarde se pide realizar una clase que maneje la sintonia de una radio. 
	Para ello se definira como atributo double la frecuencia sintonizada (valor minimo 80.00 y maximo 180.00).
	Se podra subir y bajar sintonia de 0.5 en 0.5 y si se sube mas de 180.00 se volvera a pasar a 80. 
	Si bajamos de 80 se sintonizara 180.
	Crear una clase main que pruebe la clase y añadir un metodo mostrar que indique la frecuencia sintonizada.*/
	
			
			private double frecuencia=0;
			public final double fMax=180.0;
			public final double fMin=80.0;
			
			
			
			
			public Fclass() {
				
				this.frecuencia=fMin;
			}
			
			public Fclass(double frecuencia ) {
				if(frecuencia <fMin) {
					this.frecuencia=fMin;
				}else if(frecuencia>fMax) {
					frecuencia=fMax;
				}else {
					
				}
				this.frecuencia=frecuencia;
				
			}
			
			public double getFrecuencia() {
				return frecuencia;
			}
			public void setFrecuencia(double frecuencia) {
				
				this.frecuencia = frecuencia;
			}
			public double getfMax() {
				return fMax;
			}
			
			
			public double getfMin() {
				return fMin;
			}
			
			
			
			public void bajar(double numero) {
				if(frecuencia - 0.5<80.0) {
					frecuencia=180.0;
				}else {
					frecuencia-=0.5;
				}
				
				
			}
			
			public void subir(double numero) {
				if(frecuencia +0.5>180.0) {
					frecuencia=80.0;
				}else {
					frecuencia+=0.5;
				}				
			}
			
			
			
			public String toString() {
				
				return "La frecuencia sintonizada " + getFrecuencia();
			}
		
			
			
			

}
