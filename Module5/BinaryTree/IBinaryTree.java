/**
 * <p>Abstract Data Type for a binary tree.</p>
 * <p>This interface contains all of the methods that should
 * be implemented by a binary tree.</p>
 * <p>Created for CSCI361 at MCLA</p>
 * 
 * @author Mark.Cohen@mcla.edu
 *
 * @param <T> the data type of the elements contained in the tree.
 */
public interface IBinaryTree<T>
{
  /**
	 * @return the value of the root of this tree.
	 */
  public T getValue();

	/**
	 * Sets the value of the root of this tree.
	 * @param key - the root node's value.
	 */
  public void setValue(T value);

	/**
	 * @return the left subtree or null if it has no left subtree.
	 */
  public IBinaryTree<T> getLeft();

	/**
	 * Sets the left subtree.
	 * @param key - the left subtree.
	 */
  public void setLeft(IBinaryTree<T> left);

	/**
	 * @return the right subtree or null if it has no right subtree.
	 */
  public IBinaryTree<T> getRight();

	/**
	 * Sets the right subtree.
	 * @param key - the right subtree.
	 */
  public void setRight(IBinaryTree<T> right);
}
