
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
		t1.addData("John");
		t1.addData("Andy");
		t1.addData("Steve");
		t1.addData("Zander");
		t1.addData("Betty");
		t1.addData("Frank");
		t1.addData("Judy");
		t1.addData("Lucy");
		
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
	}

}
