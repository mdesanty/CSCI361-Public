import java.util.Scanner;

public class Contains
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = in.nextLine();

		System.out.println("Enter char:");
		char ch = in.nextLine().charAt(0);
		
		System.out.println(contains(s, ch));
	}

	public static boolean contains(String s, char ch)
	{
		if (s.length() == 0)
		{
			return false;
		}
		else if (s.charAt(0) == ch)
		{
			return true;
		}
		else
		{
			return contains(s.substring(1), ch);
		}
	}
}
