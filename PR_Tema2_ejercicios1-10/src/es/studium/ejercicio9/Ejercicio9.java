package es.studium.ejercicio9; // Sumar o multiplicar dependiendo de cu�l es m�s peque�o o m�s grande.
import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner in = new Scanner(System.in); 
		System.out.println("Escribe dos n�mero entero:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		if (num1>=num2){
			System.out.println("La multiplicaci�n de los n�meros es: " +(num1*num2));
		} else {
			System.out.println("La suma de los n�meros es: " +(num1+num2));
		}

	}

}
