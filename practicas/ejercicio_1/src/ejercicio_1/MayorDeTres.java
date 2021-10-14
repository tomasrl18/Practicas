package ejercicio_1;
import java.util.Scanner;
public class MayorDeTres {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice cuál es el mayor de tres números.");
		System.out.println("Escriba 3 números:");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		int numero3 = teclado.nextInt();
		// Te pide 3 números
		if (numero1 > numero2)
		// Hace una primera comparación entre los dos primeros números.
		{
			if (numero1 > numero3)
			{
				System.out.println("El " + numero1 + " es el mayor de los 3.");
				// Si el número 1 es mayor que el número 3, el número 1 será el mayor.
			} else
			{
				System.out.println("El " + numero3 + " es el mayor de los 3.");
				// Si no, el número 3 será el mayor.
			}
		} else if (numero2 > numero3)
		// El programa salta aquí si el número 2 es más grande que el número 1.
		{
			System.out.println("El " + numero2 + " es el mayor de los 3.");
			// Si el número 2 es mayor que el número 3, el número 2 será el mayor.
		} else
		{
			System.out.println("El " + numero3 + " es el mayor de los 3.");
			// Si no, el número 3 será el mayor.
		}
	}
}