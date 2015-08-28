import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int decimal = in.nextInt();
		in.close();
	
		// running time log(n) ...
		IStack<Integer> stack = new StackLL<Integer>();	
		while (decimal > 0)
		{
			int digit = decimal%2;
			stack.push(digit);
			decimal = decimal/2;
		}
		
		// running time log(n) ...
		System.out.print("Converted to binary:");
		while (!stack.isEmpty())
		{
			System.out.print(stack.pop());
		}		
		System.out.println();
		
		// total running time 2*log(n), which is O(log(n))...
	}
}