package es.studium.ordenacionBurbuja;

import java.util.Scanner;

public class OrdenarBurbuja
{

	public static void main(String[] args)
	{
		// CONST
		final int TAM = 10;

		// VAR
		int array[] = new int[TAM];
		int i, j, aux;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM; i++)
		{

			System.out.println("Dame un número entero");
			array[i] = in.nextInt();
		}

		in.close();

		for (i = 0; i < TAM; i++)
		{
			for (j = 0; j < TAM - i - 1; j++)
			{
				if (array[j] > array[j + 1]) // Cambiando el "<" y ">" hace que lo ordene de mayor a menor o de menor a mayor

				{
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}

		System.out.println("La tabla ordenada queda así:");
		for (i = 0; i < TAM; i++)
		{
			System.out.println(array[i]);
		}

	}

}