package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		
		String cadena;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba una cadena con mayúsculas y minúsculas:");
		cadena = in.nextLine();
		in.close();
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
	}

}
