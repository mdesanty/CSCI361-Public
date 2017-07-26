public class Traversal
{
  public static void main(String args[])
  {
      Traversal traversal = new Traversal();
      traversal.go();
  }

  public void go()
  {
    IBinaryTree<String> tree = buildTree();

    System.out.println("Preorder traversal:");
    preorder(tree);

    System.out.println("Inorder traversal:");
    inorder(tree);

    System.out.println("Postorder traversal:");
    postorder(tree);
  }

  private IBinaryTree<String> buildTree()
  {
    // this should build and return a tree that looks like this:
    //
    //                              Root
    //          Inner-1                           Inner-2
    //  Leaf-1           Leaf-2           Leaf-3           Leaf-4
    //

    return null; // should return the root of the tree here...
  }

  private void preorder(IBinaryTree<String> tree)
  {
    // this should print:
    /*
      Root
      Inner-1
      Leaf-1
      Leaf-2
      Inner-2
      Leaf-3
      Leaf-4
    */
  }

  private void inorder(IBinaryTree<String> tree)
  {
    // this should print:
    /*
      Leaf-1
      Inner-1
      Leaf-2
      Root
      Leaf-3
      Inner-2
      Leaf-4
    */
  }

  private void postorder(IBinaryTree<String> tree)
  {
    // this should print:
    /*
      Leaf-1
      Leaf-2
      Inner-1
      Leaf-3
      Leaf-4
      Inner-2
      Root
    */
  }

}
