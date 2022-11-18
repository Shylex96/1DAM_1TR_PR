package es.studium.ejercicio11; // Mostrar en pantalla dos números enteros intercambiando sus valores.
import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args)
	{
		// Leer dos números por teclado e intercambiar sus valores.
		
		int num1, num2; 
		
		System.out.println("Dame un número entero:");
		Scanner in = new Scanner(System.in); 
		num1 = in.nextInt();
		System.out.println("Dame otro número entero:"); 
		num2 = in.nextInt();
		in.close(); 
		System.out.println();
		in.close();
		
		System.out.println("El primer número dado es: "+num1+" y el segundo número dado es : "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Los valores intercambiados son:");
		System.out.println("-> Primer número: "+num1);
		System.out.println("-> Primer número: "+num2);	
		}
	
	}

