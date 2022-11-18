package es.studium.ejercicio24; // Sumar los cuadrados comprendidos entre los 100 primeros números que sean pares.

public class Ejercicio24
{

	public static void main(String[] args)
	{
		System.out.println(
				"La suma de los cuadrados de los pares comprendidos entre 1 y 100 es: " + SumaCuadradosPares());
	}

	public static int SumaCuadradosPares()
	{
		int i, resultado = 0;
		for (i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			{
				resultado = resultado + (i * i);
			}
		}
		return (resultado);

	}
}
