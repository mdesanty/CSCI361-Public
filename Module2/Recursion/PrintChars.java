import java.util.Scanner;

public class PrintChars
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = in.nextLine();

		printChars(s);
	}

	public static void printChars(String s)
	{
		if (s.length() == 0)
		{
			return;
		}
		else
		{
			System.out.println(s.charAt(0));
			printChars(s.substring(1));
		}
	}
}