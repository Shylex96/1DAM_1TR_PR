package es.studium.ejerciciosESP;
import java.util.Scanner;

public class CadenaAlReves
{

	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
			
		 String fraseOriginal, vuelta="";
		 char caracterDelante;
		 System.out.println("Escriba una frase:");
		 fraseOriginal = in.nextLine();
		 in.close();
	        
	      for (int i=0; i<fraseOriginal.length(); i++)
	      {
	        caracterDelante = fraseOriginal.charAt(i); 
	        vuelta = caracterDelante+vuelta;
	      }
	      System.out.println("Reversed word: "+ vuelta);
	   }
		  
	}
