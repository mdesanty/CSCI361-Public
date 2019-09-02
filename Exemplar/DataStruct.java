import java.util.*;

public class DataStruct implements IDataStruct
{
    private int m_curI = -1;
    private int m_curV = -1;
    private List<Integer> m_choices;

    public static void main(String args[])
    {
        IDataStruct ds = new DataStruct(9);
        while (ds.hasNext())
        {
            int i = ds.grabNext();
            System.out.println(i);  
            IDataStruct ds2 = ds.copyMe();
            while (ds2.hasNext())
            {
                int i2 = ds2.grabNext();
                System.out.println("\t"+i2);                
                ds2.release();
            }            
            ds.release();
        }
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
        // System.out.println("CopyMe");  
        // for (int x : m_choices)
            // System.out.print(x);  
        // System.out.println("End CopyMe");  
    }

    public boolean hasNext()
    {
        // System.out.println("Has Next");
        int nextI = nextAvailIndex();
        return nextI != -99;
    }

    public int grabNext()
    {     
        // System.out.println("Grab Next");          
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
        // System.out.println("Release");
        m_choices.set(m_curI, m_curV);                 
    }
    
    public IDataStruct copyMe()
    {
        IDataStruct ret = new DataStruct(m_choices);
        return ret;
    }

    private int nextAvailIndex()
    {
        // System.out.println("nextAvail");
        int loc = m_curI+1;
        while (loc < m_choices.size() && m_choices.get(loc) == -1)
        {
            loc = loc+1;  
            //System.out.println("loc " + loc);;
        }

        if (loc >= m_choices.size())
        {
            loc = -99;
        }
        
        return loc;
    }
}