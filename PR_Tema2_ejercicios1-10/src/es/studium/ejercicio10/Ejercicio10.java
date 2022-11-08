package es.studium.ejercicio10; // Repetir el número que se diga el número de veces que se diga.
import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		int num1, num2, i;
		Scanner in = new Scanner(System.in); 
		System.out.println("Escribe el número que deseas repetir:");
		num1 = in.nextInt();
		System.out.println("Escribe el número de veces que quieres repetir el número:");
		num2 = in.nextInt();
		in.close();
		
		i = 1;
		while (i <= num2) {
			System.out.println(num1);
			i = i+1;
		}
		
		

	}

}
