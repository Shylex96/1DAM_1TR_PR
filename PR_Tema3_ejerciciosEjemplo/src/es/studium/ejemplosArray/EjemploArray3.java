package es.studium.ejemplosArray;

public class EjemploArray3
{

	public static void main(String[] args)
	{
		String paises[] =
		{ "Alemania", "B�lgica", "Canad�", "Dinamarca", "Espa�a", "Finlandia" };
		System.out.println("***Pa�ses:***" + "\n");
		/*
		 * No pondr�amos esto, sino el for para strings que es mejor:
		 * for (int i = 0; i <
		 * paises.length; i++) 
		 * {
		 * 
		 * }
		 */
		for (String pais : paises)
		{
			System.out.println(pais);
		}
	}

}
