package es.studium.ejerciciosBoletinTablas1;
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		int array[] = new int [MAX];
		// array = new int [MAX];
		Scanner in = new Scanner (System.in);

		// Si dejamos aquí el syso preguntaríamos solo 1 vez.
		// System.out.println("Dame 10 números:");
		
		// Si conocemos el número de iteraciones colocamos for en vez de do porque es más eficiente.
		for (int i = 0; i < MAX; i++) {
			// Si dejamos aquí el syso preguntaríamos las 10 veces.
			System.out.println("Dame un número:");
			array[i] = in.nextInt();
		}
		in.close();
		
		// Obtener el mayor número:
		
		int maxNum = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if (array[i] > maxNum)
				maxNum = array[i];
		}
		System.out.println("El número máximo es: " + maxNum);
		
		// Obtener el menor número:
		int minNum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < minNum)
				minNum = array[i];
		}
		System.out.println("El número mínimo es: " + minNum);
		
		// Obtener la media de los números:
		
		double medNum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			// medNum = medNum + array[i];
			medNum += array[i];
		}
		
		System.out.println("La media de los números es: " + medNum/MAX);
		
		
		
		}
		

	}

