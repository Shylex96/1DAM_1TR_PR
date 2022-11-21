package es.studium.ejemplosArray;

public class EjemploArray3
{

	public static void main(String[] args)
	{
		String paises[] =
		{ "Alemania", "Bélgica", "Canadá", "Dinamarca", "España", "Finlandia" };
		System.out.println("***Países:***" + "\n");
		/*
		 * No pondríamos esto, sino el for para strings que es mejor:
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
