package es.studium.ejercicio1;
//Importo el Scanner que usaremos m�s tarde.
import java.util.Scanner; 

//Ejercicio 1:

public class Pseudocodigo
{

	// Este es un programa "contador", si introducimos un n�mnero positivo almacenar� sumar� 1 a la variable b.
	// Si por el contrario introducidimos un n�mero negativo, restar� 1 a la variable a. 
	// Tanto la variable "a" como la variable "b" empiezan con valor 0.
	public static void main(String[] args)
	{

		// Declaro las variables: N�mero entero n, cuyo valor variar� y por otro lado a y b, cuyo valor es igual a 0.
		int n, a = 0, b = 0;

		// Inicio el Scanne fuera del bucle para luego poder pedir los datos.
		Scanner in = new Scanner(System.in);

		// Ejecuto un 'do', que har� que el c�digo comprendido entre llaves se repita mientras se no se cumpla el 'while'.
		do
		{

			// Pido mediante un 'Syso' un n�mero entero.
			System.out.println("Dame un n�mero entero:");
			// La variable "n" tomar� el valor que le demos por teclado.
			n = in.nextInt();

			// Inicio un "if else" para los dos supuestos casos:
			// Si el n�mero n es menor que 0, entonces ejecutar� a = a - 1.
			// Es decir, restar� 1 a la variable "a" hasta que paremos el bucle.
			if (n < 0)
			{
				a = a - 1;
			// Si el n�mero n es mayor que 0, entonces ejecutar� b = b + 1.
			// Es decir, sumar� 1 a la variable "b" hasta que paremos el bucle.
			} else {
				b = b + 1;
			}

		// El c�digo se repetir� en bucle hasta que escribamos un "0". 
		// Que es la condici�n para que termine el bucle y muestre el 
		// resultado final por consola con el total de cada variable. 
		} while (n != 0); 


		// Muestra por pantalla el resultado final de los contadores.
		System.out.println(a);
		System.out.println(b);
		// Cierro el teclado porque ya no ser� necesario.
		in.close();


		// Hay que tener en cuenta que el "0" contabilizar� como positivo, por lo que 
		// el contador 'b' sumar� uno m�s al escribir "0" y finalizar el bucle.
	}
}
