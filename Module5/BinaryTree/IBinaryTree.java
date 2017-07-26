public interface IBinaryTree<T>
{
  public T getValue();

  public void setValue(T value);

  public IBinaryTree<T> getLeft();

  public void setLeft(IBinaryTree<T> left);

  public IBinaryTree<T> getRight();

  public void setRight(IBinaryTree<T> right);
}
