public class BinaryTree<T> implements IBinaryTree<T>
{
  private T m_value;
  private IBinaryTree<T> m_left;
  private IBinaryTree<T> m_right;

  public BinaryTree(T value, IBinaryTree<T> left, IBinaryTree<T> right)
  {
    m_value = value;
    m_left = left;
    m_right = right;
  }

  public BinaryTree(T value)
  {
    this(value, null, null);
  }

  @Override
  public T getValue()
  { return m_value; }

  @Override
  public void setValue(T value)
  { m_value = value; }

  @Override
  public IBinaryTree<T> getLeft()
  { return m_left; }

  @Override
  public void setLeft(IBinaryTree<T> left)
  { m_left = left;}

  @Override
  public IBinaryTree<T> getRight()
  { return m_right; }

  @Override
  public void setRight(IBinaryTree<T> right)
  { m_right = right;}
}
