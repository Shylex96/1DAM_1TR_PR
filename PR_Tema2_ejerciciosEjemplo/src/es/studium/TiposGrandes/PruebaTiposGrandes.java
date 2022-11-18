package es.studium.TiposGrandes; // Ejemplo de números grandes.
import java.math.BigDecimal;
import java.math.BigInteger;

public class PruebaTiposGrandes
{
	public static void main(String[] args)
	{
	BigInteger granEntero = new BigInteger("0");
	BigDecimal granDecimal = new BigDecimal(0.1);
	System.out.println(granEntero);
	System.out.println(granDecimal);
	}
}