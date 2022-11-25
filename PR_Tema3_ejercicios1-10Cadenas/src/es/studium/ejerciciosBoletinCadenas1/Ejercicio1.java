package es.studium.ejerciciosBoletinCadenas1;
import java.util.Scanner;

public class Ejercicio1
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nombre1,nombre2,nombre3,nombre4,nombre5;
		System.out.println("Escribe el primer nombre:");
		nombre1 = in.nextLine();
		System.out.println("Escribe el segundo nombre:");
		nombre2 = in.nextLine();
		System.out.println("Escribe el tercer nombre:");
		nombre3 = in.nextLine();
		System.out.println("Escribe el cuarto nombre:");
		nombre4 = in.nextLine();
		System.out.println("Escribe el quinto nombre:");
		nombre5 = in.nextLine();
		in.close();
		System.out.println("Los cinco nombres escritos son:" +"\n" +nombre1+ "\n" +nombre2+ "\n" +nombre3+ "\n" +nombre4+ "\n" +nombre5); 

	}

}
