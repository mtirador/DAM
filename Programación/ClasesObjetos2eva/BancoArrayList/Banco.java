package BancoArrayList;

public class Banco {
	
	private String titular;
	private double saldo;
	
	
	public Banco(String titular){
		this.titular=titular;
		this.saldo=0;
	}
		
	public Banco(String titular,double saldo) {
		this.titular=titular;
		this.saldo=saldo;
		
		
	}

	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			this.saldo+=cantidad;
		}
		
	}
	
	public void retirar(double cantidad){
	
		if(cantidad>0 && this.saldo>=cantidad) {
			this.saldo-=cantidad;
		}else if(cantidad>this.saldo && cantidad>0) {
			this.saldo-=cantidad;
		}
	}
	
	public String mensajeRetirar(double cantidad) {
		String mensaje="";
		
		if (cantidad>0) {
			this.saldo-=cantidad;
			System.out.println("ha retirado la cantidad e " + cantidad);
			System.out.println("su saldo actual es: " + this.getSaldo());
			
		}else {
			System.out.println("no se puede");
		}
		
		return mensaje;
	}
	
	public String mensajeIngresar(double cantidad) {
		String mensaje="";
		
		if(cantidad>0 && this.saldo>=cantidad) {
			this.saldo+=cantidad;
			System.out.println("Ha ingresado la cantidad de " + cantidad);
			System.out.println("su saldo actual es: " +this.getSaldo());
		}else {
			System.out.println("No se permiten ingresar cantidades negativas.");
		}
		
		return mensaje;
		
	}
	
	
	public String toString() {
		return "Nombre del titular: "+ this.titular+ "||Saldo: "+ this.getSaldo();
	}
	
		
		
		
}


