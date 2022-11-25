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

		// Si dejamos aqu� el syso preguntar�amos solo 1 vez.
		// System.out.println("Dame 10 n�meros:");
		
		// Si conocemos el n�mero de iteraciones colocamos for en vez de do porque es m�s eficiente.
		for (int i = 0; i < MAX; i++) {
			// Si dejamos aqu� el syso preguntar�amos las 10 veces.
			System.out.println("Dame un n�mero:");
			array[i] = in.nextInt();
		}
		in.close();
		
		// Obtener el mayor n�mero:
		
		int maxNum = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if (array[i] > maxNum)
				maxNum = array[i];
		}
		System.out.println("El n�mero m�ximo es: " + maxNum);
		
		// Obtener el menor n�mero:
		int minNum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < minNum)
				minNum = array[i];
		}
		System.out.println("El n�mero m�nimo es: " + minNum);
		
		// Obtener la media de los n�meros:
		
		double medNum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			// medNum = medNum + array[i];
			medNum += array[i];
		}
		
		System.out.println("La media de los n�meros es: " + medNum/MAX);
		
		
		
		}
		

	}

