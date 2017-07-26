
import java.util.LinkedList;
import java.util.List;

public class Dictionary<K, V> implements IDictionary<K, V>
{
    private int m_size;
    private List<Item>[] m_buckets;

    @SuppressWarnings("unchecked")
    public Dictionary(int size)
    {
        m_size = size;
        m_buckets = (LinkedList<Item>[]) new LinkedList<?>[m_size];

        for (int i = 0; i < m_size; i++)
        {
            m_buckets[i] = new LinkedList<Item>();
        }
    }

    public boolean insert(K key, V value)
    {
        boolean bRet = true;
        Item item = _search(key);
        if (item != null)
        {
            item.m_value = value;
            bRet = true;
        }
        else
        {
            item = new Item(key, value);
            m_buckets[Math.abs(key.hashCode())%m_size].add(item);
            bRet = false;
        }
        return bRet;
    }

    public V search(K key)
    {
        V ret = null;
        Item item = _search(key);
        if (item != null)
            ret = item.m_value;
        return ret;
    }

    public boolean delete(K key)
    {
        boolean ret = false;
        List<Item> list = m_buckets[Math.abs(key.hashCode())%m_size];
        for (Item item : list)
        {
            if (item.m_key.equals(key))
            {
                ret = list.remove(item);
                break;
            }
        }
        return ret;
    }

    @Override
    public String toString()
    {
        StringBuffer buff = new StringBuffer("[ ");
        for (List<Item> list : m_buckets)
        {
            for (Item item : list)
            {
                String s = String.format("(%s -> %s) ",
                        item.m_key.toString(), item.m_value.toString());
                buff.append(s);
            }
        }
        buff.append("]");
        return buff.toString();
    }

    private Item _search(K key)
    {
        Item ret = null;
        List<Item> list = m_buckets[Math.abs(key.hashCode())%m_size];
        for (Item item : list)
        {
            if (item.m_key.equals(key))
            {
                ret = item;
                break;
            }
        }
        return ret;
    }

    private class Item
    {
        private K m_key;
        private V m_value;

        private Item(K key, V value)
        {
            m_key = key;
            m_value = value;
        }
    }
}
