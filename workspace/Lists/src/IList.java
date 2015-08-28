/**
 * <p>Abstract Data Type for a linear List</p>
 * <p>This interface contains all of the methods that should
 * be implemented by a linear List.</p>
 * <p>Created for CSCI361 at MCLA</p>
 * 
 * @author Mark.Cohen@mcla.edu
 *
 * @param <T> the data type of the elements contained in the list.
 * @param <K> the data type of the key for the elements contained in the list. 
 */
public interface IList<K, T> 
{
	/**
	 * Adds an element to the list. The element will be located
	 * so that the list is in descending order based on 
	 * the keys in the list. Elements in the list with the same key
	 * will be placed next to each, with "newer" elements appearing 
	 * before the older elements. 
	 * @param key - the key associated with the element to be added.
	 * @param item - the element to be added to the list.
	 */
	public void add(K key, T item);
	
	/**
	 * Removes the first element in the list with the specified 
	 * key. 
	 * @param key - the key associated with the element to be removed.
	 * @return true if the element was removed, and false otherwise.
	 */
	public boolean remove(K key);
	
	/**
	 * Searches for the first element in the list with the specified 
	 * key. 
	 * @param key - the key associated with the element to be found.
	 * @return the element, if it was found, and null otherwise.
	 */	
	public T find(K key);
	
	/** 
	 * Determines if the list contains any elements.
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty();
	
	/** 
	 * Determines the number of elements in the list.
	 * @return the number of elements in the list. 
	 */	
	public int getSize();
	
}