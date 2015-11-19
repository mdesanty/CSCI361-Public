
public class BSTTest {

	public static void main(String[] args) 
	{	
		/*
		 * 													Tom
		 * 					John												Zander	
		 * 		Andy						Steve							null		null
		 * null 		Betty			Judy		null
		 * 			null	Frank	null	Lucy
		 */
		BST<String> t1 = new BST<String>("Tom");
		t1.add("John");
		t1.add("Andy");
		t1.add("Steve");
		t1.add("Zander");
		t1.add("Betty");
		t1.add("Frank");
		t1.add("Judy");
		t1.add("Lucy");
		
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nsPostOrder:");
		t1.postOrderPrint();
		
		/*
		Preorder:
		Tom John Andy Betty Frank Steve Judy Lucy Zander 
		InOrder:
		Andy Betty Frank John Judy Lucy Steve Tom Zander 
		PostOrder:
		Frank Betty Andy Lucy Judy Steve John Zander Tom 		
		*/
		
		System.out.println("\n\nLooking for Zander, found " + t1.findTree("Zander"));  
		System.out.println("Looking for Bob, found " + t1.findTree("Bob"));
		
		BST<String> tom = t1.findTree("Tom");
		t1.deleteTree(tom);
		System.out.println("\nPreorder:");
		t1.preOrderPrint(); 
		System.out.println("\nInOrder:");
		t1.inOrderPrint();
		System.out.println("\nsPostOrder:");
		t1.postOrderPrint();
		
	}
	
	

}
