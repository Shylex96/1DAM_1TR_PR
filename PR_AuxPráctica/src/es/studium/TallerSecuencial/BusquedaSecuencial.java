package es.studium.TallerSecuencial;

import java.util.Scanner;

public class BusquedaSecuencial
{

	public static void main(String[] args)
	{
		// Búsqueda secuencial:

		// 1º for para meter los números por teclado
		// 2º indicar qué número deseamos encontrar
		// 3º while para buscarlo, cuando lo encuentre para
		// 4º 1-mientras !no lo encuentre, seguir buscando, 2-no haya llegado al final
		// de la tabla
		// (necesario para que si el elemento no está en la tabla, pare cuando llegue al
		// final de la tabla)
		// 5º un if else para indicar si lo encuentra o no e indicar su posición

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
			System.out.println("Dame un número entero");
			tabla[i] = in.nextInt();
		}

		System.out.println("Dame el número a buscar");
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
			System.out.println("El elemento se encontró en la posición: " + i);
		} else
		{
			System.out.println("\nElemento no encontrado.");
		}

	}
}
