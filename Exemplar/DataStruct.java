import java.util.*;

public class DataStruct implements IDataStruct
{
    private int m_curI = -1;
    private int m_curV = -1;
    private List<Integer> m_choices;

    public static void main(String args[])
    {
        // test data struct...
    }

    public DataStruct(int n)
    {
        // init...
    }

    public DataStruct(List<Integer> l)
    {
        // init...
    }

    public boolean hasNext()
    {
        // find out if there are any numbers left...

        return false;
    }

    public int grabNext()
    {             
        // find and return the value for the 
        // next available number...

        return m_curV;
    }

    public void release()
    {  
        // release curV...          
    }
    
    public IDataStruct copyMe()
    {
        // make a copy...

        return null;
    }

    private int nextAvailIndex()
    {
        // find the next available index
        // which is the first one that is not negative
        // if there is not a next one, return -99
        
        return -99;
    }
}