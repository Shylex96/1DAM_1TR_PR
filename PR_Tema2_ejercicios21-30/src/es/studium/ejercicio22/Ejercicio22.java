package es.studium.ejercicio22; // Introducir un número binario y que devuelva el número en formato decimal.
import java.util.Scanner;

public class Ejercicio22
{

	public static void main(String[] args)
	{
		int a,b,c,d,e,resultado;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el 1º dígito binario");
		a=in.nextInt();
		System.out.println("Introduce el 2º dígito binario");
		b=in.nextInt();
		System.out.println("Introduce el 3º dígito binario");
		c=in.nextInt();
		System.out.println("Introduce el 4º dígito binario");
		d=in.nextInt();
		System.out.println("Introduce el 5º dígito binario");
		e=in.nextInt();
		in.close();
		
		resultado=((a*potencia(4))+(b*potencia(3))+(c*potencia(2))+(d*potencia(1))+(e*potencia(0)));
		System.out.println("El número en decimal es: " +resultado);
		

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
