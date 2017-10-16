public class Scope
{
    public static void main(String[] args)
    {
        Scope s = new Scope();
        s.crazy(3);
    }
    
    private int a;
    private int b;
    
    public Scope()
    {
        int x = 10;
        a = x + 10;
        b = x + 20;
    }
    
    public void crazy(int l)
    {
        int j = 5;
        for (int c = 0; c < j; c++)
        {
            System.out.println(a+b+l);
        }
        
        {
            int y = 100;
            System.out.println(y+2);
        }
    }
}