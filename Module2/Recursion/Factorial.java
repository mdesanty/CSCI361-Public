import java.util.Scanner;


public class Factorial 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		// 4! = 4 * 3 * 2 * 1
		// Calculate factorial iteratively... 
		int answer = 1;
		for (int i = n; i > 0; i--)
		{
			answer = i * answer; // 4 * (1), 3 * (4), 2 * (12), 1 * (24) = 24
		}
		System.out.println(answer);
		
		// Calculate factorial recursively...
		System.out.println(factorial(n));	
	}
	
	public static int factorial(int n)
	{
		if (n == 1 || n == 0)
		{
			// base case AKA terminating condition...
			return 1;
		}
		else
		{
			// recursive definition ...
			return n*factorial(n-1);
		}	
	}

}