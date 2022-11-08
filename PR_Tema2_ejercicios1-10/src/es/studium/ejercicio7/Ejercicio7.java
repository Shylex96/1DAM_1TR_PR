package es.studium.ejercicio7; // Determinar que número es mayor o menor (o igual).
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos números:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		if (num1 == num2 ){
			System.out.println("Estos números son iguales.");
		} else {
			if (num1 < num2) {
				System.out.println("El primer número es MENOR que el segundo.");
			} else {
				System.out.println("El primer número es MAYOR que el segundo.");
			}
			
		}

	}

}
