package es.studium.ordenacionSeleccion;

import java.util.Scanner;

public class OrdenarSeleccion
{

	public static void main(String[] args)
	{
		// CONST
		final int TAM = 10;

		// VAR
		int array[] = new int[TAM];
		int i, j, aux, indice_menor;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM; i++)
		{

			System.out.println("Dame un número entero");
			array[i] = in.nextInt();
		}

		in.close();

		for (i = 0; i < TAM; i++)
		{
			indice_menor = i;
			for (j = i + 1; j < TAM - 1; j++)
			{
				if (array[j] < array[indice_menor]) // Cambiando el "<" y ">" hace que lo ordene de mayor a menor o de menor a mayor

				{
					indice_menor = j;
				}
			}
			aux = array[i];
			array[i] = array[indice_menor];
			array[indice_menor] = aux;
		}

		System.out.println("La tabla ordenada queda así:");
		for (i = 0; i < TAM; i++)
		{
			System.out.println(array[i]);
		}

	}

}
