public class SimpleTree implements Comparable<SimpleTree>
{
    private String m_value;
    private SimpleTree m_left;
    private SimpleTree m_right;
    
    public SimpleTree(String value)
    {
        m_value = value;
        m_left = null;
        m_right = null;
    }

    public SimpleTree(String value, 
                      SimpleTree left, 
                      SimpleTree right)
    {
        m_value = value;
        m_left = left;
        m_right = right;
    }
    
    public SimpleTree getLeft()
    {
        return m_left;  
    }

    public SimpleTree getRight()
    {
        return m_right;
    }

    public String getValue()
    {
        return m_value;
    }
    
    public void setLeft(SimpleTree left)
    {
        m_left = left;
    }

    public void setRight(SimpleTree right)
    {
        m_right = right;
    }        

    public void setVale(String value)
    {
        m_value = value;
    }
    
    @Override
    public String toString()
    {
        StringBuffer buf = new StringBuffer();
        inorder(buf);
        return buf.toString();
    }
    
    public void inorder(StringBuffer buf)
    {
        if (m_left != null)
            m_left.inorder(buf);
        
        buf.append("\n"+ m_value);
        
        if (m_right != null)
            m_right.inorder(buf);
    }

    public void preorder(StringBuffer buf)
    {
        buf.append("\n"+ m_value);
        
        if (m_left != null)
            m_left.preorder(buf);
        
        if (m_right != null)
            m_right.preorder(buf);
    }

    public void postorder(StringBuffer buf)
    {
        if (m_left != null)
            m_left.postorder(buf);
        
        if (m_right != null)
            m_right.postorder(buf);

        buf.append("\n"+ m_value);
    }

    @Override
    public int compareTo(SimpleTree other)
    {
        return m_value.compareTo(other.m_value);
    }
    
}