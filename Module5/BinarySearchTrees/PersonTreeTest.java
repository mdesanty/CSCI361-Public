
public class PersonTreeTest 
{

	public static void main(String[] args)
	{
		Person p1 = new Person("tim", 18);
		Person p2 = new Person("sally", 22);
		Person p3 = new Person("fred", 14);
		Person p4 = new Person("steve", 21);
		Person p5 = new Person("jane", 16);
		
		BST<Person> tree = new BST<Person>(p1);
		tree.add(p2);
		tree.add(p3);
		tree.add(p4);
		tree.add(p5);
		
		tree.inOrderPrint();
	}

}
