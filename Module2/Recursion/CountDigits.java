import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string of digits:");
		String s = in.nextLine();

		int count = countDigits(s);
		System.out.println(count);
	}

	public static int countDigits(String s)
	{
		if (s.length() == 1)
			return 1;
		else
			return 1 + countDigits(s.substring(1));
	}
}