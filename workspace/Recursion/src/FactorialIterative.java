import java.util.Scanner;


public class FactorialIterative 
{
	public static void main(String[] args) 
	{
		// Get n from the user...
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		// Calculate factorial iteratively... 
		int answer = 1;
		for (int i = n; i > 0; i--)
		{
			answer = i * answer;
		}
		System.out.println(answer);	
	}
}
