package ejercicio_1;
import java.util.Scanner;
public class ParImpar
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice si un número es par o impar.");
		System.out.println("Escriba un número:");
		int dato1 = teclado.nextInt();
		// Te pide un número
		System.out.println("-----------------------");
		if ((dato1 % 2) == 0)
		// Calcula el resto de la división.
		{
			System.out.println("El " + dato1 + " es un número par.");
			// Y si el resto de la división es igual a 0, el número es par.
		} else
		{
			System.out.println("El " + dato1 + " es un número impar.");
			// Si no, es impar.
		}
	}
}