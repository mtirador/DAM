package pktClases_Objetos;

public class CuentaCorriente {
	
	
	/* CUENTA CORRIENTE: el string titular es obligatorio, saldo; ingresar(), retirar()*/


	
		//atributos o propiedades
	
		private String titular;
		private double saldo;
		
		
		public CuentaCorriente(String titular) {
			//this(titular,0);
			this.titular= titular;
			this.saldo=0;
		}
		
		
		public CuentaCorriente(String titular,double saldo) {
			this.titular=titular;
			this.saldo=saldo;
		}
		
		public String getTitular() {
			return this.titular;
		}
		public double getSaldo() {
			return this.saldo;
		}
		
		public void ingresar(double cantidad) {
			if(cantidad>0) {
				this.saldo+=cantidad;
			}
		}
		
		public void retirar(double cantidad) {
			if(cantidad<=this.saldo && cantidad >0) {
				this.saldo -= cantidad;	
			}else if (cantidad > this.saldo && cantidad >0) {
				this.saldo -= this.saldo;
			}
		}
		
		public String ingresarInfo(double cantidad) {
			String mensaje= "";
			if(cantidad>0) {
				this.saldo+=cantidad;
				mensaje = "Se ha ingresado "+ cantidad + " saldo total= "+ this.getSaldo();
			}else {
				mensaje = " No se permite ingresar cantidades negativas";
			}
		
			return mensaje;
			
			
		}
		
		public String retirarInfo(double cantidad) {
			String mensaje="";
			if (cantidad >0 && cantidad<=this.getSaldo()) {
				this.retirar(cantidad);
				mensaje= "Va a retirar "+ cantidad+ " quedando " + this.getSaldo();
			}else {
				mensaje =" no se permite retirar cantidades negativas o cero";
			}
			return mensaje;
			
		}
		
		

		//-------------------------------------------
		
		public void setTitular(String titular) {
			this.titular = titular;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		public String toString() {
			
			return "El saldo de la cuenta de " + getTitular() + " es "+ String.format("%.2f",getSaldo());			
					
		}
		
		
		
		
		
		

	

}
