package es.studium.ejercicio2; // Suma de dos números que yo ingrese.
import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{
		int x, y;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos números enteros para calcular la suma:");
		x = in.nextInt();
		y = in.nextInt();
		in.close();
		// z = x+y
		// Se podría agregar otra variable z que sea z = x+y y al final 
		System.out.println("La suma de los números enteros es = " +(x+y));
		
		
		
	}
}
