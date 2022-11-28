package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class EjercicioX
{

	public static void main(String[] args)
	{
		String cadena;
		int longitud;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca la cadena:");
		cadena = in.nextLine();
		System.out.println("Introduzca la longitud:");
		longitud = in.nextInt();
		in.close();
		
		if (cadena.length() < (longitud))
		{
			System.out.println("La longitud dada excede la frase.");
		} else {
			cadena = subcadena(cadena, longitud);
			System.out.println("La longitud de la frase con espacios es de: " + cadena);
		}

	}
	

	private static String subcadena(String cadena, int longitud)
	{
		
		int posinicial = (cadena.length()) - longitud;
		return cadena.substring(posinicial);
		
	}

}

