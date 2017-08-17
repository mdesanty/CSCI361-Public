import java.util.Iterator;

public class QIteratorTest
{
    public static void main(String[] args)
    {
        QueueLL<Integer> queue = new QueueLL<Integer>();    
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(70);
        
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext())
        {
            int i = it.next();
            System.out.println(i);
        }
        
        System.out.println();
        System.out.println();
        
        for (int i : queue)
        {
            System.out.println(i);
        }
    }
}