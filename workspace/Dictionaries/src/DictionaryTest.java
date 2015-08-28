public class DictionaryTest
{
    public static void main(String[] args)
    {
    	System.out.println("Begin Test...");
    	
        IDictionary<String, String> table = new Dictionary<String, String>(5);
        
        for (int i = 0; i < 20; i++)
        {
            boolean b = table.insert(i+"", (i + 100) + "");
            check(b == false);
        }
        
        check(table.toString().equals("[ (2 -> 102) (7 -> 107) (13 -> 113) (18 -> 118) (3 -> 103) (8 -> 108) (14 -> 114) (19 -> 119) (4 -> 104) (9 -> 109) (10 -> 110) (15 -> 115) (0 -> 100) (5 -> 105) (11 -> 111) (16 -> 116) (1 -> 101) (6 -> 106) (12 -> 112) (17 -> 117) ]"));
        check(table.search("0").equals("100"));
        check(table.search("10").equals("110"));

        for (int i = 5; i < 20; i++)
        {
            boolean b = table.delete(i+"");
            check(b == true);
        }

        check(table.toString().equals("[ (2 -> 102) (3 -> 103) (4 -> 104) (0 -> 100) (1 -> 101) ]"));        
        check(table.search("0").equals("100"));
        check(table.search("50") == null);
        
        for (int i = 0; i < 5; i++)
        {
            boolean b = table.delete(i+"");
            check(b == true);           
        }
                
        check(table.toString().equals("[ ]"));
        check(table.search("0") == null);
        check(table.search("50") == null);
        check(table.delete("0") == false);
        
        System.out.println("Success!");
        
    }

	private static void check(boolean b)
	{
		if (!b)
			throw new AssertionError("Test Failed!");
	}
}

