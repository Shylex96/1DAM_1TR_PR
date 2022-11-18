package es.studium.ejercicioESP2; // LEER UN NUMERO DE TECLADO Y SI EL NUMERO ES PAR DEVOLVER TRUE Y SI ES IMPAR FALSE
import java.util.Scanner;

public class EjercicioY
{

	public static void main(String[] args)
	{
		
		int num; 
		
		System.out.println("Dame un número entero:");
		Scanner in = new Scanner(System.in); 
		num = in.nextInt();
		in.close(); 
		System.out.println(num%2==0);
	}
}

