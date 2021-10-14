package ejercicio_2;
import java.util.Scanner;
public class ejercicio_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, escriba 3 números:");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		int numero3 = teclado.nextInt();
		System.out.println("Sus números son: " + numero1 + ", " + numero2 + " y " + numero3);
		System.out.println("Gracias por su colaboración.");
	}
}