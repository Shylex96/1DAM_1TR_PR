package es.studium.ejerciciosBoletinTablas1;
import java.util.Scanner;
// import java.util.Arrays;

public class Ejercicio8
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		Integer array[] = new Integer [MAX];
		Scanner in = new Scanner (System.in);

		for (int i = 0; i < MAX; i++) {
			System.out.println("Dame un número:");
			array[i] = in.nextInt();
		}
		in.close();

		int maxNum = array[0];
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] > maxNum)
				maxNum = array[i];
		}
		System.out.println("El número máximo es: " + maxNum+"\n");
		
		for (int i = 0; i < MAX; i++) {
			if (array[i] == maxNum) {
				System.out.println("El número máximo se repite en la posición: " +(i+1));
			}
		}
		
		
		/* No hace falta esto porque con el bucle de arriba nos dice dónde se repite 
		int getArrayIndex = Arrays.asList(array).indexOf(maxNum);
		System.out.println("La posición del número mayor en el array es: " +(getArrayIndex+1));
		*/
		
		/* Funciona igual que lo que hice, pero hecho con un bucle:
		int posicion = 1;
		for (int i = 1 ; i < array.length; i++) {
			posicion = array[i] > array[posicion] ? i : posicion;
		}
		 */
		
		
		
	}

}
