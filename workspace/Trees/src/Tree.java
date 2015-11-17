public class Tree<T extends Comparable<T>> 
{
	private Tree<T> m_left;
	private Tree<T> m_right;
	private T m_data;
	
	public Tree(T data)
	{
		m_left = null;
		m_right = null;
		m_data = data;
	}
	
	public Tree<T> getLeft()
	{ return m_left; }

	public Tree<T> getRight()
	{ return m_right; }
	
	public T getData()
	{ return m_data; }

	public void setLeft(Tree<T> tree)
	{ m_left = tree; }

	public void setRight(Tree<T> tree)
	{ m_right = tree; }
	
	public void add(T data)
	{
		if (data.compareTo(getData()) <= 0)
		{
			if (getLeft() == null)
				setLeft(new Tree<T>(data));
			else
				getLeft().add(data);
		}
		else
		{
			if (getRight() == null)
				setRight(new Tree<T>(data));
			else
				getRight().add(data);			
		}				
	}
}
