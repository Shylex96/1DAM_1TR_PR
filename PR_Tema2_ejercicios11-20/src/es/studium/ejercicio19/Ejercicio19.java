package es.studium.ejercicio19; // Calcular suma, resta, producto y cociente cuando fuera posible mediante funciones.
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int n1,n2;
		int result1,result2,result3;
		double result4;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame dos números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		result1 = suma(n1,n2);
		System.out.println("El resultado de la suma es: " +result1);
		result2 = resta(n1,n2);
		System.out.println("El resultado de la resta es: " +result2);
		result3 = producto(n1,n2);
		System.out.println("El resultado del producto es: " +result3);
		result4 = cociente(n1,n2);
		System.out.println("El resultado del cociente es: " +result4);
	}
		
		private static int suma(int numero1, int numero2) {
			int r;
			r = numero1 + numero2;
			return r;
		}
		
		private static int resta(int numero1, int numero2) {
			int r;
			r = numero1 - numero2;
			return r;
		}
		
		private static int producto(int numero1, int numero2) {
			int r;
			r = numero1 * numero2;
			return r;
		}
		
		private static double cociente(int numero1, int numero2) {
			double r;
			r =  (double) numero1 / numero2;
			return r;
		}
}