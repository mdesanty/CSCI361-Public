import java.util.*;

public class Main2
{
    private final int N = 3*3;
    private Integer m_square[] = new Integer[N];

    public static void main(String args[])
    {
        new Main2().go();
    }

    private void go()
    {
        List<Integer> nums = new ArrayList<Integer>();
        initNums(nums);
        
        setAtAndRight(0, nums);        
    }

    private void setAtAndRight(int i, List<Integer> nums)
    {            
        if (i == N)
        {
            // terminate when I have set all of the values in the square...
        }
        else if (i < N)
        {
            for (int j = 0; j < N; j++)
            {
                int x = nums.get(j);
                if (x != -1)
                {
                    m_square[i] = x;

                    // recursive call...
                              
                }
            }

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