package es.studium.ejercicio11; // Mostrar en pantalla dos n�meros enteros intercambiando sus valores.
import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args)
	{
		// Leer dos n�meros por teclado e intercambiar sus valores.
		
		int num1, num2; 
		
		System.out.println("Dame un n�mero entero:");
		Scanner in = new Scanner(System.in); 
		num1 = in.nextInt();
		System.out.println("Dame otro n�mero entero:"); 
		num2 = in.nextInt();
		in.close(); 
		System.out.println();
		in.close();
		
		System.out.println("El primer n�mero dado es: "+num1+" y el segundo n�mero dado es : "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Los valores intercambiados son:");
		System.out.println("-> Primer n�mero: "+num1);
		System.out.println("-> Primer n�mero: "+num2);	
		}
	
	}

