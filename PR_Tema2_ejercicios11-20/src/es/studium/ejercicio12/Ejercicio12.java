package es.studium.ejercicio12; // Sumar dos n�meros enteros mediante una funci�n.
import java.util.Scanner; 

public class Ejercicio12
{

	public static void main(String[] args)
	{
		int num1, num2;
		int result;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos n�meros entero:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		result = suma(num1,num2);
		System.out.println(result);
		
	}

	private static int suma(int num1, int num2)
	{
		int r;
		r = num1+num2;
		return r;
	}
}
		
	
	
	
