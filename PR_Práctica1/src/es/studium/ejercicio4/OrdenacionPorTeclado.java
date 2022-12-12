package es.studium.ejercicio4;
//Importo el Scanner que usaremos más tarde.
import java.util.Scanner; 

//Ejercicio 4:

public class OrdenacionPorTeclado
{

	public static void main(String[] args)
	{
	
		// Declaro una Array de 10 elementos y 3 enteros.
		final int MAX = 10;
		int array[] = new int[MAX];
		int i, j, auxiliar;
		
		// Inicio el Scanner.
		Scanner in = new Scanner(System.in);

		// Recorremos el array pidiendo los números por teclado
		// y guardándolos en el array.
		for (i = 0; i < MAX; i++)
		{
			System.out.println("Dame un número entero");
			array[i] = in.nextInt();
		}
		
		// Cerramos teclado porque ya no lo necesitaremos.
		// Seguirá apareciendo un 'Warning' por el bucle.
		in.close();
		
		
		// Aquí hay un doble bucle indexado. El primero recorre el array entero
		// y el segundo va comparándose con el valor del número de la siguiente posición.
		// Si el número con el que se compara es mayor que él, se cambian de posición.
		for (i = 0; i < MAX; i++)
		{
			for (j = i + 1; j < MAX; j++)
			{
				// Cambiando el símbolo a ">" lo ordena de menor a mayor.
				if (array[i] < array[j]) 
				{
					// Para no perder el valor necesitamos un auxiliar.
					// Guardamos el número mayor en el auxiliar, luego el valor del array[j] en el array[i]
					// y finalmente le devolvemos el valor del array[j] desde el auxiliar.
					auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}
		
		// Por último sacamos un 'Syso' de que el array está ordenado.
		System.out.println("La tabla ordenada queda así:");
		// Para ello usamos este bucle que recorre el array y lo va mostrando, ahora sí ordenado.
		for (i = 0; i < MAX; i++)
		{
			System.out.println(array[i]);
		}

	}

}
