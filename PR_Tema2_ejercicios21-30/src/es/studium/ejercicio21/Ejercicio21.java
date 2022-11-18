package es.studium.ejercicio21; // Leer 3 números por teclado y decir que tipo de triángulo es.
import java.util.Scanner;

public class Ejercicio21
{

	public static void main(String[] args)
	{
		
		int num1,num2,num3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame tres números");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		in.close();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("El triángulo es Equilátero");
		} else if (num1 != num2 && num2 != num3 && num1 != num3 ) {
			System.out.println("El triángulo es Escaleno");
		} else {
			System.out.println("El triángulo es Isósceles");
		}
		
	}

}
