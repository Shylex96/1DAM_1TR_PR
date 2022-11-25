package es.studium.ejerciciosBoletinTablas1; // Array bidimensional con int
import java.util.Scanner;
import java.util.*;

public class Ejercicio9_2
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca el número de filas:");
		int filas = in.nextInt();
		System.out.println("Introduzca el número de columnas:");
		int columnas = in.nextInt();
		
		int[][] a = new int [filas][columnas];
		
		System.out.print("Introduzca " +filas+ "x" +columnas+ " = " +(filas * columnas)+ " enteros: ");
		for (int i = 0; i < filas; i++) 
		{
			for (int j = 0; j < columnas; j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		in.close();
		System.out.println("Estos son los " +(filas * columnas)+ " números enteros en un array bidimensional de: " +filas+ "x" +columnas);
		System.out.println(Arrays.deepToString(a));
	}

}
