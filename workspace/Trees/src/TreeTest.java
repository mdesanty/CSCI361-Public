
public class TreeTest {

	public static void main(String[] args) 
	{	
		/*
		 * 													Tom
		 * 					John												Zander	
		 * 		Andy						Steve							null		null
		 * null 		Betty			Judy		null
		 * 			null	Frank	null	Lucy
		 */
		Tree<String> t1 = new Tree<String>("Tom");
		t1.add("John");
		t1.add("Andy");
		t1.add("Steve");
		t1.add("Zander");
		t1.add("Betty");
		t1.add("Frank");
		t1.add("Judy");
		t1.add("Lucy");
		
		TreeOperations<String> operations = new TreeOperations<String>();
		System.out.println("\nPreorder:");
		operations.preOrderPrint(t1); 
		System.out.println("\nInOrder:");
		operations.inOrderPrint(t1);
		System.out.println("\nsPostOrder:");
		operations.postOrderPrint(t1);
		
		/*
		Preorder:
		Tom John Andy Betty Frank Steve Judy Lucy Zander 
		InOrder:
		Andy Betty Frank John Judy Lucy Steve Tom Zander 
		PostOrder:
		Frank Betty Andy Lucy Judy Steve John Zander Tom 		
		*/
	}

}
