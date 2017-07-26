/**
 * <p>Abstract Data Type for a Queue linear list</p>
 * <p>This interface contains all of the methods that should
 * be implemented by a Queue linear list.</p>
 * <p>Created for CSCI361 at MCLA</p>
 * 
 * @author Mark.Cohen@mcla.edu
 *
 * @param <T> the data type of the elements contained in the queue. 
 */
public interface IQueue<T>
{
	/**
	 * Adds an element to the rear of the queue. 
	 * @param item - the element to be added to the end of the queue.
	 */
	public void enqueue(T item);
	
	/**
	 * Removes the element at the front of the queue (fifo). 
	 * @return the element that was removed from the queue.
	 * @throws IllegalStateException if the queue is empty. 
	 */	
	public T dequeue();
	
	
	/** 
	 * Determines if the queue contains any elements.
	 * @return true if the queue is empty, false otherwise. 
	 */
	public boolean isEmpty();
	
	/** 
	 * Determines the number of elements in the queue.
	 * @return the number of elements in the queue. 
	 */	
	public int getSize();
}