package es.studium.ejercicio7; // Determinar que n�mero es mayor o menor (o igual).
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame dos n�meros:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		if (num1 == num2 ){
			System.out.println("Estos n�meros son iguales.");
		} else {
			if (num1 < num2) {
				System.out.println("El primer n�mero es MENOR que el segundo.");
			} else {
				System.out.println("El primer n�mero es MAYOR que el segundo.");
			}
			
		}

	}

}
