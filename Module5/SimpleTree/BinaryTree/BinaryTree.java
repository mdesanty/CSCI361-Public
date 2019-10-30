public class BinaryTree<T extends Comparable<T>> implements Comparable<BinaryTree<T>>
{
    private T m_value;
    private BinaryTree<T> m_left;
    private BinaryTree<T> m_right;
    
    public BinaryTree(T value)
    {
        m_value = value;
        m_left = null;
        m_right = null;
    }

    public BinaryTree(T value, 
                      BinaryTree<T> left, 
                      BinaryTree<T> right)
    {
        m_value = value;
        m_left = left;
        m_right = right;
    }
    
    public BinaryTree<T> getLeft()
    {
        return m_left;  
    }

    public BinaryTree<T> getRight()
    {
        return m_right;
    }

    public T getValue()
    {
        return m_value;
    }
    
    public void setLeft(BinaryTree<T> left)
    {
        m_left = left;
    }

    public void setRight(BinaryTree<T> right)
    {
        m_right = right;
    }        

    public void setVale(T value)
    {
        m_value = value;
    }
    
    @Override
    public String toString()
    {
        return m_value.toString();
    }
    
    public void inorder(IVisitor<T> visitor)
    {
        if (m_left != null)
            m_left.inorder(visitor);
        
        visitor.visit(m_value);
        
        if (m_right != null)
            m_right.inorder(visitor);
    }

    public void preorder(IVisitor<T> visitor)
    {
        visitor.visit(m_value);
        
        if (m_left != null)
            m_left.preorder(visitor);
        
        if (m_right != null)
            m_right.preorder(visitor);
    }

    public void postorder(IVisitor<T> visitor)
    {
        if (m_left != null)
            m_left.postorder(visitor);
        
        if (m_right != null)
            m_right.postorder(visitor);

        visitor.visit(m_value);
    }

    @Override
    public int compareTo(BinaryTree<T> other)
    {
        return m_value.compareTo(other.m_value);
    }
    
    public interface IVisitor<T>
    {
        public void visit(T value);
    }
}