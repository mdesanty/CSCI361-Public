
public interface ITreeVisitor<T extends Comparable<T>>
{
	public void visit(IBinaryTree<T> tree);
}
