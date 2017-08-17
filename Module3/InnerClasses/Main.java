public class Main
{
	private String m_noise = "Quack!";
	
	public static void main(String[] args)
	{
		new Main().go();
	}

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

	private class Duck implements IAnimal
	{
		@Override
		public void talk()
		{
			System.out.printf("I like to say %s!%n",m_noise);
		}
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
}
