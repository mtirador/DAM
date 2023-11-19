package PrimerasClases;

public class CondicionesCompuestas2 {
    public static void main(String[] args) {
    	
    	int diaNac = 1;
        int mesNac = 10;
        int anioNac = 2004;

        boolean mayorEdad = false;

        if(anioNac < 2004){
            mayorEdad = true;
        }else if( (anioNac == 2004 && mesNac < 10) || (anioNac == 2004 && mesNac == 10 && diaNac <= 10)){
            mayorEdad = true;
        }

        if(mayorEdad){
            System.out.println("Es mayor edad");
        }else{
            System.out.println("No es mayor edad");
        }

    }
    	
    	
        }


//int diaNac = 10;
//int mesNac = 10;
//int anioNac = 2004;

//boolean mayorEdad = false;

//if((anioNac < 2004)  (anioNac == 2004 && mesNac < 10)  (anioNac == 2004 && mesNac == 10 && diaNac <= 9)){
   // System.out.println("Es mayor edad");
//}else{
    //System.out.println("No es mayor edad");
//}
	


//condicional dd/mm/yyyy

//declarar variables enteras , determinar con unacondicion si esa persona es mayor de edad