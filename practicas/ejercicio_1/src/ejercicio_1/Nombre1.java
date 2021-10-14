package ejercicio_1;
import java.util.Scanner;
public class Nombre1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba dos nombres, muchas gracias: ");
		String nombre1 = teclado.nextLine();
		String nombre2 = teclado.nextLine();
		// Te pide dos nombres.
		System.out.println("Escriba dos números, muchas gracias: ");
		int dato1 = teclado.nextInt();
		int dato2 = teclado.nextInt();
		// Te pide dos edades.
		System.out.println("El primer nombre es: " + nombre1 + " y tiene " + dato1 + " años.");
		System.out.println("El segundo nombre es: " + nombre2 + " y tiene " + dato2 + " años.");
		// Imprime el primer nombre con la primera edad y el segundo nombre con la segunda edad.
	}
}