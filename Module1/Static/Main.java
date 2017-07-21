public class Main
{
	private Object m_p1;
	private Object m_p2;

	public static void main(String[] args)
	{
		Main m = new Main();
		m.go();
	}

	private void go()
	{
		m_p1 = new Person("Mark", 47);
		m_p2 = new Person("Sally", 52);

		System.out.println(m_p1.toString());
		System.out.println(m_p2.toString());

		System.out.println(Person.getCount());
	}
}
