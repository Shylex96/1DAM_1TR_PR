package es.studium.ejerciciosBoletinTablas1;

public class Ejercicio3
{

	public static void main(String[] args)
	{

		final int MAX = 20;
		int paresReves[] = new int[MAX];
		
		for (int i = 0; i < paresReves.length; i++)
		{
			paresReves[i] = i * 2;
			
		}
		
		for (int i = MAX-1; i >= 0; i--) 
		{
			System.out.println(paresReves[i]);
		}

	}

}
