import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	  Main main = new Main();
	  main.go();
	}

	private void go()
	{
		Person p1 = new Person("Tom", 47);
		Person p2 = new Person("Sally", 18);
		Person p3 = new Person("Albert", 52);
		Person p4 = new Person("Ed", 22);

		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);

		System.out.println(people);

		// natural ordering - uses Person compareTo, which sorts by name ascending ..
		Collections.sort(people);
		System.out.println(people);

		// order by length of name ascendking using an anonymous class...
		Collections.sort(people,
		  new Comparator<Person>()
		  {
		    @Override
		    public int compare(Person x1, Person x2)
		    {
		      if (x1.getName().length() > x2.getName().length())
		        return 1;
		      else if (x1.getName().length() < x2.getName().length())
		        return -1;
		      else
		        return 0;
		    }
		  });
		System.out.println(people);

		// order by length of name descending using a lamda function...
		Collections.sort(people,
		  (Person x1, Person x2) ->
		  {
		    if (x1.getName().length() > x2.getName().length())
		      return -1;
		    else if (x1.getName().length() < x2.getName().length())
		      return 1;
		    else
		      return 0;
		  }
		);
		System.out.println(people);
	}

}
