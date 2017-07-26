
public class Person implements Comparable<Person>
{ 
	private String m_name;
	private int m_age;
	
	
	public Person(String name, int age)
	{
		m_name = name;
		m_age = age;
	}
	
	@Override
	public String toString()
	{
		return m_name + " (" +m_age + ")";
	}

	@Override
	public int compareTo(Person otherDude) 
	{
		if (m_age > otherDude.m_age)
			return 1;
		else if (m_age < otherDude.m_age)
			return -1;
		else 
			return 0;
	}

}
