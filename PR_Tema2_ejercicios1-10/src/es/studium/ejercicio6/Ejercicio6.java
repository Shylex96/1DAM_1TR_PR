package es.studium.ejercicio6; // Dividir números CON DECIMALES mediante una función.
import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Dame el numerador y luego el denominador:");
		numerador = in.nextInt();
		denominador = in.nextInt();
		in.close();
		resultado = dividir(numerador, denominador);
		System.out.println(resultado);
		
	}
	
	public static double dividir(int num, int den) 
	{
		double r;
		r = (double) num / (double) den;
		return r;
	}
		
	

}


