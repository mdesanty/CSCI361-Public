import java.util.Scanner;

public class GCD
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number:");
		int m = in.nextInt();
		System.out.println("Enter second number:");
		int n = in.nextInt();

		System.out.println(gcd(m, n));
	}

	public static int gcd(int m, int n)
	{
		if(n==0)
			return m;
		else if (n > m)
			return gcd(n,m);
		else
			return gcd(n,m % n);
	}
}