package es.studium.ejercicio2; // Suma de dos n�meros que yo ingrese.
import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{
		int x, y;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos n�meros enteros para calcular la suma:");
		x = in.nextInt();
		y = in.nextInt();
		in.close();
		// z = x+y
		// Se podr�a agregar otra variable z que sea z = x+y y al final 
		System.out.println("La suma de los n�meros enteros es = " +(x+y));
		
		
		
	}
}
