
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Main m = new Main();
		m.go();
	}

	public void go()
	{
		List<String> c1 = new ArrayList<String>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		print(c1);

		List<String> c2 = new LinkedList<String>();
		c2.add("x");
		c2.add("y");
		c2.add("z");
		print(c2);

		Set<String> c3 = new HashSet<String>();
		c3.add("m");
		c3.add("n");
		c3.add("o");
		print(c3);

	}

	public void print(Collection c)
	{
		for (Object o : c)
		{
			System.out.print(o.toString() + " ");
		}
		System.out.println();
	}
}
