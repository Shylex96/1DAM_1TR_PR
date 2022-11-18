package es.studium.ejercicio28; // Programa para decir si el mes introducido tiene 28, 29, 30 o 31 días.
import java.util.Scanner;

public class Ejercicio28
{

	public static void main(String[] args)
	{
		
		int month, year;
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe el month:");
		month= in.nextInt();
		System.out.println("Escribe el año:");
		year= in.nextInt();
		in.close();
		if ((month>0)&&(month<13)) 
		{
			switch (month)
			{
			case 2:
			if ((year%4==0)&&((year%100!=0)||(year%400==0)))
			{
			System.out.println("El mes indicado tiene 29 días");
			}
			else
			{
			System.out.println("El mes indicado tiene 28 días");
			}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("El mes indicado tiene 30 días");
			break;
			default:
				System.out.println("El mes indicado tiene 31 días");
				break;
			}
		}
				
	}
}
