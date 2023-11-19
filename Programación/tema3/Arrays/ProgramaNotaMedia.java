package Arrays;

import java.util.Scanner;

public class ProgramaNotaMedia {

	public static void main(String[] args) {
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



        System.out.println("La media es "+ imprimirArray(mylist)

        +" \nCalificación final" + notaMedia(mylist));



}//fin main



public static double imprimirArray (double lista[]){

        double media =0.0;

                for(int i=0;i<lista.length;i++){

                    media = media + lista[i];            

                }

                return(media/lista.length);

}



public static String notaMedia (double lista[]) {

        double notaFinal=0.0;

        String notaLetra ="";

        notaFinal= imprimirArray(lista);

               

        if(notaFinal<5) {

                      notaLetra ="INSUFICIENTE";

        }else if(notaFinal>=5 && notaFinal<6) {

                      notaLetra ="SUFICIENTE ";

        }else if(notaFinal>=6 && notaFinal<7.5) {

                      notaLetra ="BIEN";

        }else if(notaFinal>=7.5 && notaFinal<9) {

                      notaLetra ="NOTABLE";

        }else {

                      notaLetra ="SOBRESALIENTE";

        }



        return notaLetra;

}

	}


