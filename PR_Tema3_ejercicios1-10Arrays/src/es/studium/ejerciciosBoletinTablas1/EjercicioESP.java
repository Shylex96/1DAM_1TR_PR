package es.studium.ejerciciosBoletinTablas1; // Probando cosas extras.

import java.util.Scanner;

public class EjercicioESP
{

	// int m,n;
	static int m;
	static int n;

	int first[][] = new int[m][n];
	int second[][] = new int[m][n];

	EjercicioESP(int[][] first, int[][] second, int m, int n)
	{
		this.first = first;
		this.second = second;
		this.m = m;
		this.n = n;
	}

	public static void main(String[] args)
	{
		int a, b, c, d; // Filas y Columnas de las matrices
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce primero el número de filas y luego el número de columnas de la matriz:");
		a = in.nextInt();
		b = in.nextInt();

		int first[][] = new int[a][b];
		int second[][] = new int[a][b];

		// Elementos de la primera matriz:
		System.out.println("Introduce los elementos de la primera matriz:");

		for (c = 0; c < a; c++)
		{
			for (d = 0; d < b; d++)
			{
				first[c][d] = in.nextInt();
			}
		}

		// Elementos de la segunda matriz:
		System.out.println("Introduce los elementos de la segunda matriz:");

		for (c = 0; c < a; c++)
		{
			for (d = 0; d < b; d++)
			{
				first[c][d] = in.nextInt();
			}
		}

		// Mostrar elementos de la primera matriz:
		System.out.println("\nLos elementos de la primera matriz son: ");
		for (c = 0; c < m; c++)
		{
			for (d = 0; d < n; d++)
			{
				System.out.print(first[c][d] + "\t");
			}
			System.out.println();
		}

		// Mostrar elementos de la segunda matriz:
		System.out.println("\nLos elementos de la segunda matriz son: ");
		for (c = 0; c < m; c++)
		{
			for (d = 0; d < n; d++)
			{
				System.out.print(first[c][d] + "\t");
			}
			System.out.println();
		}

		EjercicioESP a1 = new EjercicioESP(first, second, m, n);
		a1.addmatrix(a1);
	}

	public void addmatrix(EjercicioESP a)
	{
		int c, d;
		int sum[][] = new int[a.m][a.n];

		for (c = 0; c < a.m; c++)
		{
			for (d = 0; d < a.n; d++)
			{
				sum[c][d] = a.first[c][d] + a.second[c][d];
			}
		}
		System.out.println("\nSuma de las dos matrices:");

		for (c = 0; c < a.m; c++)
		{
			for (d = 0; d < a.n; d++)
			{
				System.out.println(sum[c][d] + "\t");
			}
			System.out.println();
		}
	}
}
