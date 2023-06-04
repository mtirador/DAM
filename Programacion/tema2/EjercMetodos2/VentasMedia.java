package EjercMetodos2;
import java.util.Scanner;

public class VentasMedia {

	public static void main(String[] args) {
		
		/*/*1�) Realiza una aplicaci�n que nos pida un n�mero de ventas a
	introducir, despu�s nos pedir� tantas ventas por teclado como
	n�mero de ventas se hayan indicado. Al final mostrara la suma de
	todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		int contador=1;
		int ventas=0;
		int ventaT=0;
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Ingresar cuantas ventas ha tenido: ");
		int numero=ent.nextInt();
		
		do {
			
			System.out.println("Ventas: ");
			ventas=ent.nextInt();
			ventaT=ventaT+ventas;
			
			
			
			
			contador++;
			
			
			
			
		}while(contador<=numero);
		
		System.out.println(ventaT);
		
	}
}