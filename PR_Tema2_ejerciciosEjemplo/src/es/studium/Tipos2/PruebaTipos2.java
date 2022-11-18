package es.studium.Tipos2; // Factoriales.
import java.math.BigInteger;

public class PruebaTipos2
{
	public static void main(String[] args)
	{
	long resultado = 1;
	BigInteger resultadoGrande = new BigInteger("1");
	for(int i = 1; i <1000; i++)
	{
	resultado = resultado * i;
	System.out.println(i+":"+resultado);
	}
	System.out.println("Factorial de 1000:"+resultado);
	for(int i = 1; i <1000; i++)
	{
	resultadoGrande = resultadoGrande.multiply(new BigInteger(i+""));
	}
	System.out.println("Factorial de 1000:" + resultadoGrande);
	}
}