package es.studium.ejercicio17; // Dar 3 números y sacar el orden de mayor a menor.
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) 
	{
		int n1,n2,n3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame tres números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		in.close();
		
		if ((n1>=n2) && n2>=n3) {
			System.out.println("Orden: " +n1+ " " +n2+ " " +n3);
		} else if ((n1>=n3) && n3>=n2) {
			System.out.println("Orden: " +n1+ " " +n3+ " " +n2);
		} else if ((n2>=n1) && (n1>=n3)) {
			System.out.println("Orden: " +n2+ " " +n1+ " " +n3);
		} else if ((n2>=n3) && (n3>=n1)) {
			System.out.println("Orden: " +n2+ " " +n3+ " " +n1);
		} else if ((n3>=n1) && (n1>=n2)) {
			System.out.println("Orden: " +n3+ " " +n1+ " " +n2);
	} else {
		System.out.println("Orden: " +n3+ " " +n2+ " " +n1);
	}


	}
	
}
