import java.util.*;

public class Main3
{
    private final int N = 3*3;
    private Integer m_square[] = new Integer[N];

    public static void main(String args[])
    {
        new Main3().go();
    }

    private void go()
    {
        IDataStruct nums = new DataStruct(N);        
        setAtAndRight(0, nums.copyMe());        
    }

    private void setAtAndRight(int i, IDataStruct nums)
    {       
        if (i == N)
        {
            // terminate when I have set all of the values in the square...
        }
        else if (i < N)
        {
            while (nums.hasNext())
            {
                m_square[i] = nums.grabNext();

                // recursive call...

                nums.release();
            }
            nums.release();

            // if I just set the last value test for magic...

        }
    }

    private boolean isMagic()
    {
        boolean yes = true;
   
  
   
        return yes; 
    }

    private String printSquare()
    {
        StringBuffer sb = new StringBuffer();

        return sb.toString();
    }

    private void initNums(List<Integer> nums)
    {

    }
}