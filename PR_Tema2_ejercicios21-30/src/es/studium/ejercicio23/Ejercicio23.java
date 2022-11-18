package es.studium.ejercicio23; // Sumar automáticamente los 100 primeros cuadrados.

public class Ejercicio23
{

	public static void main(String[] args)
	{

		System.out.println("La suma de los cuadrados para los 100 primeros números es: " + CalculoCuadrados());
	}

	public static int CalculoCuadrados()
	{
		int i, result = 0;

		for (i = 0; i <= 100; i++)
		{
			result = result + (i * i);
		}

		return (result);
	}

}
