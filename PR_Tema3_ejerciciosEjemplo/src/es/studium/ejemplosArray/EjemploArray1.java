package es.studium.ejemplosArray;

public class EjemploArray1
{

	public static void main(String[] args)
	{
		
		/* Esta sería una forma de darle valor a la tabla:
		 
		 
		int tablaEnteros [] = new int [6];
		
		tablaEnteros[0] = -2;
		tablaEnteros[1] = 3;
		tablaEnteros[2] = 5;
		tablaEnteros[3] = 0;
		tablaEnteros[4] = 33;
		tablaEnteros[5] = 100;
		
		*/
		// Declaración de la tabla
		// Darle contenido a la tabla
		int tablaEnteros[] = {-2, 3, 5, 0 , 33, 100};
		// Mostrar contenido
		
		for (int i = 0; i < tablaEnteros.length; i++) {
			System.out.println(tablaEnteros[i]);
		}
	}

}
