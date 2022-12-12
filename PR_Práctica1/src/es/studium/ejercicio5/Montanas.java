package es.studium.ejercicio5;

public class Montanas
{

	public static void main(String[] args)
	{
		// Declaro la constante de 4 elementos llamada ARRAY.
		final int MAX = 4;

		// Declaro los array, el de strings con las montañas y el de sus alturas.
		String montanas[] = {"Everest", "Mont Blanc", "Veleta", "Aneto"};
		int alturas[] = {8849, 4809, 3394, 3404};

		// Declaro la variable de la altura máxima que
		// empieza desde la posición 0 del array.
		int alturaMaxima = alturas[0];

		// Declaro la variable de la montaña.
		// Le indico que coja la primera posición.
		int posicionMaxima = 0;


		// Realizo un bucle que busque la más alta.
		for (int i = 0; i < MAX; i++) 
		{
			if (alturas[i] > alturaMaxima) 
			{
				alturaMaxima = alturas[i];
				posicionMaxima = i;
			}

		}
		// Syso final para mostrar la montaña y la altura que le corresponde.
		System.out.println("La montaña más alta es: " +montanas[posicionMaxima]+ "\nSu altura es de : " +alturaMaxima);
	}
}	

