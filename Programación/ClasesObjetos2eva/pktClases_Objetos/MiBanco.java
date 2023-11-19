package pktClases_Objetos;

public class MiBanco {

	public static void main(String[] args) {
	
	
	//CuentaCorriente pablo = new CuentaCorriente("Pablo");

	//System.out.println(pablo.ingresarInfo(100));
	//System.out.println(pablo.retirarInfo(40));
	//System.out.println(pablo.ingresarInfo(-11));
	//System.out.println(pablo.retirarInfo(100));
	
	//pablo.ingresar(100);
	
	//pablo.retirar(40);
	
	//pablo.ingresar(-11);
	
	//pablo.retirar(200);
	
	
	//System.out.println(pablo);
	
	
	CuentaCorriente[] clientes= new CuentaCorriente[5];
	
	CuentaCorriente marta = new CuentaCorriente("Marta");
	double saldoTotal=0;

	
	clientes[0]=new CuentaCorriente("Saul");
	clientes[1]=new CuentaCorriente("Andres");
	clientes[2]=new CuentaCorriente("Marta");
	clientes[3]=new CuentaCorriente("Irene",55);
	clientes[4]=new CuentaCorriente("Constantin");
	
	
	
	clientes[1].ingresar(99);
	clientes[2].ingresar(100);
	
	//System.out.println(clientes[0]);
	//System.out.println(marta);
	//System.out.println(clientes[1]);
	System.out.println("--->"+ clientes[1]);
	
	
	//cuentacorriente cli seria el iterador : y la lista que quiero recorrer en este caso clientes
	
	
					//con cli accedo al nombre de clientes
	for(CuentaCorriente cli : clientes) {
		if(cli.getTitular().equalsIgnoreCase("andres")) {
			cli.retirar(cli.getSaldo());
		}
		System.out.println(cli);
		saldoTotal+=cli.getSaldo();
		
	}

	
	System.out.println("El banco maneja: "+ saldoTotal);
	
	
	
		

	}

}
