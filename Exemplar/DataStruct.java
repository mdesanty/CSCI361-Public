import java.util.*;

public class DataStruct implements IDataStruct
{
    private int m_curI = -1;
    private int m_curV = -1;
    private List<Integer> m_choices;

    public static void main(String args[])
    {
        // write a complete test here...
    }

    public DataStruct(int n)
    {
        m_choices = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            m_choices.add(i+1);
    }

    public DataStruct(List<Integer> l)
    {
        m_choices = new ArrayList<Integer>();
        m_choices.addAll(l);
    }

    public boolean hasNext()
    {
        int nextI = nextAvailIndex();
        return nextI != -99;
    }

    public int grabNext()
    {     
        int nextI = nextAvailIndex();
        if (nextI == -99)
        {
            throw new IllegalStateException("can't grab next");
        }

        m_curI = nextI;
        m_curV = m_choices.get(nextI);  
        m_choices.set(m_curI, -1);

        return m_curV;
    }

    public void release()
    {  
        m_choices.set(m_curI, m_curV);                 
    }
    
    public IDataStruct copyMe()
    {
        IDataStruct ret = new DataStruct(m_choices);
        return ret;
    }

    private int nextAvailIndex()
    {
        int loc = m_curI+1;
        while (loc < m_choices.size() && m_choices.get(loc) == -1)
        {
            loc = loc+1;  
        }

        if (loc >= m_choices.size())
        {
            loc = -99;
        }
        
        return loc;
    }
}