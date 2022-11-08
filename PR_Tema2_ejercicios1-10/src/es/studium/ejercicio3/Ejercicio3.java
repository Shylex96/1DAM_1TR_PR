package es.studium.ejercicio3; // Sacar número par o impar.
import java.util.Scanner;

public class Ejercicio3 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Dame un número entero:");
		Scanner in = new Scanner(System.in); 
		num = in.nextInt();
		in.close(); // no pasa nada si no cierras pero es recomendable
		if (num%2 == 0) {
			System.out.println("Tu número es PAR.");
		} else {
			System.out.println("Tu número es IMPAR.");
		}
	}
}
