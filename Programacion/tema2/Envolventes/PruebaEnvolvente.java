package Envolventes;


import java.util.Scanner;

public class PruebaEnvolvente {
	 public static void main(String[] args) {
	       
	        Scanner ent = new Scanner(System.in);
	        String frase="";
	        int posLetra=0, contLetras=0, contNum=0;
	           
	        System.out.println("Introduce una cadena de caracteres");
	        frase = ent.nextLine();
	       
	        do {
	                       
	            if(Character.isDigit(frase.charAt(posLetra))) {
	                contNum++;
	            }else if(Character.isLetter(frase.charAt(posLetra))) {
	                contLetras++;
	            }
	           
	            posLetra++;
	        }while(posLetra < frase.length());
	       
	        System.out.println("Numeros: " + contNum + "\nLetras: " + contLetras);
	    }
	}


