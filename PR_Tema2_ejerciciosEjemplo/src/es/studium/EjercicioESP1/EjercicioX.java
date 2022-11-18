package es.studium.EjercicioESP1; // LEER POR TECLADO Y NO DEVOLVER POR CONSOLA HASTA ESCRIBIR Y ENVIAR UN PUNTO. 
import java.util.Scanner;
/*
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
*/

public class EjercicioX
{

	public static void main(String[] args) //throws IOException
	{
		String contenido, resultado="";
		
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("El Programa está siendo iniciado..." ); 
		try {
			Thread.sleep(3*1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Escriba el contenido que desea guardar y usa \n'.' para finalizar el programa y que salga por pantalla");
		
		try {
			Thread.sleep(2*1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		contenido = in.nextLine();
		
		while (!contenido.equals(".")){
			
			resultado = resultado +  " " + contenido;
			contenido = in.nextLine();

		}
		
		if (contenido.equals(".")) {
			System.out.println("La información está procesándose...");
			try {
				Thread.sleep(3*1000);
			} catch (Exception e) {
				System.out.println(e);
			
			}
			in.close();
		}
		System.out.println("Usted ha escrito: " + resultado);
		
		
	}
	

	
	

}
