package ejercicio_2;
public class ejercicio_6
{
	public static void main(String[] args)
	{
		String[][] gato =
			{
					{" ", " ", "|", "\\", "_", "/", "|", " ", " "},
					
					{" ", "/", " ", "@", " ", "@", " ", "\\", " "},
					
					{"(", " ", ">", " ", " ", " ", "<", " ", ")"},
					
					{" ", "`", "»", "»", "x", "«", "«", "'", " "},
					
					{" ", "/", " ", " ", "O", " ", " ", "\\", " "},
			};
		for (int i = 0; i <= (gato.length - 1); i++)
		{
			System.out.print("\t\t\t\t\t\t\t\t\t");
			for (int j = 0; j <= 8; j++)
			{
				System.out.print(gato[i][j]);
			}
			System.out.println();
		}
	}
}