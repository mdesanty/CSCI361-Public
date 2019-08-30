import java.util.*;

public class DataStruct
{
    private List<Integer> m_choices;

    public DataStruct(int n)
    {
        for (int i = 0; i < n; i++)
            m_choices.add(i+1);
    }

    public boolean isEmpty()
    { return m_choices.isEmpty(); }

    public Integer getNext()
    {
        return m_choices.remove(m_choices.size()-1);
    }
}