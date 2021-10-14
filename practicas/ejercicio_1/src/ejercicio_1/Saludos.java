package ejercicio_1;
public class Saludos
{
	public static void main(String[] args)
	{
		int numOrden;
		numOrden = 1 ;
		System.out.print("Hola, ");
		System.out.print("soy un modesto ");
		System.out.print("programa de ordenador.\n");
		System.out.println("\nBienvenido al Curso.\t" + "Este es el saludo nº " + numOrden + ".");
		numOrden++;
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden + ".");
		System.out.println("\nFin del programa."); 
	}
}

// Se identifica una variable de tipo numérica, numOrden.
// Le da un valor a dicha variable.
// Escribe cadenas de texto para configurar unos saludos y al final, le introduce la variable a dichas cadenas.