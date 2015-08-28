
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree<T extends Comparable<T>> implements IBinaryTree<T> 
{
	private IBinaryTree<T> m_parent;
	private IBinaryTree<T> m_left;
	private IBinaryTree<T> m_right;
	private T m_item;
	private int m_level;

	public BinaryTree(T item)
	{
		m_item = item;
		m_parent = null;
		m_left = null;
		m_right = null;
		m_level = 0;
	}

	public IBinaryTree<T> getParent() 
	{
		return m_parent;
	}

	public IBinaryTree<T> getLeft() 
	{
		return m_left;
	}

	public IBinaryTree<T> getRight() {
		return m_right;
	}

	public T getItem() 
	{
		return m_item;
	}
	
	public IBinaryTree<T> search(T item) 
	{
		return _search(this, item);
	}

	public void inorder() 
	{
		_inorder(this, null);
	}

	public void inorder(ITreeVisitor<T> visitor) 
	{
		_inorder(this, visitor);
	}

    public void breadthFirstOrder()
    {
        _breadthFirstOrder(this, null);
    }

    public void breadthFirstOrder(ITreeVisitor<T> visitor)
    {
        _breadthFirstOrder(this, visitor);
    }   
	
	public boolean insert(T item) 
	{
		return _insert(this, item);
	}
	
	public int getLevel()
	{
	    return m_level;
	}

	public IBinaryTree<T> min() 
	{
		IBinaryTree<T> ret = this;
		while (ret.getLeft() != null)
			ret = ret.getLeft();
		return ret;
	}

	public IBinaryTree<T> max() 
	{
		IBinaryTree<T> ret = this;
		while (ret.getRight() != null)
			ret = ret.getRight();
		return ret;
	}

	public boolean delete(T item) 
	{
		IBinaryTree<T> tree = search(item);
		return _delete(tree);
	}
	
	
// private methods...
	
	private void setLeft(IBinaryTree<T> tree)
	{
		if (tree != null && getItem().compareTo(tree.getItem()) == -1)
			throw new IllegalStateException(
					String.format("Can't add a larger item (%d) to the left of this item (%d)", 
							tree.getItem(), getItem()));
		m_left = tree;
		if (tree != null)
		{
			BinaryTree<T> temp = (BinaryTree<T>)tree;
			temp.setParent(this);
		}
	}
	
	private void setRight(IBinaryTree<T> tree)
	{		
		if (tree != null && getItem().compareTo(tree.getItem()) == 1)
			throw new IllegalStateException(
					String.format("Can't add a smaller item (%d) to the right of this item (%d)", 
							tree.getItem(), getItem()));

		m_right = tree;
		if (tree != null)
		{
			BinaryTree<T> temp = (BinaryTree<T>)tree;
			temp.setParent(this);
		}
	}
	
	private void setParent(IBinaryTree<T> tree)
	{
		m_parent = tree;
	}
	
	private void setLevel(int level)
	{
	    m_level = level;
	}

	private void setItem(T item)
	{
		m_item = item;
	}
	
	private boolean _delete(IBinaryTree<T> t)
	{
		BinaryTree<T> tree = (BinaryTree<T>)t;
		boolean ret = (tree != null);
		if (tree != null)
		{
			BinaryTree<T> parent = (BinaryTree<T>)tree.getParent();
			
			// node is a leaf, so just delete the node
			if (tree.getLeft() == null && tree.getRight() == null)
			{
				// if we are trying to delete a leaf that has no 
				// parent, then we must be trying to delete the last node
				// in the tree, which is not allowed... 
				if (parent == null)
				{
					ret = false;
				}
				else if (parent.getLeft() == tree)
				{
					parent.setLeft(null);
				}
				else
				{
					parent.setRight(null);
				}
			}
			// node has a child on the left, so rotate by setting
			// node to be deleted equal to largest to the left
			// and then deleting largest to the left, which is always a leaf...
			else if (tree.getLeft() != null)
			{
				BinaryTree<T> largestToLeft = (BinaryTree<T>)tree.getLeft().max();
				tree.setItem(largestToLeft.getItem());
				_delete(largestToLeft);
			}
			// node has a child on the roght, so rotate by setting
			// node to be deleted equal to smallest to the right
			// and then deleting smallest to the right, which is always a leaf...
			else 
			{
				BinaryTree<T> smallestToRight = (BinaryTree<T>)tree.getRight().min();
				tree.setItem(smallestToRight.getItem());
				_delete(smallestToRight);
			}
		}
		return ret;
	}

	private boolean _insert(IBinaryTree<T> p, T item) 
	{
		BinaryTree<T> parent = (BinaryTree<T>)p;
		boolean ret = true;
		if (item.compareTo(parent.getItem()) == -1)
		{
			IBinaryTree<T> child = parent.getLeft();
			if (child == null)
			{
				BinaryTree<T> newNode = new BinaryTree<T>(item);
				newNode.setLevel(parent.getLevel()+1);
				parent.setLeft(newNode);
			}
			else
			{
				ret = _insert(child, item);
			}
		} 
		else
		{
			IBinaryTree<T> child = parent.getRight();
			if (child == null)
			{
				BinaryTree<T> newNode = new BinaryTree<T>(item);
				newNode.setLevel(parent.getLevel()+1);
				parent.setRight(newNode);
			}
			else
			{
				ret = _insert(child, item);
			}
		}
		return ret;
	}
	
	private IBinaryTree<T> _search(IBinaryTree<T> tree, T item) 
	{
		IBinaryTree<T> ret = null;
		if (tree != null)
		{
			if (tree.getItem().equals(item))
			{
				ret = tree;
			}
			else
			{
				if (item.compareTo(tree.getItem()) == -1)
				{
					ret = _search(tree.getLeft(), item);
				}
				else
				{
					ret = _search(tree.getRight(), item);
				}
			}
		}
		return ret;
	}
	
	private void _inorder(IBinaryTree<T> tree, ITreeVisitor<T> visitor) 
	{
		if (tree != null)
		{
			_inorder(tree.getLeft(), visitor);
			if (visitor == null)
			{
				System.out.println(tree.getItem());
			}
			else
			{
				visitor.visit(tree);
			}
			_inorder(tree.getRight(), visitor);
		}
		return;
	}
	
	private void _breadthFirstOrder(IBinaryTree<T> tree, ITreeVisitor<T> visitor)
    {
        Queue<IBinaryTree<T>> currentLevel = new LinkedList<IBinaryTree<T>>();
        Queue<IBinaryTree<T>> nextLevel = new LinkedList<IBinaryTree<T>>();
        
        currentLevel.offer(tree);
        
        while (!currentLevel.isEmpty()) 
        {
            IBinaryTree<T> node = currentLevel.poll();
            if (visitor == null)
            {
                System.out.print(node.getItem() + " ");
            }
            else
            {
                visitor.visit(node);
            }
            
            if (node.getLeft() != null)
            {
                nextLevel.offer(node.getLeft());
            }
            
            if (node.getRight() != null)
            {
                nextLevel.offer(node.getRight());
            }
            
            if (currentLevel.isEmpty()) 
            {
                Queue<IBinaryTree<T>> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}
