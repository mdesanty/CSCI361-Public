public class Main
{
	public static void main(String[] args)
	{
		new Main().go();
	}

	private String m_noise = "Quack!";

	private void go()
	{
		IAnimal animals[] =
			{ new Cat(), new Dog(), new Duck() };

		for (IAnimal a : animals)
		{
			a.talk();
		}
	}

	private static interface IAnimal
	{
		public void talk();
	}

	private static class Cat implements IAnimal
	{
		@Override
		public void talk()
		{ System.out.println("Meow!"); }
	}

	private static class Dog implements IAnimal
	{
		@Override
		public void talk()
		{ System.out.println("Bark!"); }
	}

	private class Duck implements IAnimal
	{
		@Override
		public void talk()
		{
			String msg = String.format("I like to say %s!%n",m_noise);
			System.out.print(msg);
			// System.out.printf("I like to say %s!%n",m_noise);
		}
	}

}
