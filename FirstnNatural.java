import java.util.Scanner;

public class Main
	{
		public static void main(String args[])
		{
			System.out.println("Enter the total numbers: ");
			Scanner reader = new Scanner(System.in);
			int number = reader.nextInt();
			System.out.println("First n natural numbers are -------------------");
			for (int i = 1; i <= number; i++)
				{
					System.out.println(i);
				}
		}

	}