package es.studium.ejercicio22; // Introducir un n�mero binario y que devuelva el n�mero en formato decimal.
import java.util.Scanner;

public class Ejercicio22
{

	public static void main(String[] args)
	{
		int a,b,c,d,e,resultado;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el 1� d�gito binario");
		a=in.nextInt();
		System.out.println("Introduce el 2� d�gito binario");
		b=in.nextInt();
		System.out.println("Introduce el 3� d�gito binario");
		c=in.nextInt();
		System.out.println("Introduce el 4� d�gito binario");
		d=in.nextInt();
		System.out.println("Introduce el 5� d�gito binario");
		e=in.nextInt();
		in.close();
		
		resultado=((a*potencia(4))+(b*potencia(3))+(c*potencia(2))+(d*potencia(1))+(e*potencia(0)));
		System.out.println("El n�mero en decimal es: " +resultado);
		

	}

	private static int potencia(int i)
	{
		int r = 1;
		for (int j = 1; j<= i; j++) {
			r=r*2;
		}
		return r;
	}

}
