package EjercMetodos2;
import java.util.Scanner;

public class ProgNotaMedia {

	public static void main(String[] args) {
		
		//crear la media de notas con un metodo, ingresando las notas. para aprobar tiene que ser 5 o mas,(mates,lengua,fisica)
		
		double Matematicas;
		double Lengua;
		double Fisica;
		
		 
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Ingrese las nota de Matematicas: ");
		Matematicas=ent.nextDouble();
		System.out.println("Matematicas = " + Matematicas);
		System.out.println("Ingrese la nota de Lengua: ");
		Lengua=ent.nextDouble();
		System.out.println("Lengua = "+ Lengua);
		System.out.println("Ingrese la nota de Fisica ");
		Fisica=ent.nextDouble();
		System.out.println("Fisica = "+ Fisica);
		
		System.out.println(Media(Fisica,Lengua,Matematicas));
		
		
		if(Media(Fisica,Lengua,Matematicas)>=5) {
			System.out.println("APTO");
		}else {
			System.out.println("NO APTO");
		}
		
		

	}
	
	public static double Media(double a,double b, double c) {
		
		double Promedio;
		
		Promedio=(a+b+c)/3;
		
	
		
		return Promedio;
	}

}
