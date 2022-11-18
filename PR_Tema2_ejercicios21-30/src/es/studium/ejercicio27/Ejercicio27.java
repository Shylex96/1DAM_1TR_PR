package es.studium.ejercicio27; // Decir si la fecha es correcta o no según si la fecha introducida es de un año bisiesto o no.

import java.util.Scanner;

public class Ejercicio27
{

	public static void main(String[] args)
	{
		int day, month, year;
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba el día:");
		day = in.nextInt();
		System.out.println("Escriba el mes:");
		month = in.nextInt();
		System.out.println("Escriba el año:");
		year = in.nextInt();
		in.close();
		if ((day < 1) || (month < 1) || (year < 1))
		{
			System.out.println("Los datos introducidos no son válidos.");
		} else
		{
			switch (month)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day <= 31)
				{
					System.out.println("La fecha introducida es correcta");
				} else
				{
					System.out.println("La fecha introducida no es correcta");
				}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				if (day<=30)
				{
				System.out.println("La fecha introducida es correcta");
				}
				else
				{
				System.out.println("La fecha introducida no es correcta");
				}
				break;
				case 2:
				if (day>29)
				{
				System.out.println("La fecha introducida no es correcta");
				}
				if (day==29)
				{
				if ((year%4==0)&&((year%100!=0)||(year%400==0)))
				{
				System.out.println("La fecha introducida es correcta");
				}
				else
				{
				System.out.println("La fecha introducida no es correcta");
				}
				}
				if (day<29)
				{
				System.out.println("La fecha introducida es correcta");
				}
				break;
				default:
				System.out.println("La fecha introducida no es correcta");
			}
		}
	}
}

