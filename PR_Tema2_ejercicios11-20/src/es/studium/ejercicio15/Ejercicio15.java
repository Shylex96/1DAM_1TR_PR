package es.studium.ejercicio15; // Sacar el mes mediante su equivalencia en n�mero.
import java.util.Scanner;

public class Ejercicio15 {

		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			System.out.print("Dame un n�mero comprendido entre el 1 y el 12 \n");
			int num = in.nextInt();
			in.close();

			switch(num){
				case 1:
				System.out.println("El n�mero 1 es: Enero");
				break;
				case 2:
				System.out.println("El n�mero 2 es: Febrero");
				break;
				case 3:
				System.out.println("El n�mero 3 es: Marzo");
				break;
				case 4:
				System.out.println("El n�mero 4 es: Abril");
				break;
				case 5:
				System.out.println("El n�mero 5 es: Mayo");
				break;
				case 6:
				System.out.println("El n�mero 6 es: Junio");
				break;
				case 7:
				System.out.println("El n�mero 7 es: Julio");
				break;
				case 8:
				System.out.println("El n�mero 8 es: Agosto");
				break;
				case 9:
				System.out.println("El n�mero 9 es: Septiembre");
				break;
				case 10:
				System.out.println("El n�mero 10 es: Octubre");
				break;
				case 11:
				System.out.println("El n�mero 11 es: Noviembre");
				break;
				case 12:
				System.out.println("El n�mero 12 es: Diciembre");
				break;
				default:
				System.out.println("Has escrito un n�mero que no est� comprendido entre 1 y 12, por favor, vuelve a intentarlo");
			}
		}
	}