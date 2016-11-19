public interface IDictionary<K, V>
{
    /**
     * Inserts a new value into the dictionary using the
     * specified key.  If the key exists, replace the current
     * value with the new one.  Keys are compared using equality
     * rather than identity.
     * @param key the unique identifier for the specified value
     * @param value the value to be inserted into the dictionary
     * @return true if the key existed before the insert, otherwise false
     */
    public boolean insert(K key, V value);

    /**
     * Searches the dictionary for the value with the specified
     * key.  Keys are compared using equality rather than identity.
     * @param key the unique identifier for the value to search for.
     * @return the value associated with the specified key, or null
     * if the key is not in the dictionary
     */
    public V search(K key);

    /**
     * Deletes the value associated with the specified key.
     * Keys are compared using equality rather than identity.
     * @param key the unique identifier for the value to be deleted.
     * @return true if the value is deleted, otherwise false if the key
     * is not in the dictionary
     */
    public boolean delete(K key);
}
