package ejercicio_1;
/**
 * Hola3
 * Comprueba el mayor de dos números
 * Tomás Raigal
 */
import java.util.Scanner
public class Hola3
{
    public static void main(String argumentos[])
    {     
        //	Declara un obejto teclado para introducir datos
        Scanner teclado = new Scanner(System.in);
        int num;
        //	Declara una variable de tipo entero
        num = 1;
        // Inicia la variable
        System.out.println("Hola, Soy un modesto ");
        System.out.print("programa de ordenador...\n");
        System.out.println("Mi número de orden es el " + num + " por ser el primero.");
        // Pide los números por pantalla
        System.out.println("Escribe dos números...\n");
        int dato1 = teclado.nextInt();
        int dato2 = teclado.nextInt();
        // Imprime los datos por pantalla
        System.out.println("Dato1: " + dato1);
        System.out.println("Dato2: " + dato2);
        // Comprueba los números e imprime un mensaje
        String mensaje = "";
        if (dato1 == dato2)
        {
            mensaje = "Ninguno de los dos es mayor... ";
        }
        if (dato1 > dato2)
        {
            mensaje = "El mayor es: " + dato1;
        }
        if (dato2 > dato1)
        {
            mensaje = "El mayor es: " + dato2;
        }
        System.out.println(mensaje);
    }
}