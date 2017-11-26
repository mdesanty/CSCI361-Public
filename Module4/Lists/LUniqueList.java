
public class LUniqueList<K extends Comparable<K>, T> extends LList<K, T>
{
    public LUniqueList()
    {}
    
    @Override
	public void add(K key, T item)
	{
	    // linear time O(n)
	    
	    T o = find(key);
	    if (o != null)
	        throw new IllegalStateException("add error: Key exists already!");
	        
	    super.add(key, item);
	}
}