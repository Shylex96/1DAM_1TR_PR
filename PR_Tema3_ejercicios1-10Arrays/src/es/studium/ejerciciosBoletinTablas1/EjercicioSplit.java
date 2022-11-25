package es.studium.ejerciciosBoletinTablas1; // Probando el Split.

public class EjercicioSplit
{

	public static void main(String[] args)
	{

		String texto = "En un lugar de La Mancha ...";
		String arrayTabla[] = texto.split(" ");
		for (String cadena1 : arrayTabla)
		{
			System.out.println(cadena1);
		}
		
		System.out.println("\n");

		String fecha = "23/11/2022";
		String arrayFecha[] = fecha.split("/");
		for (String cadena2 : arrayFecha)
		{
			System.out.println(cadena2);

		}

	}

}
