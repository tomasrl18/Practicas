package ejercicio_1;
import java.util.Scanner;
public class MayorDeDos
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas, soy un simple programa que te dice cuál de dos números es mayor.");
		System.out.println("Escriba dos números:");
		int dato1 = teclado.nextInt();
		int dato2 = teclado.nextInt();
		// Te pide dos números.
		System.out.println("-----------------------");
		System.out.println("El primer número es: " + dato1);
		System.out.println("El primer número es: " + dato2);
		String mensaje = "";
		if (dato1 == dato2)
		{
			mensaje = "Ninguno de los dos números es mayor que el otro.";
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
		// Imprime el mensaje de cuál de ellos es mayor.
	}
}