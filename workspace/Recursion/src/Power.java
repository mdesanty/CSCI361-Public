import java.util.Scanner;

public class Power
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = in.nextInt();
		System.out.println("Enter power:");
		int pow = in.nextInt();

		System.out.println(power(num, pow));
	}


	public static long power(int num, int pow)
	{
	    if (pow == 0)
	    {
	    	return 1;	
	    }
	    else
	    {
	        return (num * power(num, pow - 1));
	    }	    
	}
}
