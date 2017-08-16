import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = in.nextLine();

		int count = countDigits(s);
		System.out.println(count);
	}

	public static int countDigits(String s)
	{
		if (s.length() == 0)
			return 0;
		else if (s.length() == 1 && Character.isDigit(s.charAt(0)))
			return 1;
		else if (s.length() == 1 && !Character.isDigit(s.charAt(0)))
			return 0;
		else 
			return countDigits(s.substring(0,1)) + countDigits(s.substring(1, s.length()));
	}
}