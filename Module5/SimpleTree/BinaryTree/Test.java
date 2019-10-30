import java.util.*;

public class Test
{
    public static void main(String args[])
    {
        /*
                A
            B       C
         D     E       F
        */
        BinaryTree<String> treeD = new BinaryTree<String>("D");
        BinaryTree<String> treeE = new BinaryTree<String>("E");
        BinaryTree<String> treeF = new BinaryTree<String>("F");
        BinaryTree<String> treeB = new BinaryTree<String>("B", treeD, treeE);
        BinaryTree<String> treeC = new BinaryTree<String>("C", null, treeF);
        BinaryTree<String> root = new BinaryTree<String>("A", treeB, treeC);

        BinaryTree.IVisitor<String> visitor = new BinaryTree.IVisitor<String> ()
            {
                public void visit(String value)
                {
                    System.out.printf("Visiting %s ...%n", value);
                }
            };        

        // D B E A C F
        root.inorder(visitor);
        root.preorder(visitor);
        root.postorder(visitor);
    }
}
