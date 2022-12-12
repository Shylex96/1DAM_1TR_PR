package es.studium.ejercicio5;

public class Montanas
{

	public static void main(String[] args)
	{
		// Declaro la constante de 4 elementos llamada ARRAY.
		final int MAX = 4;

		// Declaro los array, el de strings con las monta�as y el de sus alturas.
		String montanas[] = {"Everest", "Mont Blanc", "Veleta", "Aneto"};
		int alturas[] = {8849, 4809, 3394, 3404};

		// Declaro la variable de la altura m�xima que
		// empieza desde la posici�n 0 del array.
		int alturaMaxima = alturas[0];

		// Declaro la variable de la monta�a.
		// Le indico que coja la primera posici�n.
		int posicionMaxima = 0;


		// Realizo un bucle que busque la m�s alta.
		for (int i = 0; i < MAX; i++) 
		{
			if (alturas[i] > alturaMaxima) 
			{
				alturaMaxima = alturas[i];
				posicionMaxima = i;
			}

		}
		// Syso final para mostrar la monta�a y la altura que le corresponde.
		System.out.println("La monta�a m�s alta es: " +montanas[posicionMaxima]+ "\nSu altura es de : " +alturaMaxima);
	}
}	

