package es.studium.ejerciciosBoletinTablas1;
import java.util.Scanner;

public class Ejercicio1
{

	public static void main(String[] args)
	{
		int tablaEnteros[] = new int[4];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Dame el número entero de la posición " + i);
			tablaEnteros[i] = in.nextInt();
		}
		in.close();
		
		for (int i = 0; i < tablaEnteros.length; i++)
		{
			
			System.out.println("Los valores de la tabla en la posición " + i + " es: " + tablaEnteros[i]);
		}

	}

}
