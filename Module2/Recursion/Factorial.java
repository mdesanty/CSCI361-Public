import java.util.Scanner;


public class Factorial 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		// Calculate factorial iteratively... 
		/*
		int answer = 1;
		for (int i = n; i > 0; i--)
		{
			answer = i * answer;
		}
		System.out.println(answer);
		*/
		
		// Calculate factorial recursively...
		System.out.println(factorial(n));	
	}
	
	public static int factorial(int n)
	{
		if (n == 1)
		{
			// base case AKA terminating condition...
			return 1;
		}
		else
		{
			// recursive call...
			return n*factorial(n-1);
		}	
	}

}