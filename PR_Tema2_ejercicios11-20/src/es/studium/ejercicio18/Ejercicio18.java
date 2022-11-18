package es.studium.ejercicio18; // Calcular suma, resta, producto y cociente cuando fuera posible.

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		double n1, n2;

		Scanner in = new Scanner(System.in);
		System.out.println("Dame dos números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();

		System.out.println("La suma de los números es: " + (n1 + n2) + "\n" + "La resta de los números es: " + (n1 - n2)
				+ "\n" + "El producto de los números es: " +(n1*n2)+ "\n"+"El cociente de los números es: " +(n1/n2));
	}
}
