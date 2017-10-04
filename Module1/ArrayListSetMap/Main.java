public class Main
{
    public static void main(String args[])
    {
        Main m = new Main();
        m.go();
    }
    
    public void go()
    {
        int key1 = 0;
        int key2 = 1;
        int key3 = 2;
        String p1 = "tom";
        String p2 = "sally";
        String p3 = "jane";
        
        // array
        String aryPeople[3] = new String[];
        aryPeople[key1] = p1;
        aryPeople[key2] = p2;
        aryPeople[key3] = p3;
        
        // arraylist
        List<String> lstPeople = new ArrayList<String>();
        lst.add("");
        lst.add("");
        lst.add("");
        list.set(key1, p1);
        list.set(key2, p2);
        list.set(key3, p3);
        
        // set
        Set<String> setPeople = new HashSet<String>();
        setPeople.add(p1);  
        setPeople.add(p2);
        setPeople.add(p3);
        
        
        
    }
}