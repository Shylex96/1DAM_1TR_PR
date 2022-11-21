package es.studium.ejerciciosESP;
import java.util.Scanner;


public class NoVocales {

	public static void main(String args[]) 
	{
	    Scanner in = new Scanner(System.in);
	
	    String frase;
	    System.out.println("Escriba una frase:");
	    frase = in.nextLine();
		in.close();
		
	    String cadenaSoloConsonantes="";
	    String cadenaSoloVocales="";
	    int sentence = frase.length();
	    char caracter=' ';

	        for (int i = 0; i < sentence; i++) {
	            caracter = frase.toLowerCase().charAt(i);
	
	            if ((caracter == 97) || (caracter == 111) || (caracter==101) || (caracter==105) || (caracter==117)) 
	            {
	
	
	                  cadenaSoloVocales+=caracter;
	            }else{
	                  cadenaSoloConsonantes+=caracter;
	
	            }
	
	        }
	        
   System.out.println("\n" + "La frase entera es: "+frase);
   System.out.println("La frase sin vocales es: "+cadenaSoloVocales);
   System.out.println("La frase sin consonantes es: "+cadenaSoloConsonantes);
   
   System.out.println("\n" + "El número de letras en la frase sin vocales es: " +frase.length());
   System.out.println("El número de letras en la frase sin vocales es: " +cadenaSoloVocales.length());
   System.out.println("El número de letras en la frase sin vocales es: " +cadenaSoloConsonantes.length());
    }
}