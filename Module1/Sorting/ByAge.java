public class ByAge implements Comparator<Person>
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
    
}