package ejercicio_1;
import java.util.Scanner;
public class TresUsuarios
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buenas tardes, soy un programa que muestra los datos de 3 usuarios diferentes.");
		System.out.println("�Ser�a tan amable de introducir esos datos de 3 usuarios?");
		System.out.println("Escriba: Nombre, Apellido 1, Apellido 2, DNI y C�digo postal.");
		String nombre1 = teclado.nextLine();
		String apellido1_persona1 = teclado.nextLine();
		String apellido2_persona1 = teclado.nextLine();
		String dni1 = teclado.nextLine();
		String codigo_postal1 = teclado.nextLine();
		// Recoge los datos del primer usuario.
		System.out.println("Primer usuario registrado, introduzca dos m�s:");
		String nombre2 = teclado.nextLine();
		String apellido1_persona2 = teclado.nextLine();
		String apellido2_persona2 = teclado.nextLine();
		String dni2 = teclado.nextLine();
		String codigo_postal2 = teclado.nextLine();
		// Recoge los datos del segundo usuario.
		System.out.println("Segundo usuario registrado, introduzca uno m�s:");
		String nombre3 = teclado.nextLine();
		String apellido1_persona3 = teclado.nextLine();
		String apellido2_persona3 = teclado.nextLine();
		String dni3 = teclado.nextLine();
		String codigo_postal3 = teclado.nextLine();
		// Recoge los datos del tercer usuario.
		System.out.println("----------------------------");
		System.out.println("DATOS TERCER USUARIO: \nNombre: " + nombre3 + " " + apellido1_persona3 + " " + apellido2_persona3 + "\nDNI: " + dni3 + "\nC�digo Postal: " + codigo_postal3);
		System.out.println("----------------------------");
		System.out.println("DATOS SEGUNDO USUARIO: \nNombre: " + nombre2 + " " + apellido1_persona2 + " " + apellido2_persona2 + "\nDNI: " + dni2 + "\nC�digo Postal: " + codigo_postal2);
		System.out.println("----------------------------");
		System.out.println("DATOS PRIMER USUARIO: \nNombre: " + nombre1 + " " + apellido1_persona1 + " " + apellido2_persona1 + "\nDNI: " + dni1 + "\nC�digo Postal: " + codigo_postal1);
		System.out.println("----------------------------");
		// Los muestra en el orden inverso al que se escribieron (El tercer usuario ser� el primero).
	}
}