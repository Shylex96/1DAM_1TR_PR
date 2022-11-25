package es.studium.ejerciciosBoletinTablas1;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		/*
		final int maxArray[] = new int [3];
		maxArray[0] = 0;
		maxArray[1] = 0;
		maxArray[2] = 0;
		
		
		System.out.println(maxArray[0] + " " + maxArray[1] + " " + maxArray[2]);
		 */
		
		final int maxArray = 3;
		int tabla[] = new int [maxArray];
		
		for (int i = 0; i < maxArray; i++)
		{
			tabla[i] = 0;
		}

		for (int numero: tabla)
		{
			System.out.print(numero+ " ");
		}
		
	}

}
