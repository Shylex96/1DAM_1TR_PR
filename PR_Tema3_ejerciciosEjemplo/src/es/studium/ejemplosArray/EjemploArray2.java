package es.studium.ejemplosArray;
import java.util.Scanner;

public class EjemploArray2
{

	public static void main(String[] args)
	{
		int tablaEnteros[] = new int[10];

		Scanner in = new Scanner(System.in);
		// Pedir los valores al usuario

		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Dame el número entero de la posición " + i);
			tablaEnteros[i] = in.nextInt();
		}
		in.close();
		// Tratamiento de los valores
		// Mostrar valores de la tabla
		/*
		 * 
		 * for (int i = 0; i < tablaEnteros.length; i++) {
		 * System.out.println("Valor de la posición " +i+ ": " + tablaEnteros[i]); }
		 */

		for (int i = 0; i < tablaEnteros.length; i++)
		{
			tablaEnteros[i] = tablaEnteros [i] * 2;
			
			System.out.println("Los valores de la tabla x2 son: " + i + ": " + tablaEnteros[i]);
		}

	}

}
