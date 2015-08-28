
public class NodeCounter<T extends Comparable<T>> implements ITreeVisitor<T> 
{
	private int m_count = 0;
	
	public void visit(IBinaryTree<T> tree) 
	{
		m_count++;
	}
	
	public int getCount()
	{
		return m_count;
	}
	
	public void reset()
	{
		m_count = 0;
	}
}
