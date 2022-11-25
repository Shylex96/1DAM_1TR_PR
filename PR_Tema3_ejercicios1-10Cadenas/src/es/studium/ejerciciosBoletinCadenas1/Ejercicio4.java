package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		String cadena1, cadena2, cadenaSumada;
		System.out.println("Dame la primera cadena: ");
		cadena1 = in.nextLine();
		System.out.println("Dame la primera cadena: ");
		cadena2 = in.nextLine();
		in.close();
		
		cadenaSumada = cadena1 + " " + cadena2;
		
		System.out.println(cadenaSumada);
		}

	}

