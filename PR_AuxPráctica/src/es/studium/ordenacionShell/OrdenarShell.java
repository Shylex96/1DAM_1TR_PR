package es.studium.ordenacionShell;
import java.util.Scanner;

public class OrdenarShell
{

	public static void main(String[] args)
	{

		// CONST
		final int TAM = 10;

		// VAR
		int array[] = new int[TAM];
		int salto, aux, i;
		boolean cambios;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM; i++) 
		{
			System.out.println("Dame un número entero");
			array[i] = in.nextInt();
		}
		in.close();

		for (salto = TAM/2; salto !=0; salto = salto/2)
		{
			cambios = true;
			while (cambios == true) 
			{
				cambios = false;
				for (i = salto; i < TAM; i++) 
				{
					if (array[i-salto] > array[i])
					{
						aux = array[i];
						array[i] = array[i-salto];
						array[i-salto] = aux;
						cambios = true;
					} 
				}
			}
		}
		System.out.println("La tabla ordenada queda así:");
		for (i = 0; i < TAM; i++) 
		{
			System.out.println(array[i]);
		}
	}
}


