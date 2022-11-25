package es.studium.ejerciciosBoletinTablas1;

public class Ejercicio2
{

	public static void main(String[] args)
	{

		final int MAX = 20;
		int pares[] = new int[MAX];
		
		for (int i = 0; i < pares.length; i++)
		{
			pares[i] = i * 2;
		}
		
		for (int numero: pares) {
			System.out.println(numero);
		}

	}

}
