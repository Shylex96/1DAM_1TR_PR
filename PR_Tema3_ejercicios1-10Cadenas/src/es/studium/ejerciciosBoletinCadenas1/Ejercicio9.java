package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		String cadena;
		int longitud;
		int posicion;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		cadena = in.nextLine();
		System.out.println("Introduzca una posición:");
		posicion = in.nextInt();
		System.out.println("Introduzca la longitud:");
		longitud = in.nextInt();
		in.close();
		
		cadena = subcadena(cadena, longitud, posicion);
		System.out.println("La longitud de la frase con espacios es de: " +cadena);
		
	}



	private static String subcadena(String cadena, int longitud, int posicion)
	{
		
		int posfinal = longitud + posicion;
		return cadena.substring(posicion, posfinal);
		
	}

}
