package es.studium.TallerSecuencial;

import java.util.Scanner;

public class BusquedaSecuencial
{

	public static void main(String[] args)
	{
		// B�squeda secuencial:

		// 1� for para meter los n�meros por teclado
		// 2� indicar qu� n�mero deseamos encontrar
		// 3� while para buscarlo, cuando lo encuentre para
		// 4� 1-mientras !no lo encuentre, seguir buscando, 2-no haya llegado al final
		// de la tabla
		// (necesario para que si el elemento no est� en la tabla, pare cuando llegue al
		// final de la tabla)
		// 5� un if else para indicar si lo encuentra o no e indicar su posici�n

		// CONST
		final int TAM = 10;

		// VAR
		int tabla[] = new int[TAM];
		int i;
		boolean encontrado;
		int elemento;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM - 1; i++)
		{
			System.out.println("Dame un n�mero entero");
			tabla[i] = in.nextInt();
		}

		System.out.println("Dame el n�mero a buscar");
		elemento = in.nextInt();

		encontrado = false;
		i = 0;

		while ((!encontrado) && (i < TAM))
		{
			if (tabla[i] == elemento)
			{
				encontrado = true;
			} else
			{
				i++;
			}
		}

		in.close();
		if (encontrado == true)
		{
			System.out.println("El elemento se encontr� en la posici�n: " + i);
		} else
		{
			System.out.println("\nElemento no encontrado.");
		}

	}
}
