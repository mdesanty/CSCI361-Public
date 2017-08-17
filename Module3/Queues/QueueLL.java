import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p>Concrete class for a Queue that is backed by a 
 * linked list structure.</p>
 * <p>Created for CSCI361 at MCLA</p>
 * 
 * @author Mark.Cohen@mcla.edu
 *
 * @param <T> the data type of the elements contained in the Queue. 
 */
public class QueueLL<T> implements IQueue<T>, Iterable<T>
{
	private Node m_head;
	private int m_count;
	
	public QueueLL()
	{
		m_head = new Node(null);
		m_count = 0;
	}
	
	@Override
	public void enqueue(T item)
	{
		// runs in constant time ...
		
		// FIFO: this queue places new items at the head of the queue
		// and removes items from the tail of the queue...
		
		Node n = new Node(item);
		n.m_next = m_head.m_next;
		m_head.m_next = n;
		m_count++;
	}

	@Override
	public T dequeue()
	{
		// runs in O(n) time
		
		// FIFO: this queue places new items at the head of the queue
		// and removes items from the tail of the queue...
		
		if (isEmpty())
			throw new IllegalStateException("dequeue error: queue is empty!");
		
		T ret = null;
		Node cur = m_head;
		
		// while not at the tail...
		while (cur.m_next != null)
		{
			// if I am at the second from the tail of the queue...
			if (cur.m_next.m_next == null)
			{
				// grab the data from the last item in the queue...
				ret = cur.m_next.m_data;
				
				// detatch the last item in the queue...
				cur.m_next = null;
				
				break;
			}
			else
			{
				// otherwise, continue moving towards the tail of the queue...
				cur = cur.m_next;
			}
		}
		
		m_count--;
		return ret;
	}

	@Override
	public boolean isEmpty()
	{ 
		return getSize() == 0;
	}
	
	@Override
	public int getSize()
	{
		return m_count;
	}
	
	@Override
	public String toString()
	{	
		// runs in linear time...
		
		StringBuffer sb = new StringBuffer("rear->");
		if (!isEmpty())
		{
			Node node = m_head.m_next;
			sb.append(node.m_data.toString());
			while (node.m_next != null)
			{
				node = node.m_next;
				sb.append("->");
				sb.append(node.m_data.toString());
			}
		}
		return sb.toString();
	}

	@Override
	public Iterator<T> iterator() 
	{
		return new QIterator();
	}

	/**
	 * <p>Internal class used to represent a link in a linked list
	 * structure.  Each node in the list contains the element 
	 * that was added to the queue, as well as a reference to the
	 * next item in the queue.</p>  
	 */
	private class Node
	{
	 	private T m_data;
	 	private Node m_next;
		
		public Node(T data)
		{
			m_data = data;
			m_next = null;
		}
	}

	/**
	 * <p>Internal class used to represent an iterator that
	 * serves up items in the queue one at a time from 
	 * the front to the rear.</p>  
	 */
	private class QIterator implements Iterator<T>
	{
		// the iterator starts at the tail...
		private int m_loc = getSize();
		
		@Override
		public boolean hasNext() 
		{
			// there is next as long as I am not at past the head...
			return (m_loc > 0);
		}

		@Override
		public T next() 
		{
			if (m_loc == 0)
				throw new NoSuchElementException();
			
			// move to the current Node...
			Node cur = m_head;
			for (int i = 0; i < m_loc; i++)
				cur = cur.m_next;
			
			// decrement the current index....
			m_loc--;
			
			// return the data for the current item...
			return cur.m_data;
		}

		@Override
		public void remove() {
			// this iterator does not allow the removal of items...
			throw new UnsupportedOperationException();			
		}
	}
}