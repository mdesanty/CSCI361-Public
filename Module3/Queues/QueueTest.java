public class QueueTest 
{
	public static void main(String[] args) 
	{
		QueueTest tester = new QueueTest();
	
		QueueLL<Integer> queue = new QueueLL<Integer>();
		tester.test(queue);
	}
	
	public void test(QueueLL<Integer> queue)
	{
		System.out.println("Start tests...");
		
		// test eq, dq, eq, dq...
		check(queue.toString().equals("rear->"));
		check(queue.isEmpty());
		check(queue.getSize() == 0);

		System.out.println(queue);
		
		queue.enqueue(10);
		check(queue.toString().equals("rear->10"));
		check(!queue.isEmpty());
		check(queue.getSize() == 1);

		System.out.println(queue);
		
		int i = queue.dequeue();
		check(i == 10);
		check(queue.toString().equals("rear->"));
		check(queue.isEmpty());
		check(queue.getSize() == 0);

		System.out.println(queue);
		
		queue.enqueue(10);
		check(queue.toString().equals("rear->10"));
		check(!queue.isEmpty());
		check(queue.getSize() == 1);

		System.out.println(queue);
		
		i = queue.dequeue();
		check(i == 10);
		check(queue.toString().equals("rear->"));
		check(queue.isEmpty());
		check(queue.getSize() == 0);
		
		System.out.println(queue);
		
		// test iterator
		int count = 0;
		for (int data : queue)
		{
			count++;
		}
		check(count == queue.getSize());
		
		// test enqueue, enqueue, enqueue, dequeue, dequeue, dequeue...
		check(queue.toString().equals("rear->"));
		check(queue.isEmpty());
		check(queue.getSize() == 0);
		
		System.out.println(queue);
		
		queue.enqueue(10);
		check(queue.toString().equals("rear->10"));
		check(!queue.isEmpty());
		check(queue.getSize() == 1);

		System.out.println(queue);
		
		queue.enqueue(20);
		check(queue.toString().equals("rear->20->10"));
		check(!queue.isEmpty());
		check(queue.getSize() == 2);

		System.out.println(queue);
		
		queue.enqueue(30);
		check(queue.toString().equals("rear->30->20->10"));
		check(!queue.isEmpty());
		check(queue.getSize() == 3);

		System.out.println(queue);
				
		// test iterator
		count = 0;
		for (int data : queue)
		{
			count++;
		}
		check(count == queue.getSize());
		
		i = queue.dequeue();
		check(i == 10);
		check(queue.toString().equals("rear->30->20"));
		check(!queue.isEmpty());
		check(queue.getSize() == 2);

		System.out.println(queue);
		
		i = queue.dequeue();
		check(i == 20);
		check(queue.toString().equals("rear->30"));
		check(!queue.isEmpty());
		check(queue.getSize() == 1);

		System.out.println(queue);
		
		i = queue.dequeue();
		check(i == 30);
		check(queue.toString().equals("rear->"));
		check(queue.isEmpty());
		check(queue.getSize() == 0);
		
		System.out.println(queue);
		
		// check for dequeue on empty queue...
		boolean ok = false;
		try
		{
			queue.dequeue();
		}
		catch (IllegalStateException e)
		{
			ok = true;
		}
		check(ok);
		
		System.out.println("Success!");
	}

	private static void check(boolean b)
	{
		if (!b)
			throw new AssertionError("Test Failed!");
	}
}