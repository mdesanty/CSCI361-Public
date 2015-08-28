
public class BinaryTreeTest 
{
	public static void main(String[] args) 
	{
		IBinaryTree<Integer> tree = buildTree();
        check(tree, 7, 10, 17, 2);

		check(tree.delete(2));
		check(tree.search(2) == null);
		check(tree.delete(5));
		check(tree.search(5) == null);
        check(tree, 5, 10, 17, 7);

        check(tree.delete(17));
        check(tree.search(17) == null);
        check(tree.delete(15));
        check(tree.search(15) == null);
        check(tree, 3, 10, 12, 7);
		 
		tree = buildTree();
		check(tree.delete(10));
		check(tree.search(10) == null);
		check(tree.delete(5));
		check(tree.search(5) == null);
		check(tree.delete(17));
		check(tree.search(17) == null);
        check(tree, 4, 7, 15, 2);

        check(tree.delete(2));
        check(tree.search(2) == null);
        check(tree.delete(7));
        check(tree.search(7) == null);
        check(tree.delete(12));
        check(tree.search(12) == null);
        check(tree, 1, 15, 15, 15);
        
		tree = buildTree();
        check(tree.delete(10));
        check(tree.search(10) == null);
        check(tree.delete(5));
        check(tree.search(5) == null);
        check(tree.delete(15));
        check(tree.search(15) == null);
        check(tree.delete(2));
        check(tree.search(2) == null);
        check(tree.delete(7));
        check(tree.search(7) == null);
        check(tree.delete(12));
        check(tree.search(12) == null);
        check(!tree.delete(17));
        check(tree.search(17).getItem() == 17);
        check(tree, 1, 17, 17, 17);
        
		tree = buildTree();
        check(tree.delete(2));
        check(tree.search(2) == null);
        check(tree.delete(7));
        check(tree.search(7) == null);
        check(tree.delete(12));
        check(tree.search(12) == null);
        check(tree.delete(17));
        check(tree.search(17) == null);
        check(tree.delete(5));
        check(tree.search(5) == null);
        check(tree.delete(15));
        check(tree.search(15) == null);
        check(!tree.delete(10));
        check(tree.search(10).getItem() == 10);
        check(tree, 1, 10, 10, 10);
        
		tree = buildTree();
		check(tree.delete(5));
		check(tree.search(5) == null);
		check(tree.delete(2));
		check(tree.search(2) == null);
		check(tree.delete(7));
		check(tree.search(7) == null);
		check(tree.delete(12));
		check(tree.search(12) == null);
		check(tree.delete(15));
		check(tree.search(15) == null);
        check(tree, 2, 10, 17, 10);
	}
	
	public static IBinaryTree<Integer> buildTree()
	{
		IBinaryTree<Integer> tree = new BinaryTree<Integer>(10);
		tree.insert(5);
		tree.insert(2);
		tree.insert(15);
		tree.insert(7);
		tree.insert(12);
		tree.insert(17);
		
		check(tree.search(5).getItem() == 5);
		check(tree.search(2).getItem() == 2);
		check(tree.search(15).getItem() == 15);
		check(tree.search(7).getItem() == 7);
		check(tree.search(12).getItem() == 12);
		check(tree.search(17).getItem() == 17);
		check(tree.search(99) == null);
		
		return tree;
	}

	public static void check(IBinaryTree<Integer> tree, int count, int root, int max, int min)
	{
		System.out.println("breadth first");
        tree.breadthFirstOrder(new NodePrinter<Integer>());
        System.out.println();

		NodeCounter<Integer> counter = new NodeCounter<Integer>();
		tree.inorder(counter);
		check(counter.getCount() == count);
		check(tree.getItem() == root);
		check(tree.max().getItem() == max);
		check(tree.min().getItem() == min);
	}
	
	public static void check(boolean test)
	{
		if (!test)
			throw new AssertionError("Test failed!");
	}
}
