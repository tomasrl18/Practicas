package ejercicio_1;
import java.util.Scanner;
public class MayorDeTres {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice cu�l es el mayor de tres n�meros.");
		System.out.println("Escriba 3 n�meros:");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		int numero3 = teclado.nextInt();
		// Te pide 3 n�meros
		if (numero1 > numero2)
		// Hace una primera comparaci�n entre los dos primeros n�meros.
		{
			if (numero1 > numero3)
			{
				System.out.println("El " + numero1 + " es el mayor de los 3.");
				// Si el n�mero 1 es mayor que el n�mero 3, el n�mero 1 ser� el mayor.
			} else
			{
				System.out.println("El " + numero3 + " es el mayor de los 3.");
				// Si no, el n�mero 3 ser� el mayor.
			}
		} else if (numero2 > numero3)
		// El programa salta aqu� si el n�mero 2 es m�s grande que el n�mero 1.
		{
			System.out.println("El " + numero2 + " es el mayor de los 3.");
			// Si el n�mero 2 es mayor que el n�mero 3, el n�mero 2 ser� el mayor.
		} else
		{
			System.out.println("El " + numero3 + " es el mayor de los 3.");
			// Si no, el n�mero 3 ser� el mayor.
		}
	}
}