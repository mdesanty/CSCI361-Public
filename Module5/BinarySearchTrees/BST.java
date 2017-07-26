public class BST<T extends Comparable<T>> 
{
	private BST<T> m_left;
	private BST<T> m_right;
	private BST<T> m_parent;
	private T m_data;
	
	public BST(T data)
	{
		m_left = null;
		m_right = null;
		m_parent = null;
		m_data = data;
	}

	public BST(T data, BST<T> parent)
	{
		this(data);
		m_parent = parent;
	}
	
	public BST<T> getLeft()
	{ return m_left; }

	public BST<T> getRight()
	{ return m_right; }
	
	public BST<T> getParent()
	{ return m_parent; }

	public T getData()
	{ return m_data; }

	public boolean isLeaf()
	{ return m_right == null && m_left == null; }
	
	public void add(T data)
	{
		if (data.compareTo(getData()) <= 0)
		{
			if (getLeft() == null)
				setLeft(new BST<T>(data, this));
			else
				getLeft().add(data);
		}
		else
		{
			if (getRight() == null)
				setRight(new BST<T>(data, this));
			else
				getRight().add(data);			
		}				
	}

	public BST<T> findTree(T data)
	{
		BST<T> ret = null;
		if (getData().compareTo(data) == 0)
			ret = this;			
		else if (getLeft() != null && data.compareTo(getData()) < 0)
			ret = getLeft().findTree(data);
		else if (getRight() != null)
			ret = getRight().findTree(data);
		return ret;
	}	
	
	public void deleteTree(BST<T> tree)
	{
		if (tree != null)
		{
			if (tree.isLeaf())
			{				
				tree.getParent().removeChild(tree);;
			}
			else if (tree.getLeft() != null)
			{
				BST<T> ltl = (tree.findLargestLeft());			
				tree.setData(ltl.getData());
				deleteTree(ltl);
			}
			else
			{
				BST<T> str = (tree.findSmallestRight());			
				tree.setData(str.getData());
				deleteTree(str);
			}
		}
	}
	
	public void preOrderPrint()
	{
		System.out.print(getData() + " ");
		if (getLeft() != null)
			getLeft().preOrderPrint();
		if (getRight() != null)
			getRight().preOrderPrint();
	}
	
	public void inOrderPrint()
	{
		if (getLeft() != null)
			getLeft().inOrderPrint();
		System.out.print(getData() + " ");
		if (getRight() != null)
			getRight().inOrderPrint();		
	}

	public void postOrderPrint()
	{
		if (getLeft() != null)
			getLeft().postOrderPrint();
		if (getRight() != null)
			getRight().postOrderPrint();
		System.out.print(getData() + " ");		
	}

	@Override
	public String toString()
	{
		return getData().toString();
	}
	
	private void setLeft(BST<T> tree)
	{ m_left = tree; }

	private void setRight(BST<T> tree)
	{ m_right = tree; }

	private void setParent(BST<T> tree)
	{ m_parent = tree; }

	private void setData(T data)
	{ m_data= data; }
	
	private void removeChild(BST<T> child)
	{
		if (getLeft() == child)
			setLeft(null);
		else if (getRight() == child)
			setRight(null);
		child.setParent(null);
	}
	
	private BST<T> findLargestLeft()
	{
		BST<T> ret = null; 
		if (getLeft() == null)
			return null;
		else 
		{
			ret = getLeft();
			while (ret.getRight() != null) 
			{
				ret = ret.getRight();
			}
		}
		return ret;					
	}

	private BST<T> findSmallestRight()
	{
		BST<T> ret = null; 
		if (getRight() == null)
			return null;
		else 
		{
			ret = getRight();
			while (ret.getLeft() != null) 
			{
				ret = ret.getLeft();
			}
		}
		return ret;					
	}	
}
