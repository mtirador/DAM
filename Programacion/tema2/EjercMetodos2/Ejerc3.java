package EjercMetodos2;

import java.util.Scanner;

public class Ejerc3 {
	public static void main(String[] args) {

	/*Crear un programa en Java que nos pida el número de asignaturas de un
curso. Posteriormente solicitar las notas de cada una de las asignaturas
(con decimales) para que mediante un método calcule la media aritmética.
Deberá mostrarse la media aritmética en número y con otro método que nos
devuelva o muestra un mensaje con:
 Insuficiente si es menor a 5.
 Suficiente si es 5 o más y menos de 6.
 Bien si es 6 o más pero menor de 7,5.
 Notable si es 7,5 o menor de 9.
 Sobresaliente si 9 o más.*/
		
		
		int asignaturas = 0;
		double[]mylist ;


		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese el numero de asignaturas del curso: ");
		asignaturas=ent.nextInt();


		mylist  = new double[asignaturas];



		for(int i=0; i<mylist.length ;i++) {  
		     System.out.println("ingrese nota : ");
		     mylist[i]=ent.nextDouble();
		}

		System.out.println("la media es "+ imprimirArray(mylist) + notaMedia(mylist));
		
	}//fin main
	
	public static double imprimirArray (double lista[]){
		double media =0.0;
        for(int i=0;i<lista.length;i++){
            media = media + lista[i];
           
        }
        return(media/lista.length);
    }
	
	public static double notaMedia (double lista[]) {
		double notaFinal=0.0;
		double media =0.0;
        for(int i=0;i<lista.length;i++){
            media = media + lista[i];
           
        }
        
        notaFinal= media/lista.length;
        
        if(notaFinal<5) { 
			System.out.println("INSUFICIENTE");
		}else if(notaFinal>=5 && notaFinal<6) {
			System.out.println("SUFICIENTE ");
		}else if(notaFinal>=6 && notaFinal<7.5) {
			System.out.println("BIEN");
		}else if(notaFinal>=7.5 && notaFinal<9) {
			System.out.println("NOTABLE");
		}else {
			System.out.println("SOBRESALIENTE");
		}
	
		
		
		return notaFinal;
	}

}//fin class


