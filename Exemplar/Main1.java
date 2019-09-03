import java.util.*;

public class Main1
{
    private Integer m_square[] = {-1, -2, -3, -1, -2, -3, -1, -2, -3} ;

    public static void main(String args[])
    {
        new Main1().go();
    }

    private void go()
    {
        List<Integer> nums = new ArrayList<Integer>();
        initNums(nums);
        while (!isMagic())
        {
            Collections.shuffle(nums);
            for (int i = 0; i < 9; i++)
                m_square[i] =  nums.get(i);
        }
        printSquare();
    }

    private boolean isMagic()
    {
        boolean yes = true;
   
        int total = m_square[0] + m_square[1] + m_square[2];
        yes = yes && (m_square[3] + m_square[4] + m_square[5] == total);
        yes = yes && (m_square[6] + m_square[7] + m_square[8] == total);
   
        yes = yes && (m_square[0] + m_square[3] + m_square[6] == total);
        yes = yes && (m_square[1] + m_square[4] + m_square[7] == total);
        yes = yes && (m_square[2] + m_square[5] + m_square[8] == total);
   
        yes = yes && (m_square[0] + m_square[4] + m_square[8] == total);  
   
        yes = yes && (m_square[2] + m_square[4] + m_square[6] == total);   
   
        return yes; 
    }

    private void printSquare()
    {
        for (int i = 0; i < 9; i++)
        {
            if (i%3 == 0)            
                System.out.println();
            System.out.printf("%s ", m_square[i]);            
        }
        System.out.println();
    }

    private void initNums(List<Integer> nums)
    {
        nums.clear();
        for (int i = 1; i < 10; i++)
            nums.add(i);
    }
}