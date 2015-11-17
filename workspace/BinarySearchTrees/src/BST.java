public class BST<T extends Comparable<T>> 
{
	private BST<T> m_left;
	private BST<T> m_right;
	private T m_data;
	
	public BST(T data)
	{
		m_left = null;
		m_right = null;
		m_data = data;
	}
	
	public BST<T> getLeft()
	{ return m_left; }

	public BST<T> getRight()
	{ return m_right; }
	
	public T getData()
	{ return m_data; }

	public void setLeft(BST<T> tree)
	{ m_left = tree; }

	public void setRight(BST<T> tree)
	{ m_right = tree; }
	
	public void addTree(BST<T> tree)
	{
		if (tree.getData().compareTo(getData()) <= 0)
		{
			if (getLeft() == null)
				setLeft(new BST<T>(tree.getData()));
			else
				getLeft().addTree(tree);
		}
		else
		{
			if (getRight() == null)
				setRight(new BST<T>(tree.getData()));
			else
				getRight().addTree(tree);			
		}				
	}
	
	public void addData(T data)
	{
		addTree(new BST<T>(data));
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

}
