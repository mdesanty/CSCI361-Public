import java.util.*;

public class NoIfs
{
	public static void main(String args[])
	{
		NoIfs obj = new NoIfs();
		obj.go();
	}

	private void go()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a state abbreviation: ");
		String abbr = in.next();

		String stateName = abbrToName(abbr);
		System.out.println(stateName);
	}

	private String abbrToName(String abbr)
	{
		if (abbr.equalsIgnoreCase("VT"))
		  return "Vermont";
		else if (abbr.equalsIgnoreCase("MA"))
		  return "Massachusetts";
		else if (abbr.equalsIgnoreCase("ME"))
		  return "Maine";
		else if (abbr.equalsIgnoreCase("NH"))
		  return "New Hampshire";
		else if (abbr.equalsIgnoreCase("CT"))
		  return "Connecticut";
		else if (abbr.equalsIgnoreCase("RI"))
		  return "Rhode Island";
		else
		  return "Sorry, I only know New England states.";
	}

	private Map<String, String> m_map = new HashMap<String, String>();

	private NoIfs()
	{
		m_map.put("VT", "Vermont");
		m_map.put("MA", "Massachusetts");
		m_map.put("ME", "Maine");
		m_map.put("NH", "New Hampshire");
		m_map.put("CT", "Connecticut");
		m_map.put("RI", "Rhode Island");
	}

	private String abbrToName2(String abbr)
	{
		String ret = m_map.get(abbr.toUpperCase());
		if (ret == null)
			return "Sorry, I only know New England states.";
		else
			return ret;
	}
}
