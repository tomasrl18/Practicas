package ejercicio_1;
import java.util.Scanner;
public class MayorDeDos
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice cu�l de dos n�meros es mayor.");
		System.out.println("Escriba dos n�meros:");
		int dato1 = teclado.nextInt();
		int dato2 = teclado.nextInt();
		// Te pide dos n�meros.
		System.out.println("-----------------------");
		System.out.println("El primer n�mero es: " + dato1);
		System.out.println("El primer n�mero es: " + dato2);
		String mensaje = "";
		if (dato1 == dato2)
		{
			mensaje = "Ninguno de los dos n�meros es mayor que el otro.";
			// Si son iguales, ninguno es mayor.
		}
		if (dato1 > dato2)
		{
			mensaje = "El mayor es el: " + dato1;
			// Si el dato1 es mayor que el dato2, el dato1 es el mayor.
		}
		if (dato2 > dato1)
		{
			mensaje = "El mayor es el: " + dato2;
			// Si el dato2 es mayor que el dato1, el dato2 es el mayor.
		}
		System.out.println("-----------------------");
		System.out.println(mensaje);
		// Imprime el mensaje de cu�l de ellos es mayor.
	}
}