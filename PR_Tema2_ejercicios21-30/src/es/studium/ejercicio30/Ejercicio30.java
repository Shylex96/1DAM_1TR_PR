package es.studium.ejercicio30; // Calcular el polinomio de X con coeficiente 10.

import java.util.Scanner;

public class Ejercicio30
{

	public static void main(String[] args)
	{
		int base, A, B, C, D, E, F, G, H, I, J, K;
		Scanner in = new Scanner(System.in);
		System.out.println("Indicar el valor de base:");
		base = in.nextInt();
		System.out.println("Indicar el valor del t�rmino A:");
		A = in.nextInt();
		System.out.println("Indicar el valor del t�rmino B:");
		B = in.nextInt();
		System.out.println("Indicar el valor del t�rmino C:");
		C = in.nextInt();
		System.out.println("Indicar el valor del t�rmino D:");
		D = in.nextInt();
		System.out.println("Indicar el valor del t�rmino E:");
		E = in.nextInt();
		System.out.println("Indicar el valor del t�rmino F:");
		F = in.nextInt();
		System.out.println("Indicar el valor del t�rmino G:");
		G = in.nextInt();
		System.out.println("Indicar el valor del t�rmino H:");
		H = in.nextInt();
		System.out.println("Indicar el valor del t�rmino I:");
		I = in.nextInt();
		System.out.println("Indicar el valor del t�rmino J:");
		J = in.nextInt();
		System.out.println("Indicar el valor del t�rmino K:");
		K = in.nextInt();
		in.close();
		System.out.println("El resultado del polinomio es: "
				+ ((A * (Math.pow(base, 10))) + (B * (Math.pow(base, 9))) + (C * (Math.pow(base, 8))) + (D * (Math.pow(base, 7)))
						+ (E * (Math.pow(base, 6))) + (F * (Math.pow(base, 5))) + (G * (Math.pow(base, 4)))
						+ (H * (Math.pow(base, 3))) + (I * (Math.pow(base, 2))) + (J * (Math.pow(base, 1))) + K));

	}

}
