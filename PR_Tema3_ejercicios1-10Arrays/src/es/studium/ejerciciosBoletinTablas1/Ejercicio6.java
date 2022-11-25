package es.studium.ejerciciosBoletinTablas1;

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		final int MAX = 2;
		int contadores[] = new int[MAX];
		int num;
		Scanner in = new Scanner (System.in);
		
		do {
			System.out.println("Dame un número entero:");
			num = in.nextInt();
			if (num > 0) {
				contadores[0]++;
			}
			else if (num < 0){
				contadores[1]++;
			}
		} while(num!=0);
		
		in.close();
		
		
		System.out.println("Hay " + contadores[0] + " números positivos.");
		System.out.println("Hay " + contadores[1] + " números negativos.");
		
	}
	
}