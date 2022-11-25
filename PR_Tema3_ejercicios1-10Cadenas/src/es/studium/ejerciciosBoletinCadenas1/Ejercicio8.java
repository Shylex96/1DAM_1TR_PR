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
					"El caracter escrito que está en primera posición en la frase está en la posición: "
							+ (frase.indexOf(caracter)+1));
		
		
		/* Si quisiéramos que mostrara algo en caso de que no encuentre el carácter: 
		 
		if ((frase.indexOf(caracter)+1) != -1 ){
			System.out.println("Carácter no encontrado.");
		}
		*/
		
		}

	}
