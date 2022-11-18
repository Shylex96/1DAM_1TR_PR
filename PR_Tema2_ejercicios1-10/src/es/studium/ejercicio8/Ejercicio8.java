package es.studium.ejercicio8; // Calcular potencias.
import java.util.Scanner;

public class Ejercicio8
{
	public static void main(String[] args)
	{
		int base, expo, i, resultado = 1;
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame la base y el exponente:");
		base = in.nextInt();
		expo = in.nextInt();
		in.close();
		
		for (i = 1; i<=expo; i++) {
			resultado = resultado * base;
		}
		System.out.println(resultado);
	}
}	
