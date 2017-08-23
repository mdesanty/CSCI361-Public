
public class StackTreeTest 
{

	public static void main(String[] args)
	{
		StackLL<Integer> s1 = new StackLL<Integer>();
		StackLL<Integer> s2 = new StackLL<Integer>();
		StackLL<Integer> s3 = new StackLL<Integer>();

        s1.push(7);
        s1.push(2);
        
        s2.push(4);
        s2.push(12);
        
        s3.push(9);
        s3.push(1);
        
		BST<StackLL<Integer>> tree = new BST<StackLL<Integer>>(s1);
		tree.add(s2);
		tree.add(s3);
		
		tree.inOrderPrint();
	}

}
