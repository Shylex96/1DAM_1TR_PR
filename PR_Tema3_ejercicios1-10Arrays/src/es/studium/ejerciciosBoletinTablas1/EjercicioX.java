package es.studium.ejerciciosBoletinTablas1;

public class EjercicioX
{

	public static void main(String[] args)
	{
		
		// final int MAX = 10;
		int array[][] = new int [10][10];
		
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				array[i][j] = i+j; // Para cada posici�n del array, guardamos la suma de los �ndices de la matriz.
				System.out.println("Tabla " +i+j+ ": " + array[i][j]);
			}
		}
		
		
		


	}

}
