package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Dame la primera cadena: ");
		cadena1 = in.nextLine();
		System.out.println("Dame la segunda cadena: ");
		cadena2 = in.nextLine();
		in.close();
		
		if (cadena1.length() == cadena2.length()) 
		{
			System.out.println("La cadena 1 y 2 son iguales en tamaño.");
		} else if (cadena1.length() > cadena2.length()) {
			System.out.println("La cadena 1 es mayor que la cadena 2 en tamaño");
		} else {
			System.out.println("La cadena 2 es mayor que la cadena 1 en tamaño");
		}

	}

}
