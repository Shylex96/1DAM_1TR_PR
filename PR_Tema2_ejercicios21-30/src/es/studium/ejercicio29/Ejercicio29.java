package es.studium.ejercicio29; // Calcular polinomio: 3X^5 - 5X^3 - 2X-7
import java.util.Scanner;

public class Ejercicio29
{

	public static void main(String[] args)
	{
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Indicar el valor de x:");
		a = in.nextInt();
		in.close();
		
		System.out.println("El resultado del polinomio es:" +((3*(Math.pow(a,5)))-(5*(Math.pow(a,3)))+(2*(Math.pow(a,1)))-7));


	}

}
