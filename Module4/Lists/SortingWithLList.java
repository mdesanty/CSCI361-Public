public class SortingWithLList
{
    public static void main(String[] args)
    {
        SortingWithLList obj = new SortingWithLList();
        obj.go();
    }
    
    private void go()
    {
        int ary[] = {5, 3, 10, 2, 43, 16, 9, 7, 7, 11};
        
        LList<Integer, Integer> list = new LList<Integer, Integer>();
        
        for (int i : ary)
        {
            list.add(i, i);
        }
        
        for (int i : list)
        {
            System.out.println(i);
        }
    }
}