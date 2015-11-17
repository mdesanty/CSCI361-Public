
public class BinarySearchTreeOperations<T extends Comparable<T>> 
{
	public void preOrderPrint(BinarySearchTree<T> tree)
	{
		System.out.print(tree.getData() + " ");
		if (tree.getLeft() != null)
			preOrderPrint(tree.getLeft());
		if (tree.getRight() != null)
			preOrderPrint(tree.getRight());
	}
	
	public void inOrderPrint(BinarySearchTree<T> tree)
	{
		if (tree.getLeft() != null)
			inOrderPrint(tree.getLeft());
		System.out.print(tree.getData() + " ");
		if (tree.getRight() != null)
			inOrderPrint(tree.getRight());		
	}
	
	public void postOrderPrint(BinarySearchTree<T> tree)
	{
		if (tree.getLeft() != null)
			postOrderPrint(tree.getLeft());
		if (tree.getRight() != null)
			postOrderPrint(tree.getRight());
		System.out.print(tree.getData() + " ");
	}
	
}
