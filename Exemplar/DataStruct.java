import java.util.*;

public class DataStruct implements IDataStruct
{
    private int m_curI = 0;
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
        if (m_curI == m_choices.size()-1 && m_choices.get(m_curI) == -1)
            return false;
        else 
            return m_curI < m_choices.size();
    }

    public int grabNext()
    {               
        m_curV = m_choices.get(m_curI);  
        while (m_curV == -1 && hasNext())
        {
            m_curV = m_choices.get(++m_curI);  
        }
        m_choices.set(m_curI, -1);
        return m_curV;
    }

    public void release()
    {  
        if (m_curI < m_choices.size()-1)
        {
            m_choices.set(m_curI, m_curV);                 
            m_curI++;
        }
    }
    
    public IDataStruct copyMe()
    {
        IDataStruct ret = new DataStruct(m_choices);
        return ret;
    }
}