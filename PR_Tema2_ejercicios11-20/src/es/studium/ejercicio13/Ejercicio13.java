package es.studium.ejercicio13; // Tabla de multiplicar con el número que le des.
import java.util.Scanner;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		
		int num, i;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame un número y te doy su tabla de multiplicar:");
		num = in.nextInt();
		System.out.println("Tabla del: "+num);
		in.close();
		
		i = 0;
		for (i = 0; i<=10; i++) 
		{
			System.out.println(num+ " * "+i+" = "+i*num);
		}
		


	}

}
