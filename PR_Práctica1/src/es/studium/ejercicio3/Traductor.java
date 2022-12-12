package es.studium.ejercicio3;
//Importo el Scanner que usaremos más tarde.
import java.util.Scanner; 

//Ejercicio 3:

public class Traductor
{

	public static void main(String[] args)
	{

		// Declaro un array doble con las palabras en español e inglés.
		String[][] diccionario = {
				{"yo", "i"},
				{"tú", "you"},
				{"él", "he"},
				{"ella", "she"},
				{"soy", "am"},
				{"eres", "are"},
				{"es", "is"},
				{"alto", "tall"},
				{"bajo", "short"},
				{"español", "spanish"},
		};

		// Inicio el Scanner.
		Scanner in = new Scanner(System.in);

		// Muestro por pantalla las palabras que se pueden usar de cada biblioteca (por estética).
		System.out.println("Biblioteca de las palabras del español que se pueden usar:\n \nyo \ttu \tél \tella \tsoy\n\neres \tes \talto \tbajo \tespañol");
		System.out.println("\nBiblioteca de las palabras del inglés que se pueden usar:\n \ni \tyou \the \tshe \tam\n\neres \tis \ttall \tshort \tspanish");
		
		// Ahora sí, 'Syso' que pida la frase que queremos traducir:
		System.out.println("\nIntroduce la frase a traducir: \n");

		// Variable donde guardo la frase introducida por teclado.
		String frase = in.nextLine();
		// Cierro el Scanner porque ya no lo usaremos más.
		in.close();
		
		// Creo un array llamado palabrasTraducidas que separa la frase introducida con split
		// para que entre en cada posición una palabra y no una frase entera. 
		String[] palabrasTraducidas = frase.split(" ");
		// Bucle general que recorre el array de la frase introducida.
		for (int i = 0; i < palabrasTraducidas.length; i++) 
		{
			// Le asigno el valor del array a la variable palabra.
			String palabra = palabrasTraducidas[i];
				
				// Bucle para traducir del español al inglés.
				for (int j = 0; j < diccionario.length; j++)
				{
					if (palabra.equals(diccionario[j][0])) 
					{
						// Si la encuentra, sustituye la palabra por la de la posición 1 del segundo array
						// Es decir, su traducción.
						palabrasTraducidas[i] = diccionario[j][1];
					}
				}
				
				// Bucle para traducir del inglés al español.
				for (int j = 0; j < diccionario.length; j++) 
				{
					if (palabra.equals(diccionario[j][1]))
					{
						palabrasTraducidas[i] = diccionario[j][0];	
					}
				}
		}
		// Finalmente muestro el 'Syso' donde añadimos un espacio antes de cada palabra (con el método String.join) 
		// para que sea una frase con espacios y no esté todo pegado.
		System.out.println("Frase traducida: " + String.join(" ", palabrasTraducidas));
	}
}

