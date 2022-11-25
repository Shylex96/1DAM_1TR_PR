package es.studium.ejerciciosBoletinTablas1; // Array bidimensional con char
import java.util.Scanner;

public class Ejercicio9_1
{

	public static void main(String[] args)
	{
	
		Scanner in = new Scanner(System.in);
		char tabla[][] = new char[3][4];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.println("Ingrese el valor de la posición (" + i + "," + j + "): ");
				tabla[i][j] = in.nextLine().charAt(0);
			}
		}
		in.close();
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0 ; j < 4; j++) 
			{
				System.out.println("Tabla (" + i + "," + j + "):" + tabla[i][j]);
			}
		}
	}
}
