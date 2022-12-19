package es.studium.ejercicioNodos;

public class Main
{

	public static void main(String[] args)
	{

		/* Definir la siguiente estructura:
		 * Tenga una Clase Nodo definida como: 
		 * - int posicion
		 * - int valor
		 * - int siguiente -> debe indicar la posición del siguiente nodo
		 * Array de Nodos que tenga las 3 cosas.
		 * 
		 * Cada elemento (número) debe contener 
		 * a[0].siguiente enlaza con a[1].siguiente
		 */

		Nodo nodo0 = new Nodo ();
		nodo0.setPos(0);
		nodo0.setSig(4);
		nodo0.setValor(25);

		Nodo nodo1 = new Nodo ();
		nodo1.setPos(1);
		nodo1.setSig(3);
		nodo1.setValor(20);

		Nodo nodo2 = new Nodo ();
		nodo2.setPos(2);
		nodo2.setSig(1);
		nodo2.setValor(42);

		Nodo nodo3 = new Nodo ();
		nodo3.setPos(3);
		nodo3.setSig(-1);
		nodo3.setValor(0);

		Nodo nodo4 = new Nodo ();
		nodo4.setPos(4);
		nodo4.setSig(2);
		nodo4.setValor(80);



		Nodo[] arrayNodos = {nodo0, nodo1, nodo2, nodo3, nodo4};

		// mostrar(arrayNodos);
		// System.out.println(menor(arrayNodos));

		// pares(arrayNodos);

		quitarElemento(arrayNodos);


	}





	private static void quitarElemento(Nodo[] arrayNodos)
	{
		int i = 0;
		while (arrayNodos[i].getSig() != -1) 
		{
			System.out.println(arrayNodos[i].getValor());
			i = arrayNodos[i].getSig(); //-1	
		}
		//System.out.println(arrayNodos[i].getValor());
	}





	private static void pares(Nodo[] arrayNodos)
	{
		int i = 0;
		while (arrayNodos[i].getSig() != -1) 
		{
			if (arrayNodos[i].getValor() %2 == 0)
			{
				System.out.println(arrayNodos[i].getValor());
			}

			i = arrayNodos[i].getSig();
		}
		if (arrayNodos[i].getValor() %2 == 0)
		{
			System.out.println(arrayNodos[i].getValor());
		}
	}





	private static void mostrar(Nodo[] arrayNodos)
	{
		int i = 0;
		while (arrayNodos[i].getSig() != -1) {
			//System.out.println(arrayNodos[arrayNodos[i].getSig()].getValor());
			System.out.println(arrayNodos[i].getValor());
			i = arrayNodos[i].getSig();	
		}
		System.out.println(arrayNodos[i].getValor());

	}

	private static int menor(Nodo[] arrayNodos) {

		int i = 0;
		int menorNumero = arrayNodos[0].getValor();
		while (arrayNodos[i].getSig() != -1) {
			//System.out.println(arrayNodos[arrayNodos[i].getSig()].getValor());
			if (menorNumero > arrayNodos[i].getValor()) 
			{
				menorNumero = arrayNodos[i].getValor();
			}
			i = arrayNodos[i].getSig();

		}
		if (menorNumero > arrayNodos[i].getValor()) 
		{
			menorNumero = arrayNodos[i].getValor();
		}
		return menorNumero;
	}




}
