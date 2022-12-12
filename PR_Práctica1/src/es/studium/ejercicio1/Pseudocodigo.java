package es.studium.ejercicio1;
//Importo el Scanner que usaremos más tarde.
import java.util.Scanner; 

//Ejercicio 1:

public class Pseudocodigo
{

	// Este es un programa "contador", si introducimos un númnero positivo almacenará sumará 1 a la variable b.
	// Si por el contrario introducidimos un número negativo, restará 1 a la variable a. 
	// Tanto la variable "a" como la variable "b" empiezan con valor 0.
	public static void main(String[] args)
	{

		// Declaro las variables: Número entero n, cuyo valor variará y por otro lado a y b, cuyo valor es igual a 0.
		int n, a = 0, b = 0;

		// Inicio el Scanne fuera del bucle para luego poder pedir los datos.
		Scanner in = new Scanner(System.in);

		// Ejecuto un 'do', que hará que el código comprendido entre llaves se repita mientras se no se cumpla el 'while'.
		do
		{

			// Pido mediante un 'Syso' un número entero.
			System.out.println("Dame un número entero:");
			// La variable "n" tomará el valor que le demos por teclado.
			n = in.nextInt();

			// Inicio un "if else" para los dos supuestos casos:
			// Si el número n es menor que 0, entonces ejecutará a = a - 1.
			// Es decir, restará 1 a la variable "a" hasta que paremos el bucle.
			if (n < 0)
			{
				a = a - 1;
			// Si el número n es mayor que 0, entonces ejecutará b = b + 1.
			// Es decir, sumará 1 a la variable "b" hasta que paremos el bucle.
			} else {
				b = b + 1;
			}

		// El código se repetirá en bucle hasta que escribamos un "0". 
		// Que es la condición para que termine el bucle y muestre el 
		// resultado final por consola con el total de cada variable. 
		} while (n != 0); 


		// Muestra por pantalla el resultado final de los contadores.
		System.out.println(a);
		System.out.println(b);
		// Cierro el teclado porque ya no será necesario.
		in.close();


		// Hay que tener en cuenta que el "0" contabilizará como positivo, por lo que 
		// el contador 'b' sumará uno más al escribir "0" y finalizar el bucle.
	}
}
