package PrimerasClases;

public class Testeo {
	public static void main(String []args) {

	//practica de if-else	
		
/*		
	int operacion=3, num1=8,num2=14,resultado=0;
	
	if(operacion==1){
		resultado=num1+num2;
		System.out.println("La suma : "+num1 +"+"+num2 +"="+ resultado);
	}else if(operacion==2) {
		resultado= num1-num2;
		System.out.println("La resta : "+num1 +"-"+num2 +"="+ resultado);
	}else if (operacion==3) {
		resultado= num1*num2;
		System.out.println("La multiplicacion : "+num1 +"*"+num2 +"="+ resultado);
	}else if (operacion==4) {
		resultado=num1/num2;
		System.out.println("La division : "+num1 +"/"+num2 +"="+ resultado);
	}else {
		
		System.out.println(" La opcion que legiste no existe");
	}
	
	*/
	
		
		
		//FIBONACCI
		
        int serie = 10, num1 = 0, num2 = 1, suma = 1;
        
        // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 0; i < serie; i++) {
             
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
             
        }
		
		
		
		
		
	}//fin main

}// fin class
