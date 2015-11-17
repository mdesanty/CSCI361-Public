public class BinarySearchTree<T extends Comparable<T>> 
{
	private BinarySearchTree<T> m_left;
	private BinarySearchTree<T> m_right;
	private T m_data;
	
	public BinarySearchTree(T data)
	{
		m_left = null;
		m_right = null;
		m_data = data;
	}
	
	public BinarySearchTree<T> getLeft()
	{ return m_left; }

	public BinarySearchTree<T> getRight()
	{ return m_right; }
	
	public T getData()
	{ return m_data; }

	public void setLeft(BinarySearchTree<T> tree)
	{ m_left = tree; }

	public void setRight(BinarySearchTree<T> tree)
	{ m_right = tree; }
	
	public void add(T data)
	{
		if (data.compareTo(getData()) <= 0)
		{
			if (getLeft() == null)
				setLeft(new BinarySearchTree<T>(data));
			else
				getLeft().add(data);
		}
		else
		{
			if (getRight() == null)
				setRight(new BinarySearchTree<T>(data));
			else
				getRight().add(data);			
		}				
	}
}
