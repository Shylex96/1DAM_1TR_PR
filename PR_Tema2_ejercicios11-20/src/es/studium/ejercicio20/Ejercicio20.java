package es.studium.ejercicio20; // Calcular suma, producto y media de tres números mediante función.
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int n1,n2,n3;	
		int result1,result2;
		double result3;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame tres números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		in.close();
		
		result1 = suma(n1,n2,n3);
		System.out.println("El resultado de la suma es: " +result1);
		result2 = producto(n1,n2,n3);
		System.out.println("El resultado del producto es: " +result2);
		result3 = media(n1,n2,n3);
		System.out.println("El resultado de la media es: " +result3);
		
	}
	
		private static int suma(int numero1, int numero2, int numero3) {
			int r;
			r = numero1 + numero2 + numero3;
			return r;
		}
		
		private static int producto(int numero1, int numero2, int numero3) {
			int r;
			r = numero1 * numero2 * numero3;
			return r;
		}
		
		private static double media(int numero1, int numero2, int numero3) {
			double r;
			r = (double) (numero1 + numero2 + numero3) / 3;
			return r;
		}

}
