package es.studium.ordenacionIntercambio;

import java.util.Scanner;

public class OrdenarIntercambio
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
			for (j = i + 1; j < TAM; j++)
			{
				if (array[i] < array[j]) // Cambiando el "<" y ">" hace que lo ordene de mayor a menor o de menor a mayor

				{
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
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
