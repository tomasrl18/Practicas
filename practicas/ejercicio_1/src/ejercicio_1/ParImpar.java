package ejercicio_1;
import java.util.Scanner;
public class ParImpar
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice si un n�mero es par o impar.");
		System.out.println("Escriba un n�mero:");
		int dato1 = teclado.nextInt();
		// Te pide un n�mero
		System.out.println("-----------------------");
		if ((dato1 % 2) == 0)
		// Calcula el resto de la divisi�n.
		{
			System.out.println("El " + dato1 + " es un n�mero par.");
			// Y si el resto de la divisi�n es igual a 0, el n�mero es par.
		} else
		{
			System.out.println("El " + dato1 + " es un n�mero impar.");
			// Si no, es impar.
		}
	}
}