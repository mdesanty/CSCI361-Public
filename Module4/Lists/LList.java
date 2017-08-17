import java.util.Iterator;
import java.util.NoSuchElementException;

// items that should be reviewed before going over this code are
// comparable and comparator...
public class LList<K extends Comparable<K>, T> implements IList<K, T>, Iterable<T>
{
	private Node m_head;
	private int m_count;

	public LList()
	{
		m_head = new Node(null, null);
		m_count = 0;
	}

	@Override
	public void add(K key, T item)
	{
		// linear time O(n)
		
		Node n = new Node(key, item);
		Node loc = _findInsertLoc(key);
		Node temp = loc.m_next;
		loc.m_next = n;
		n.m_next = temp;
		m_count++;
	}

	@Override
	public boolean remove(K key)
	{
		// linear time O(n)
		
		Node loc = _findNodeLoc(key);
		if (loc == null)
		{
			return false;
		}
		else
		{
			loc.m_next = loc.m_next.m_next;
			m_count--;
			return true;
		}
	}

	@Override
	public T find(K key)
	{
		// linear time O(n)
		
		Node n = _findNodeLoc(key);
		if (n != null)
		{
			n = n.m_next;
		}
		if (n == null)
			return null;
		else
			return n.m_data;
	}

	@Override
	public boolean isEmpty()
	{
		return m_count == 0;
	}

	@Override
	public int getSize()
	{
		return m_count;
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer("[");
		if (!isEmpty())
		{
			Node node = m_head.m_next;
			sb.append(node.m_data.toString());
			while (node.m_next != null)
			{
				node = node.m_next;
				sb.append(", ");
				sb.append(node.m_data.toString());
			}
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public Iterator<T> iterator()
	{
		return new LIterator();
	}

	// looks for the location that this key
	// should be placed in the list based on
	// the natural ordering of the kyes,
	// this is used by insert,
	// this actually returns the node before the
	// the locaiton we want to insert because
	// we will use the next pointer to connnect
	// the new node to the list
	private Node _findInsertLoc(K key)
	{
		Node ret = m_head;
		while (ret.m_next != null)
		{
			if (ret.m_next.m_key.compareTo(key) <= 0)
			{
				break;
			}
			ret = ret.m_next;
		}
		return ret;
	}

	// looks for the node with the specified key, used
	// by find and remove, but not insert,
	// this actually returns the node before the
	// the node we are looking for because remove
	// needs to bypass the node it is removing
	private Node _findNodeLoc(K key)
	{
		Node ret = null;
		Node cur = m_head;
		while (cur.m_next != null)
		{
			if (cur.m_next.m_key.compareTo(key) == 0)
			{
				ret = cur;
				break;
			}
			cur = cur.m_next;
		}
		return ret;
	}

	/**
	 * <p>Internal class used to represent a link in a linked list
	 * structure.  Each node in the list contains the element
	 * that was added to the list, the key associated with that element,
	 * and a reference to the next item in the list.</p>
	 */
	private class Node
	{
		private K m_key;
	 	private T m_data;
	 	private Node m_next;

		public Node(K key, T data)
		{
			m_key = key;
			m_data = data;
			m_next = null;
		}
	}

	/**
	 * <p>Internal class used to represent an iterator that
	 * serves up items in the queue one at a time from
	 * the front to the rear.</p>
	 */
	private class LIterator implements Iterator<T>
	{
		private int m_loc = 0;

		@Override
		public boolean hasNext()
		{
			return (m_loc < getSize());
		}

		@Override
		public T next()
		{
			if (m_loc == getSize())
				throw new NoSuchElementException();

			Node cur = m_head;
			for (int i = 0; i <= m_loc; i++)
				cur = cur.m_next;
			m_loc++;
			return cur.m_data;
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}

}
