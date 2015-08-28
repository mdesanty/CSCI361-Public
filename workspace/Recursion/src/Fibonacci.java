import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		int fnum = fibonacci(n);
		System.out.println(fnum);
	}

	public static int fibonacci(int n)
	{
		if (n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}