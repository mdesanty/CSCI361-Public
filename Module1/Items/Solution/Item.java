import java.util.*;

public class Item
{
	private static Map<String, List<Item>> m_categoryMap =
		new HashMap<String, List<Item>>();

	public static void printItems()
	{
		for (List<Item> l : m_categoryMap.values())
		{
			for (Item i : l)
			{
				System.out.println(i);
			}
		}
	}

	private String m_name;
	private String m_category;

	public Item(String name, String category)
	{
		m_name = name;
		m_category = category.toUpperCase();

		if (!m_categoryMap.containsKey(m_category))
		{
			m_categoryMap.put(m_category, new ArrayList<Item>());
		}
		m_categoryMap.get(m_category).add(this);
	}

	@Override
	public String toString()
	{
		return String.format("%s [%s]", m_name, m_category);
	}
}
