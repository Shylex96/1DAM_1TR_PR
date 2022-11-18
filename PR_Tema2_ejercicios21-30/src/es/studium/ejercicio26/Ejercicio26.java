package es.studium.ejercicio26; // Mensaje con tu edad en el año 2030.
import java.util.Scanner;

public class Ejercicio26
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nombre;
		int edad, x;
		
		System.out.println("Escriba su nombre:");
		nombre = in.nextLine();
		System.out.println("Indique el año de su nacimiento:");
		x = in.nextInt();
		edad=2030-x;
		System.out.println("Hola "+nombre+", en el año 2030 tendrás "+edad+" años");
		in.close();

	}

}
