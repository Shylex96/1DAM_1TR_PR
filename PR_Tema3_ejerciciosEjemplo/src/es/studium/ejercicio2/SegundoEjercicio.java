package es.studium.ejercicio2;
import java.util.Scanner;

public class SegundoEjercicio
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nombre, primerApellido, segundoApellido;
		String nombreCompleto;
		System.out.println("Dame tu nombre:");
		nombre = in.nextLine();
		System.out.println("Dame tus apellidos");
		primerApellido = in.nextLine();
		segundoApellido = in.nextLine();
		in.close();
		nombreCompleto = nombre + " " + primerApellido + " " +segundoApellido;
		System.out.println("Tu nombre completo es: " + "\n" +nombre + " " + primerApellido + " " + segundoApellido);
		System.out.println("\n" +nombreCompleto);
		
		for (int i=0; i < nombreCompleto.length(); i++) 
		{
			System.out.println(nombreCompleto.charAt(i));
			
		}
		
		for (int i=0; i < nombreCompleto.length(); i+=2) 
		{
			System.out.print(nombreCompleto.charAt(i));
			if (i<nombreCompleto.length()-1) {
				System.out.println(nombreCompleto.charAt(i+1));
			}
			
		}
	}

}
