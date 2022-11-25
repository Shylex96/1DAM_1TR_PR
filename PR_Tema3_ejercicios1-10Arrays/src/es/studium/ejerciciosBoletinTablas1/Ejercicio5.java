package es.studium.ejerciciosBoletinTablas1;

import java.util.Scanner;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla[] = new int[MAX];
		int numDefault;

		Scanner in = new Scanner(System.in);
		System.out.println("Dame un número:");
		numDefault = in.nextInt();
		in.close();

		for (int i = 0; i < MAX; i++)
		{
			tabla[i] = (numDefault + 1) * (numDefault + 1);
			numDefault++;
		}

		for (int n : tabla)
		{
			System.out.println(n);
		}

	}

}
