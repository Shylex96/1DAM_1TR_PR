package es.studium.ejercicio3;
import java.util.Scanner;

public class TercerEjercicio
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Dame la primera cadena: ");
		cadena1 = in.nextLine();
		System.out.println("Dame la primera cadena: ");
		cadena2 = in.nextLine();
		in.close();
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
		
		/* En este caso transformaríamos las dos cadenas a mayus para que nos diga que son iguales independientemente de como las hayamos escrito:
		 * 
		 * if (cadena1.toUpperCase().equals(cadena2.toUpperCase()) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}*/
		
	}

}
