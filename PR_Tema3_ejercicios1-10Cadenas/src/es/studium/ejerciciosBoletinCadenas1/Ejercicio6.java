package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		
		String cadena1, cadena2;
		Scanner in = new Scanner(System.in);
		System.out.println("Dame la primera cadena: ");
		cadena1 = in.nextLine();
		System.out.println("Dame la segunda cadena: ");
		cadena2 = in.nextLine();
		in.close();
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}
	}

}
