package ejercicio_2;
import java.util.Scanner;
public class ejercicio_9
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenos días, soy un programa simple que calcula el interés producido y el capital total acumulado de un capital inicial invertido a un tipo de interés anual");
		System.out.print("Por favor, introduzca su capital principal inicial: ");
		double ci = teclado.nextInt();
		System.out.print("Ahora introduzca su tipo de interés anual: ");
		double ia = teclado.nextInt();
		System.out.print("Y, por último, introduzca el número de años: ");
		double n = teclado.nextInt();
		double cf = ci * Math.pow((1 + ia), n);
		System.out.println("------------------------------------------------");
		System.out.println("Su capitalización final es: " + cf);
		
	}
}