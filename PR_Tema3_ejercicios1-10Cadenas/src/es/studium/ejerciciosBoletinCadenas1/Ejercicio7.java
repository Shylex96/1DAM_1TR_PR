package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		String frase;
		int numeroFrase;
		int numeroFraseSinEspacio;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		frase = in.nextLine();
		in.close();
		
		
		numeroFrase = longitud(frase);
		System.out.println("La longitud de la frase con espacios es de: " +numeroFrase);
		
		numeroFraseSinEspacio = longit(frase);
		System.out.println("La longitud de la frase sin espacios es de: " +numeroFraseSinEspacio);
	}
	


	private static int longitud(String frase)
	{
		int r;
		r = frase.length();
		return r;
	}
	
	private static int longit(String frase)
	{
		String borrado = frase.replace(" ", "");
		return borrado.length();
		
	}

	
	
	
	}
