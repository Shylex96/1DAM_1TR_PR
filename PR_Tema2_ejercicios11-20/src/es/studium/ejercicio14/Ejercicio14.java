package es.studium.ejercicio14; // Sacar la potencia de un número mediante una función.
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) 
	{
		int base, expo;
		int resultado;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Escribe la base de la potencia:");
		base=in.nextInt();
		System.out.println("Escribe el exponente del número:");
		expo=in.nextInt();
		in.close();
		
		resultado = pot(base,expo);
		
		System.out.println("El resultado es: " + resultado);
		/*result = calculo(base,expo);*/
		
		
	}

	public static int pot(int base, int expo)
	{
		int i, result = 1;
		for (i=1;i<=expo;i++) 
		{
			result = result * base;
		}
		return (result);
	}
	
		
		

	}
