
public class BSTTest {

	public static void main(String[] args) 
	{	
		BST<Integer> t1 = buildTree();
		
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nPostOrder:");
		t1.postOrderPrint();
		
		System.out.println("\n\nLooking for 12, found " + t1.findTree(12));  
		System.out.println("Looking for 11, found " + t1.findTree(11));
		System.out.println("Looking for 99, found " + t1.findTree(99));
		
		System.out.println("\n\nDelete leaf 3");
		t1.deleteTree(t1.findTree(3));
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nPostOrder:");
		t1.postOrderPrint();
		
		System.out.println("\n\nDelete 5 -- just child to left");
		t1 = buildTree();
		t1.deleteTree(t1.findTree(5));
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nPostOrder:");
		t1.postOrderPrint();
		
		System.out.println("\n\nDelete 17 -- just child to right");
		t1 = buildTree();
		t1.deleteTree(t1.findTree(17));
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nPostOrder:");
		t1.postOrderPrint();

		System.out.println("\n\nDelete 15 -- child to left and right");
		t1 = buildTree();
		t1.deleteTree(t1.findTree(15));
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nPostOrder:");
		t1.postOrderPrint();
	}
	
	public static BST<Integer> buildTree()
	{
		BST<Integer> t1 = new BST<Integer>(10);
		t1.add(5);
		t1.add(15);
		t1.add(3);
		t1.add(12);
		t1.add(17);
		t1.add(11);
		t1.add(14);
		t1.add(13);
		t1.add(18);
		return t1;
	}

}
