import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		new Main().go();
	}

	public void go()
	{

		new Item("Nuts", "Food");
		new Item("Hat", "Clothing");
		new Item("Milk", "Food");
		new Item("Shirt", "Clothing");
		new Item("Baseball", "Toy");
		new Item("Bat", "Toy");
		new Item("Apple", "Food");
		new Item("Shoes", "Clothing");

		Item.printItems();
	}
}
