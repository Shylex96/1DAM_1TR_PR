package es.studium.ejercicio2;
//Importo el Scanner que usaremos más tarde.
import java.util.Scanner; 

//Ejercicio 2:

public class Hora
{

	public static void main(String[] args)
	{

		// Inicio una variable donde guardar la hora.
		String hora;

		// Inicio el Scanner.
		Scanner in = new Scanner(System.in);
		// Mediante un 'Syso' pido la hora en formato 24h.
		
		// Es importante recalcar: La hora se pide en formato de 24 horas, lo que quiere decir
		// que no admitirá horas como: "1:34", ya que la forma correcta sería: "01:34".
		// Si el usuario escribe "1:34" saldría un error con ejemplos de como escribirlo correctamente.
		System.out.println("Introduce una hora en formato: XX:XX");
		// El contenido de la variable "hora" guardará la hora dada por teclado.
		hora = in.nextLine();
		// Cierro Scanner ya que no es necesario pedir nada más.
		in.close();


		// Antes de ejecutar nada abro un "if else" que limite a 5 el formato. 
		// Si el usuario se equivoca y escribe algo de mayor o menor tamaño que 5, saldrá un error controlado.

		if (hora.length() != 5)
		{
			System.out.println("\nError al ejecutar el programa. \nPor favor, escribe una hora con el formato 24h.\n\nPor ejemplo: \n\n\t10:23 \t21:39 \t14:52");
		} else {
			// Si el usuario escribe la hora con el formato correcto, se ejecutará lo siguiente:

			// Creo dos variables en las que uso substring para dividir la hora en dos partes.
			// estas dos posiciones serán: la hora y los minutos. 
			String horaCortada1 = hora.substring(0, 2);
			String horaCortada2 = hora.substring(3, 5);

			// De igual forma, en caso de que escriba minutos iguales o por encima de 60, corrijo el error:

			// Usamos el parseInt para transformar la cadena en un número entero y así poder 
			// decir que si los minutos son iguales o superiores a 60, entonces nos de error.

			if (Integer.parseInt(horaCortada2) >= 60) {
				System.out.println("\nError al ejecutar el programa. \nLos minutos introducidos sobrepasan el máximo permitido.");
			} else {

				// Ahora puedo empezar con el código en sí del programa:

				// Ejecuto un switch para, dependiendo de la hora que haya sido escrita por teclado
				// la cambie por el valor correspondiente dentro del 'Syso'.
				// Luego le pego los minutos (que eso no varía) y añado si es "am" o "pm".

				switch (horaCortada1)
				{
				case "01":
					System.out.println("01:" + horaCortada2 + " am");
					break;
				case "02":
					System.out.println("02:" + horaCortada2 + " am");
					break;
				case "03":
					System.out.println("03:" + horaCortada2 + " am");
					break;
				case "04":
					System.out.println("04:" + horaCortada2 + " am");
					break;
				case "05":
					System.out.println("05:" + horaCortada2 + " am");
					break;
				case "06":
					System.out.println("06:" + horaCortada2 + " am");
					break;
				case "07":
					System.out.println("07:" + horaCortada2 + " am");
					break;
				case "08":
					System.out.println("08:" + horaCortada2 + " am");
					break;
				case "09":
					System.out.println("09:" + horaCortada2 + " am");
					break;
				case "10":
					System.out.println("10:" + horaCortada2 + " am");
					break;
				case "11":
					System.out.println("11:" + horaCortada2 + " am");
					break;
				case "12":
					System.out.println("12:" + horaCortada2 + " am");
					break;
				case "13":
					System.out.println("1:" + horaCortada2 + " pm");
					break;
				case "14":
					System.out.println("2:" + horaCortada2 + " pm");
					break;
				case "15":
					System.out.println("3:" + horaCortada2 + " pm");
					break;
				case "16":
					System.out.println("4:" + horaCortada2 + " pm");
					break;
				case "17":
					System.out.println("5:" + horaCortada2 + " pm");
					break;
				case "18":
					System.out.println("6:" + horaCortada2 + " pm");
					break;
				case "19":
					System.out.println("7:" + horaCortada2 + " pm");
					break;
				case "20":
					System.out.println("8:" + horaCortada2 + " pm");
					break;
				case "21":
					System.out.println("9:" + horaCortada2 + " pm");
					break;
				case "22":
					System.out.println("10:" + horaCortada2 + " pm");
					break;
				case "23":
					System.out.println("11:" + horaCortada2 + " pm");
					break;
				case "24":
					System.out.println("00:" + horaCortada2 + " am");
					break;
				case "00":
					System.out.println("00:" + horaCortada2 + " am");
					break;
					// En caso de errores no contemplados anteriormente, dejo el default con el mensaje de error controlado.
				default:
					System.out.println("\nError al ejecutar el programa. \n\nPor favor, escribe una hora con el formato 24h."
							+ "\nPor ejemplo: \n\n\t10:23 \t21:39 \t14:52");

				}
			}
		}
	}
}
