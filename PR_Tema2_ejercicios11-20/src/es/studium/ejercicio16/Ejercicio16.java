package es.studium.ejercicio16; // Realizar una función cuadrática usando una función.
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame tres números");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		in.close();
		
		System.out.println("El resultado de la función cuadrática es: "+cuadratica (a,b,c));

	}
	
	private static float cuadratica(int n1, int n2, int n3) 
	{ 
		/* Si lo hacemos así perdemos los decimales, por tanto tenemos que hacer float
		int r;
		r = ((n2 * n2) - (4 * n1 * n3)) / 2 * n1;
		return r;
		*/
		return (((((float)n2*(float)n2)-(4*(float)n1*(float)n3))/(2*(float)n1)));
	}
}
