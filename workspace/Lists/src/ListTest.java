public class ListTest 
{

	public static void main(String[] args) 
	{
		LList<Integer, String> list = 
				new LList<Integer, String>();
		
		ListTest tester = new ListTest();
		tester.test(list);
	}

	public void test(LList<Integer, String> list)
	{
		System.out.println("Start tests...");

		check(list.toString().equals("[]"));
		check(list.isEmpty());
		check(list.find(1) == null);
		
		// test iterator
		int count = 0;
		for (@SuppressWarnings("unused") String data : list)
		{
			count++;
		}
		check(count == list.getSize());
		
		list.add(3, "three");
		check(list.toString().equals("[three]"));
		check(!list.isEmpty());
		check(list.getSize() == 1);
		check(list.find(3).toString().equals("three"));
		
		list.add(0, "zero");
		check(list.toString().equals("[three, zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 2);
		check(list.find(0).toString().equals("zero"));
		
		list.add(2, "two");
		check(list.toString().equals("[three, two, zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 3);
		check(list.find(2).toString().equals("two"));
		
		list.add(1, "one");
		check(list.toString().equals("[three, two, one, zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 4);
		check(list.find(1).toString().equals("one"));
		
		// test iterator
		count = 0;
		for (@SuppressWarnings("unused") String data : list)
		{
			count++;
		}
		check(count == list.getSize());

		list.remove(2);
		check(list.toString().equals("[three, one, zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 3);
		check(list.find(2) == null);
		
		list.remove(1);
		check(list.toString().equals("[three, zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 2);
		check(list.find(1) == null);
		
		list.remove(3);
		check(list.toString().equals("[zero]"));
		check(!list.isEmpty());
		check(list.getSize() == 1);
		check(list.find(3) == null);
		
		list.remove(0);
		check(list.toString().equals("[]"));
		check(list.getSize() == 0);
		check(list.isEmpty());
		check(list.find(0) == null);

		// test iterator
		count = 0;
		for (@SuppressWarnings("unused") String data : list)
		{
			count++;
		}
		check(count == list.getSize());

		System.out.println("Success!");
	}
	
	private static void check(boolean b)
	{
		if (!b)
			throw new AssertionError("Test Failed!");
	}	
}