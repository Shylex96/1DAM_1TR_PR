package es.studium.ejercicio4; // Sacar todos los números pares comprendidos entre los números que yo de.
import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		int num1, num2, i;
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos números enteros");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		for(i=num1; i<=num2; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}

	}

}
