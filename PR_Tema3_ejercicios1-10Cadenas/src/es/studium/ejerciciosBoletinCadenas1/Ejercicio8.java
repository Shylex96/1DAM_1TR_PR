package es.studium.ejerciciosBoletinCadenas1;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{

		String frase, caracter;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		frase = in.nextLine();
		System.out.println("Introduzca un caracter de la frase anterior:");
		caracter = in.nextLine();
		in.close();
		
		
		System.out.println(
					"El caracter escrito que est� en primera posici�n en la frase est� en la posici�n: "
							+ (frase.indexOf(caracter)+1));
		
		
		/* Si quisi�ramos que mostrara algo en caso de que no encuentre el car�cter: 
		 
		if ((frase.indexOf(caracter)+1) != -1 ){
			System.out.println("Car�cter no encontrado.");
		}
		*/
		
		}

	}
